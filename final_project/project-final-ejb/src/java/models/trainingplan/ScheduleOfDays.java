package models.trainingplan;

import java.util.ArrayList;

public class ScheduleOfDays {

    private ArrayList<ScheduleOfExercises> scheduleOfDays;

    public ScheduleOfDays() {
        scheduleOfDays = new ArrayList<>();
    }

    void createBlankScheduleOfDays() {
        for (int i = 0; i < 7; i++) {
            scheduleOfDays.add(new ScheduleOfExercises());
        }
    }

    public ArrayList<ScheduleOfExercises> getScheduleOfDays() {
        return scheduleOfDays;
    }

    public void setScheduleOfDays(ArrayList<ScheduleOfExercises> scheduleOfDays) {
        this.scheduleOfDays = scheduleOfDays;
    }

    public void add(ScheduleOfExercises scheduleOfExercises) {
        this.scheduleOfDays.add(scheduleOfExercises);
    }

    public ScheduleOfExercises getScheduleOfExercises(int nthDay) {
        return scheduleOfDays.get(nthDay);
    }

    public Exercise getExercise(int nthDay, int nthExercise) {
        return getScheduleOfExercises(nthDay).getExercise(nthExercise);
    }
    
    public void scheduleTheDays(int day, Exercise exercise)
    {
        getScheduleOfExercises(day).addExercise(exercise);
    }
}
