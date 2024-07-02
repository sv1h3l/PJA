package controllers;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import models.trainingplan.Exercise;
import models.trainingplan.TrainingPlan;
import interfaces.Plan;
import java.util.ArrayList;
import java.util.List;
import models.trainingplan.ScheduleOfDays;

/**
 * Tato třída slouží k zobrazování tréninkových plánů a k manipulaci s daty
 * plánu.
 */
@SessionScoped
@Named("planController")
public class PlanController implements Serializable {

    @EJB
    private Plan plan;

    public PlanController() {
    }

    @PostConstruct
    public void init() {
        plan.init();
    }

    public boolean isNewDay() {
        return plan.isNewDay();
    }

    public String dayCounter() {
        return plan.dayCounter();
    }

    public boolean isNewCategory(Exercise exercise) {
        return plan.isNewCategory(exercise);
    }

    public String getRepetitions(String repetitions) {
        return plan.showRepetitions(repetitions);
    }

    public String getQuantity(String quantity, String unit) {
        return plan.getQuantity(quantity, unit);
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public TrainingPlan getPlan() {
        return plan.getPlan();
    }

    public String getForwardness() {
        return plan.getForwardness();
    }

    public int getAttendance() {
        return plan.getAttendance();
    }

    public String getActualCategory() {
        return plan.getActualCategory();
    }

    public String getTrainingDuration() {
        return plan.getTrainingDuration().getLength();
    }

    public void resetDate() {
        plan.resetDate();
    }

    public String getDate() {
        return plan.getDate();
    }

    public List<List<Exercise>> getDays() {
        ScheduleOfDays scheduleOfDays = plan.getPlan().getScheduleOfDays();

        List<List<Exercise>> days = new ArrayList<>();

        for (int i = 0; i < scheduleOfDays.getScheduleOfDays().size(); i++) {
            days.add(scheduleOfDays.getScheduleOfExercises(i).getScheduleOfExercises());
        }

        return days;
    }

    // </editor-fold>
}
