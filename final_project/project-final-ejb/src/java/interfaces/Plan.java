package interfaces;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Local;
import models.trainingplan.Exercise;
import models.enums.TrainingDurationEnum;
import models.trainingplan.TrainingPlan;

/**
 * Tato třída slouží k zobrazování tréninkových plánů a k manipulaci s daty
 * plánu.
 */
@Local
public interface Plan {

    @PostConstruct
    public void init();

    public boolean isNewDay();

    public String dayCounter();

    public boolean isNewCategory(Exercise exercise);

    public String showRepetitions(String repetitions);

    public String getQuantity(String quantity, String unit);

    public void resetDate();

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public TrainingPlan getPlan();

    public String getForwardness();

    public int getAttendance();

    public String getActualCategory();

    public void setActualCategory(String actualCategory);

    public TrainingDurationEnum getTrainingDuration();

    public String getDate();

    // </editor-fold>
}
