package models.creatinglists;

import models.trainingplan.TrainingPlan;
import interfaces.Database;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaysList {

    /**
     * Atribut selectedExercises lze chápat jako seznam tréninkových dní,
     * obsahující seznam kategorií. Každý seznam kategorí navíc obsahuje pole
     * názvů cviků, které si cvičící vybral pro tvorbu svého tréninkového plánu.
     */
    private ArrayList<CategoriesList> daysList;

    public DaysList() {
        daysList = new ArrayList<>();
    }

    public final void initializeDaysList() {
        for (int i = 0; i < TrainingPlan.MAX_TRAINING_DAYS; i++) {
            daysList.add(new CategoriesList());

            for (int u = 0; u < TrainingPlan.MAX_NUMBER_OF_CATEGORIES; u++) {
                daysList.get(i).add(null);
            }
        }
    }

    public void createExercises(int attendanceInt, CategoriesList categoriesList, Database db) throws SQLException {
        for (int i = 0; i < attendanceInt; i++) {
            daysList.add(db.getExercises(categoriesList.getExercisesOfNthTrainingDay(i)));
        }
    }

    public void add(CategoriesList categoriesList) {
        daysList.add(categoriesList);
    }

    public int size() {
        return daysList.size();
    }

    public ArrayList<CategoriesList> getDaysList() {
        return daysList;
    }

    public void setDaysList(ArrayList<CategoriesList> daysList) {
        this.daysList = daysList;
    }

    public CategoriesList getCategoriesOfNthDay(int nthDay) {
        return daysList.get(nthDay);
    }

    public ExercisesNamesList getExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory) {
        return daysList.get(nthDay).getExercisesOfNthTrainingDay(nthCategory);
    }
}
