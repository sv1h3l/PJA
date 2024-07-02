package beans;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import models.enums.CategoriesEnum;
import models.creatinglists.CategoriesList;
import models.trainingplan.ScheduleOfDays;
import models.trainingplan.TrainingPlan;
import interfaces.ActiveSession;
import interfaces.Creating;
import interfaces.Database;
import interfaces.History;
import models.trainingplan.ScheduleOfExercises;
import models.creatinglists.DaysList;
import models.creatinglists.ExercisesNamesList;
import models.enums.TrainingDurationEnum;

/**
 * Třída sloužící pro manuální tvorbu tréninkových plánů a manipulaci s
 * vybranými cvičeními.
 */
@Stateless
public class CreatingBean implements Creating {

    @EJB
    private ActiveSession activeSessionBean;

    @EJB
    private History historyBean;

    @EJB
    private Database databaseBean;

    private CategoriesList categoriesList;
    private ArrayList<String[]> cl;

    private DaysList exercisesForSelectionList;
    private DaysList selectedExercisesList;

    public CreatingBean() {
    }

    @PostConstruct
    public void init() {
        if (activeSessionBean.isUserLoggedIn()) {

            categoriesList = new CategoriesList();
            categoriesList.initializeCategoriesListForCreator();

            
            cl = new ArrayList<>();
            for (int i = 0; i < TrainingPlan.MAX_TRAINING_DAYS; i++) {
                cl.add(null);
            }

            selectedExercisesList = new DaysList();
            selectedExercisesList.initializeDaysList();
        }
    }

    public void createExercises(CategoriesList categoriesList) throws SQLException {
        this.categoriesList = categoriesList;
        exercisesForSelectionList = new DaysList();
        exercisesForSelectionList.createExercises(activeSessionBean.getUser().getAttendance(), categoriesList, databaseBean);
    }

    /**
     * Metoda pro vytvoření plánu cvičení.
     */
    public void createPlan(DaysList daysList) {
        this.selectedExercisesList = daysList;
        
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        String formattedDate = currentDate.format(formatter);

        formatter = DateTimeFormatter.ofPattern("HH:mm");
        formattedDate = formattedDate + " v " + currentDate.format(formatter);

        TrainingPlan plan = new TrainingPlan(activeSessionBean.getUser().getEmail(), formattedDate, activeSessionBean.getUser().getForwardness(), activeSessionBean.getUser().getAttendance(), TrainingDurationEnum.OWN);

        plan.setScheduleOfDays(createScheduleOfDays());
        activeSessionBean.getUser().setPlan(plan);

        historyBean.addPlanToJSON(plan);
    }

    private ScheduleOfDays createScheduleOfDays() {
        ScheduleOfDays concreteScheduleOfDays = new ScheduleOfDays();

        for (CategoriesList day : selectedExercisesList.getDaysList()) {

            ScheduleOfExercises concreteScheduleOfExercises = new ScheduleOfExercises();

            for (ExercisesNamesList category : day.getCategoriesList()) {
                if (category.getExercisesNamesList() == null) {
                    continue;
                }

                for (String exercise : category.getExercisesNamesList()) {
                    concreteScheduleOfExercises.addExercise(databaseBean.getExerciseForPlanCreation(exercise, activeSessionBean.getUser().getForwardness()));
                }
            }

            concreteScheduleOfDays.add(concreteScheduleOfExercises);
        }

        return concreteScheduleOfDays;
    }

    public boolean isItTrainingDay(int nthDay) {
        if (nthDay > activeSessionBean.getUser().getAttendance()) {
            return false;
        } else {
            return true;
        }
    }

    public int howManyCategoriesHaveNthDay(int nthDay) {
        return categoriesList.howManyExercisesHaveNthDay(nthDay);
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String[] getAllCategories() {
        return CategoriesEnum.getValuesAsStrings();
    }

    public String getCategoryName(int nthDay, int nthCategory) {
        return categoriesList.getConcreteExerciseName(nthDay, nthCategory);
    }

    public String getForwardness() {
        return activeSessionBean.getUser().getForwardness().getDifficulty();
    }

    public int getAttendance() {
        return activeSessionBean.getUser().getAttendance();
    }

    /**
     * @return musí být typu ArrayList<String[]> kvůli tomu, že xhtml neumí
     * pracovat s objektem třídy CategoriesList.
     */
    /*public ArrayList<String[]> getCategories() {
        return cl;
    }*/

    public CategoriesList getCategories() {
        return categoriesList;
    }
    /**
     * @param categories musí být typu ArrayList<String[]> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy CategoriesList.
     */
    public void setCategories(CategoriesList categories) {
        categoriesList = categories;
    }

    public ExercisesNamesList getExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory) {
        return exercisesForSelectionList.getExercisesOfNthCategoryOfNthDay(nthDay, nthCategory);
    }

    public ExercisesNamesList getSelectedExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory) {
        return selectedExercisesList.getExercisesOfNthCategoryOfNthDay(nthDay, nthCategory);
    }

    /**
     * @return musí být typu ArrayList<ArrayList<String[]>> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy DaysList.
     */
    public DaysList getSelectedExercises() {
        return selectedExercisesList;
    }

    /**
     * @param selectedExercises musí být typu ArrayList<ArrayList<String[]>>
     * kvůli tomu, že xhtml neumí pracovat s objektem třídy DaysList.
     */
    public void setSelectedExercises(DaysList selectedExercises) {
        selectedExercisesList = selectedExercises;
    }

    // </editor-fold>
}
