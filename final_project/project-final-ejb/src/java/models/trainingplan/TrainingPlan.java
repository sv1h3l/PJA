package models.trainingplan;

import models.enums.ForwardnessEnum;
import models.enums.TrainingDurationEnum;

/**
 * Třída reprezentuje plán cvičení, který obsahuje informace o vlastníkovi
 * plánu, datu vytvoření, úrovni pokročilosti a účasti na tréninku, délce
 * tréninku a seznamu cvičení rozdělených do dnů.
 */
public class TrainingPlan {

    private String owner;
    private String date;

    private TrainingDurationEnum trainingDuration;
    private ForwardnessEnum forwardness;
    private int attendance;

    public static final int MAX_TRAINING_DAYS = 7;
    public static final int MAX_NUMBER_OF_CATEGORIES = 10;

    private ScheduleOfDays scheduleOfDays;

    public TrainingPlan(String owner, String date, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration) {
        this.owner = owner;
        this.date = date;
        this.forwardness = forwardness;
        this.attendance = attendance;
        this.trainingDuration = trainingDuration;

        scheduleOfDays = new ScheduleOfDays();
    }

    public void scheduleTheDays(ScheduleOfExercises concreteScheduleOfExercises, int numberOfDays) {
        scheduleOfDays.createBlankScheduleOfDays();
        
        String category = concreteScheduleOfExercises.getExercise(0).getCategory();
        int day = 0, mod;

        for (Exercise exercise : concreteScheduleOfExercises.getScheduleOfExercises()) {
            if (!exercise.getCategory().equals(category)) {
                category = exercise.getCategory();
                day++;
            }

            mod = day % numberOfDays;

            scheduleOfDays.scheduleTheDays(mod, exercise);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ForwardnessEnum getForwardness() {
        return forwardness;
    }

    public void setForwardness(ForwardnessEnum forwardness) {
        this.forwardness = forwardness;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public TrainingDurationEnum getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(TrainingDurationEnum trainingDuration) {
        this.trainingDuration = trainingDuration;
    }

    public ScheduleOfDays getScheduleOfDays() {
        return scheduleOfDays;
    }

    public void setScheduleOfDays(ScheduleOfDays days) {
        scheduleOfDays = days;
    }

    // </editor-fold>
}
