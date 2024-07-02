package controllers;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import interfaces.Creating;
import java.util.Arrays;
import models.creatinglists.CategoriesList;
import models.creatinglists.DaysList;
import models.creatinglists.ExercisesNamesList;
import models.trainingplan.TrainingPlan;

/**
 * Třída sloužící pro manuální tvorbu tréninkových plánů a manipulaci s
 * vybranými cvičeními.
 */
@SessionScoped
@Named("creatingController")
public class CreatingController implements Serializable {

    @EJB
    private Creating creating;

    ArrayList<String[]> exercisesList = new ArrayList<>();
    ArrayList<ArrayList<String[]>> daysListNew = new ArrayList<>();

    public CreatingController() {
    }

    @PostConstruct
    public void init() {
        creating.init();
    }

    public String createExercises() throws SQLException {
        CategoriesList categoriesList = new CategoriesList();

        for (String[] exercises : exercisesList) {
            categoriesList.add(new ExercisesNamesList(exercises));
        }

        creating.createExercises(categoriesList);

        return "creator_exercises";
    }

    /**
     * Metoda pro vytvoření plánu cvičení.
     */
    public String create() {
                DaysList daysList = new DaysList();

        for (int i = 0; i < daysListNew.size(); i++) {
            // Získejte seznam ArrayList<String[]> pro daný den
            ArrayList<String[]> exercisesList = daysListNew.get(i);

            // Vytvořte novou instanci CategoriesList
            CategoriesList categoriesList = new CategoriesList();

            // Projděte seznam ArrayList<String[]> a přidejte cviky do CategoriesList
            for (int j = 0; j < exercisesList.size(); j++) {
                String[] exercises = exercisesList.get(j);
                categoriesList.add(new ExercisesNamesList(exercises));
            }

            // Přidejte CategoriesList do daysList
            daysList.add(categoriesList);
        }
        
        creating.createPlan(daysList);

        return "plan";
    }

    public boolean isItTrainingDay(int nthDay) {

        /*System.out.print(nthDay + " --- ");
        System.out.println(creating.isItTrainingDay(nthDay));*/
        return creating.isItTrainingDay(nthDay);
    }

    public int howManyCategoriesHaveNthDay(int nthDay) {
        return creating.howManyCategoriesHaveNthDay(nthDay);
    }

    public String createCategories() {
        return "creator_categories";
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String[] getAllCategories() {
        return creating.getAllCategories();
    }

    public String getCategoryName(int nthDay, int nthCategory) {
        return creating.getCategoryName(nthDay, nthCategory);
    }

    public String getForwardness() {
        return creating.getForwardness();
    }

    public int getAttendance() {
        return creating.getAttendance();
    }

    /**
     * @return musí být typu ArrayList<String[]> kvůli tomu, že xhtml neumí
     * pracovat s objektem třídy CategoriesList.
     */
    public ArrayList<String[]> getCategories() {
        /*ArrayList<String[]> exercisesList = new ArrayList<>();

        for (ExercisesNamesList exercisesNamesList : creating.getCategories().getCategoriessList()) {
            String[] exercises = exercisesNamesList.getExercisesNamesList();
            exercisesList.add(exercises);
        }*/

        for (int i = 0; i < TrainingPlan.MAX_TRAINING_DAYS; i++) {
            exercisesList.add(null);
        }

        return exercisesList;
    }

    /*public ArrayList<String[]> getCategories() {
        return creating.getCategories();
    }*/
    /**
     * @param categories musí být typu ArrayList<String[]> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy CategoriesList.
     */
    /*public void setCategories(ArrayList<String[]> categories) {
        CategoriesList categoriesList = new CategoriesList();

        for (String[] exercises : categories) {
            categoriesList.add(new ExercisesNamesList(exercises));
        }

        creating.setCategories(categoriesList);
    }*/
    public String[] getExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory) {
        return creating.getExercisesOfNthCategoryOfNthDay(nthDay, nthCategory).getExercisesNamesList();
    }

    /*public String[] getSelectedExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory) {

        return creating.getSelectedExercisesOfNthCategoryOfNthDay(nthDay, nthCategory).toArray(new String[0]);

    }*/
    /**
     * @return musí být typu ArrayList<ArrayList<String[]>> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy SelectedExercisesList.
     */
    public ArrayList<ArrayList<String[]>> getSelectedExercises() {

        /*ArrayList<ArrayList<String[]>> daysListNew = new ArrayList<>();

        for (int i = 0; i < creating.getSelectedExercises().size(); i++) {
            // Získejte seznam kategorií pro daný den
            CategoriesList categoriesList = creating.getSelectedExercises().getCategoriesOfNthDay(i);

            // Vytvořte nový ArrayList pro seznam cviků
            ArrayList<String[]> exercisesList = new ArrayList<>();

            // Projděte seznam kategorií a získejte názvy cviků
            for (int j = 0; j < categoriesList.size(); j++) {
                String[] exercises = categoriesList.getExercisesOfNthTrainingDay(j).getExercisesNamesList();
                exercisesList.add(exercises);
            }

            // Přidejte seznam cviků pro daný den do nové instance
            daysListNew.add(exercisesList);
        }*/
        for (int i = 0; i < TrainingPlan.MAX_TRAINING_DAYS; i++) {
            daysListNew.add(new ArrayList<>());

            for (int u = 0; u < TrainingPlan.MAX_NUMBER_OF_CATEGORIES; u++) {
                daysListNew.get(i).add(null);
            }
        }

        return daysListNew;
    }

    /**
     * @param selectedExercises musí být typu ArrayList<ArrayList<String[]>>
     * kvůli tomu, že xhtml neumí pracovat s objektem třídy
     * SelectedExercisesList.
     */
    /*public void setSelectedExercises(ArrayList<ArrayList<String[]>> selectedExercises) {

        DaysList daysList = new DaysList();

        for (int i = 0; i < selectedExercises.size(); i++) {
            // Získejte seznam ArrayList<String[]> pro daný den
            ArrayList<String[]> exercisesList = selectedExercises.get(i);

            // Vytvořte novou instanci CategoriesList
            CategoriesList categoriesList = new CategoriesList();

            // Projděte seznam ArrayList<String[]> a přidejte cviky do CategoriesList
            for (int j = 0; j < exercisesList.size(); j++) {
                String[] exercises = exercisesList.get(j);
                categoriesList.add(new ExercisesNamesList(exercises));
            }

            // Přidejte CategoriesList do daysList
            daysList.add(categoriesList);
        }

        creating.setSelectedExercises(daysList);
    }*/
    // </editor-fold>
}
