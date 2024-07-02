package beans;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import models.trainingplan.Exercise;
import models.trainingplan.TrainingPlan;
import interfaces.ActiveSession;
import interfaces.Plan;
import models.enums.TrainingDurationEnum;

/**
 * Tato třída slouží k zobrazování tréninkových plánů a k manipulaci s daty
 * plánu.
 */
@Stateless
public class PlanBean implements Plan {

    @EJB
    private ActiveSession activeSessionBean;

    private String actualCategory = "";
    private int nthDay = 0;

    public PlanBean() {
    }

    @PostConstruct
    public void init() {
        if (activeSessionBean.isUserLoggedIn()) {
            nthDay = 0;
        }
    }

    public boolean isNewDay() {
        return nthDay < activeSessionBean.getUser().getAttendance();
    }

    public String dayCounter() {
        nthDay++;
        return "DEN " + nthDay;
    }

    public boolean isNewCategory(Exercise exercise) {

        if (getActualCategory().equals(exercise.getCategory())) {
            return false;
        } else {
            setActualCategory(exercise.getCategory());
            return true;
        }
    }

    public String showRepetitions(String repetitions) {
        if (repetitions.equals("0")) {
            return "";
        } else {
            return repetitions;
        }
    }

    public String getQuantity(String quantity, String unit) {
        if (quantity.equals("0")) {
            return "";
        } else {
            return quantity + " " + unit;
        }
    }

    public void resetDate() {
        nthDay = 0;
        actualCategory = "";
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public TrainingPlan getPlan() {
        return activeSessionBean.getUser().getPlan();
    }

    public String getForwardness() {
        return activeSessionBean.getUser().getForwardness().getDifficulty();
    }

    public int getAttendance() {
        return activeSessionBean.getUser().getAttendance();
    }

    public String getActualCategory() {
        return actualCategory;
    }

    public void setActualCategory(String actualCategory) {
        this.actualCategory = actualCategory;
    }

    public TrainingDurationEnum getTrainingDuration() {
        return activeSessionBean.getUser().getPlan().getTrainingDuration();
    }

    public String getDate() {
        return activeSessionBean.getUser().getPlan().getDate();
    }

    // </editor-fold>
}
