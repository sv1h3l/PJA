package models.creatinglists;

import java.util.ArrayList;

public class ExercisesNamesList {

    private String[] exercisesNamesList;

    public ExercisesNamesList() {
        this.exercisesNamesList = null;
    }

    public ExercisesNamesList(String[] exercisesNamesList) {
        this.exercisesNamesList = exercisesNamesList;
    }

    public ExercisesNamesList(ArrayList<String> exercisesNamesList) {
        this.exercisesNamesList = arrayListToStringArray(exercisesNamesList);
    }

    public int length() {
        return exercisesNamesList.length;
    }

    public String[] getExercisesNamesList() {
        return exercisesNamesList;
    }

    public void setExercisesNamesList(String[] exercisesNamesList) {
        this.exercisesNamesList = exercisesNamesList;
    }

    public String getConcreteExerciseName(int nthExercise) {
        return exercisesNamesList[nthExercise];
    }

    public static String[] arrayListToStringArray(ArrayList<String> exercisesNamesList) {
        return exercisesNamesList.toArray(String[]::new);
    }
}
