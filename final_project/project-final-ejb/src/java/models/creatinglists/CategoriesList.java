package models.creatinglists;

import models.trainingplan.TrainingPlan;
import java.util.ArrayList;

public class CategoriesList {

    /**
     * Atribut categories lze chápat jako seznam tréninkových dní, kde každý den
     * obsahuje pole kategorií tréninkových partií. Slouží k uchování informace,
     * jaké kategorie cvičící chce v daný den provádět.
     */
    private ArrayList<ExercisesNamesList> categoriesList;

    public CategoriesList() {
        this.categoriesList = new ArrayList<>();
    }

    public CategoriesList(ExercisesNamesList exercisesNamesList) {
        this.categoriesList = new ArrayList<>();
    }

    public void clearCategoriesList() {
        categoriesList.clear();

    }

    public void clearCategoriesListAndInitialize() {
        categoriesList.clear();

        initializeCategoriesListForCreator();
    }

    public final void initializeCategoriesListForCreator() {
        for (int i = 0; i < TrainingPlan.MAX_TRAINING_DAYS; i++) {
            categoriesList.add(new ExercisesNamesList());
        }
    }

    public ArrayList<ExercisesNamesList> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(ArrayList<ExercisesNamesList> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public void add(ExercisesNamesList exercisesList) {
        categoriesList.add(exercisesList);
    }

    public int size() {
        return categoriesList.size();
    }

    public ExercisesNamesList getExercisesOfNthTrainingDay(int nthCategory) {
        return categoriesList.get(nthCategory);
    }

    public String getConcreteExerciseName(int nthCategory, int nthExercise) {
        return getExercisesOfNthTrainingDay(nthCategory).getConcreteExerciseName(nthExercise);
    }

    public int howManyExercisesHaveNthDay(int nthDay) {
        ExercisesNamesList exercises = getExercisesOfNthTrainingDay(nthDay);
        if (exercises.getExercisesNamesList() == null) {
            return -1;
        } else {
            return exercises.length() - 1;
        }
    }
}
