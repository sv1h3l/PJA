package beans;

import javax.sql.DataSource;
import jakarta.ejb.Stateless;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import models.trainingplan.Exercise;
import models.enums.ForwardnessEnum;
import models.User;
import interfaces.Database;
import models.creatinglists.CategoriesList;
import models.creatinglists.ExercisesNamesList;
import models.enums.TrainingDurationEnum;

/**
 * Tato třída slouží k práci s databází, konkrétně pro přihlášení uživatele,
 * aktualizaci údajů o uživateli, přidání uživatele, generování cvičení a
 * získání cvičení z databáze.
 */
@Stateless
public class DatabaseBean implements Database {

    private DataSource dataSource;

    public DatabaseBean() throws SQLException {
        try {
            InitialContext context = new InitialContext();

            this.dataSource = (DataSource) context.lookup("jdbc/jpa01");
        } catch (NamingException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized User login(String email, String password) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return getUserFromResultSet(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public synchronized User updateUserAndPassword(String email, String firstName, String secondName, Date dateOfRegistration, String somatotype, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration, String password) {

        String query = "UPDATE users "
                + "SET first_name=?, second_name=?, password=?, somatotype=?, forwardness=?, attendance=?, training_duration=? "
                + "WHERE email = ?";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, secondName);
            pstmt.setString(3, password);
            pstmt.setString(4, somatotype);
            pstmt.setString(5, forwardness.getDifficulty());
            pstmt.setInt(6, attendance); // TODO předělat na int databázi
            pstmt.setString(7, trainingDuration.getLength());
            pstmt.setString(8, email);

            pstmt.executeUpdate();

            return new User(email, password, firstName, secondName, dateOfRegistration, somatotype, forwardness, attendance, trainingDuration);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public synchronized User updateUser(String email, String firstName, String secondName, Date dateOfRegistration, String somatotype, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration, String password) {

        String query = "UPDATE users "
                + "SET first_name=?, second_name=?, somatotype=?, forwardness=?, attendance=?, training_duration=? "
                + "WHERE email = ?";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, secondName);
            pstmt.setString(3, somatotype);
            pstmt.setString(4, forwardness.getDifficulty());
            pstmt.setInt(5, attendance);
            pstmt.setString(6, trainingDuration.getLength());
            pstmt.setString(7, email);

            pstmt.executeUpdate();

            return new User(email, password, firstName, secondName, dateOfRegistration, somatotype, forwardness, attendance, trainingDuration);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public synchronized void addUser(String email, String firstName, String secondName, String somatotype, String forwardness, int attendance, String trainingDuration, String password) {

        String query = "INSERT INTO users (email, first_name, second_name, password, date_of_registration, somatotype, forwardness, attendance, training_duration) VALUES (?, ?, ?, ?, NOW(), ?, ?, ?, ?)";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, email);
            pstmt.setString(2, firstName);
            pstmt.setString(3, secondName);
            pstmt.setString(4, password);
            pstmt.setString(5, somatotype);
            pstmt.setString(6, forwardness);
            pstmt.setInt(7, attendance);
            pstmt.setString(8, trainingDuration);

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized User getUserFromResultSet(ResultSet rs) throws SQLException {
        String email = rs.getString("email");
        String password = rs.getString("password");
        String firstName = rs.getString("first_name");
        String secondName = rs.getString("second_name");
        Date dateOfRegistration = rs.getDate("date_of_registration");
        String somatotype = rs.getString("somatotype");
        ForwardnessEnum forwardness = ForwardnessEnum.getForwardnessEnumFromString(rs.getString("forwardness"));
        int attendance = rs.getInt("attendance");
        TrainingDurationEnum trainingDuration = TrainingDurationEnum.getTrainingDurationEnumFromString(rs.getString("training_duration"));

        return new User(email, password, firstName, secondName, dateOfRegistration, somatotype, forwardness, attendance, trainingDuration);
    }

    /**
     * Metoda pro generování cviku podle náročnosti a délky tréninku.
     */
    public synchronized Exercise getExerciseForPlanGenerating(ForwardnessEnum forwardness, String category, List<String> usedExercises) {
        String query = "SELECT exercise_name, basis_for_increase, increase, unit, basis_for_sets, basis_for_repetitions FROM exercises WHERE difficulty <= ?::integer AND categories = ? ORDER BY RANDOM()";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, forwardness.getId());
            pstmt.setString(2, category);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("exercise_name");

                    if (usedExercises.contains(name)) {
                        continue;
                    }

                    String unit = rs.getString("unit");
                    String sets = rs.getString("basis_for_sets");
                    String repetitions = rs.getString("basis_for_repetitions");

                    int increase = Integer.parseInt(rs.getString("increase")), basisForIncrease = Integer.parseInt(rs.getString("basis_for_increase"));
                    int quantityInt = basisForIncrease + (increase * (forwardness.getId() * 2));

                    String quantity = String.valueOf(quantityInt);

                    return new Exercise(name, category, quantity, unit, sets, repetitions);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Tato metoda slouží k vytvoření seznamu dnů s cvičeními podle vybraných
     * cvičení a náročnosti tréninku.
     */
    public synchronized Exercise getExerciseForPlanCreation(String exerciseName, ForwardnessEnum forwardness) {
        String query = "SELECT exercise_name, categories, basis_for_increase, increase, unit, basis_for_sets, basis_for_repetitions FROM exercises WHERE exercise_name = ?";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, exerciseName);

            try (ResultSet rs = pstmt.executeQuery()) {
                rs.next();

                String name = rs.getString("exercise_name");
                String categories = rs.getString("categories");
                String unit = rs.getString("unit");
                String sets = rs.getString("basis_for_sets");
                String repetitions = rs.getString("basis_for_repetitions");

                int increase = Integer.parseInt(rs.getString("increase")), basisForIncrease = Integer.parseInt(rs.getString("basis_for_increase"));
                int quantityInt = basisForIncrease + (increase * (forwardness.getId() * 2));

                String quantity = String.valueOf(quantityInt);

                return new Exercise(name, categories, quantity, unit, sets, repetitions);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Metoda pro získání cvičení z databáze podle kategorie.
     */
    public synchronized CategoriesList getExercises(ExercisesNamesList categoriesDay) throws SQLException {
        CategoriesList categoriesWithExercises = new CategoriesList();

        for (String category : categoriesDay.getExercisesNamesList()) {
            ArrayList<String> exercises = new ArrayList<>();

            String query = "SELECT exercise_name FROM exercises WHERE categories = ?";

            try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, category);

                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        exercises.add(rs.getString("exercise_name"));
                    }
                }
            }
            categoriesWithExercises.add(new ExercisesNamesList(exercises));
        }

        return categoriesWithExercises;
    }

    /**
     * Metoda pro získání kategorie cvičení z názvu cvičení.
     */
    public synchronized String getCategoryFromExerciseName(String exerciseName) {
        String query = "SELECT categories FROM exercises WHERE exercise_name = ?";

        try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, exerciseName);

            try (ResultSet rs = pstmt.executeQuery()) {
                rs.next();
                return rs.getString("categories");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
