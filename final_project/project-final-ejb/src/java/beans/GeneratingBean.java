package beans;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import models.trainingplan.Exercise;
import models.trainingplan.TrainingPlan;
import interfaces.ActiveSession;
import interfaces.Database;
import interfaces.Generating;
import interfaces.History;
import java.util.ArrayList;
import models.trainingplan.ScheduleOfExercises;
import models.enums.TrainingDurationEnum;

/**
 * Třída sloužící pro automatickou tvorbu tréninkových plánů.
 */
@Stateless
public class GeneratingBean implements Generating {

    @EJB
    private ActiveSession activeSessionBean;

    @EJB
    private History historyBean;

    @EJB
    private Database databaseBean;

    public GeneratingBean() {
    }

    /**
     * Metoda pro generování plánu cvičení.
     */
    public void generatePlan() {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        String formattedDate = currentDate.format(formatter);

        formatter = DateTimeFormatter.ofPattern("HH:mm");
        formattedDate = formattedDate + " v " + currentDate.format(formatter);

        TrainingPlan plan = new TrainingPlan(activeSessionBean.getUser().getEmail(), formattedDate, activeSessionBean.getUser().getForwardness(), activeSessionBean.getUser().getAttendance(), activeSessionBean.getUser().getTrainingDuration());

        plan.scheduleTheDays(createScheduleOfDays(), activeSessionBean.getUser().getAttendance());

        activeSessionBean.getUser().setPlan(plan);

        historyBean.addPlanToJSON(plan);
    }
    
    private ScheduleOfExercises createScheduleOfDays() {
                String[] categories = {"nohy", "záda", "prsa", "přední delty", "střední delty", "zadní delty", "biceps", "triceps", "lýtka", "břicho"};
        List<String> usedExericses = new ArrayList<>();
        ScheduleOfExercises concreteScheduleOfExercises = new ScheduleOfExercises();

        for (String category : categories) {
            for (int i = 0; i < activeSessionBean.getUser().getTrainingDuration().getId(); i++) {
                Exercise exercise = databaseBean.getExerciseForPlanGenerating(activeSessionBean.getUser().getForwardness(), category, usedExericses);
                
                concreteScheduleOfExercises.addExercise(exercise);
                usedExericses.add(exercise.getName());
            }
            
            usedExericses.clear();
        }
        
        return concreteScheduleOfExercises;
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getForwardness() {
        return activeSessionBean.getUser().getForwardness().getDifficulty();
    }

    public int getAttendance() {
        return activeSessionBean.getUser().getAttendance();
    }

    public TrainingDurationEnum getTrainingDuration() {
        return activeSessionBean.getUser().getTrainingDuration();
    }

    // </editor-fold>
}
