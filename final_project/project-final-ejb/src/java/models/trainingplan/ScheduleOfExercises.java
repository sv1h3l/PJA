package models.trainingplan;

import java.util.ArrayList;

public class ScheduleOfExercises {

    private ArrayList<Exercise> scheduleOfExercises;

    public ScheduleOfExercises() {
        scheduleOfExercises = new ArrayList<>();
    }

    public ArrayList<Exercise> getScheduleOfExercises() {
        return scheduleOfExercises;
    }

    public void setScheduleOfExercises(ArrayList<Exercise> scheduleOfExercises) {
        this.scheduleOfExercises = scheduleOfExercises;
    }
    
    public void addExercise(Exercise exercise) {
        scheduleOfExercises.add(exercise);
    }
    
    public Exercise getExercise(int nthExercise)
    {
        return scheduleOfExercises.get(nthExercise);
    }
}
