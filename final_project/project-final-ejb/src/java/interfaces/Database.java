package interfaces;

import jakarta.ejb.Local;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.List;
import models.creatinglists.CategoriesList;
import models.creatinglists.ExercisesNamesList;
import models.trainingplan.Exercise;
import models.enums.ForwardnessEnum;
import models.enums.TrainingDurationEnum;
import models.User;

/**
 * Tato třída slouží k práci s databází, konkrétně pro přihlášení uživatele,
 * aktualizaci údajů o uživateli, přidání uživatele, generování cvičení a
 * získání cvičení z databáze.
 */
@Local
public interface Database {

    public User login(String email, String password);

    public User updateUserAndPassword(String email, String firstName, String secondName, Date dateOfRegistration, String somatotype, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration, String password);

    public User updateUser(String email, String firstName, String secondName, Date dateOfRegistration, String somatotype, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration, String password);

    public void addUser(String email, String firstName, String secondName, String somatotype, String forwardness, int attendance, String trainingDuration, String password);

    public User getUserFromResultSet(ResultSet rs) throws SQLException;

    /**
     * Metoda pro generování cvičení podle náročnosti a délky tréninku.
     */
    public Exercise getExerciseForPlanGenerating(ForwardnessEnum forwardness, String category, List<String> usedExercises);

    /**
     * Tato metoda slouží k vytvoření seznamu dnů s cvičeními podle vybraných
     * cvičení a náročnosti tréninku.
     */
    //public ScheduleOfDays create(SelectedExercisesList selectedExercises, ForwardnessEnum forwardness);

    public Exercise getExerciseForPlanCreation(String exerciseName, ForwardnessEnum forwardness);

    /**
     * Metoda pro získání cvičení z databáze podle kategorie.
     */
    public CategoriesList getExercises(ExercisesNamesList categoriesDay) throws SQLException;

    /**
     * Metoda pro získání kategorie cvičení z názvu cvičení.
     */
    public String getCategoryFromExerciseName(String exerciseName);

}
