package interfaces;

import jakarta.ejb.Local;
import models.enums.TrainingDurationEnum;

/**
 * Třída sloužící pro automatickou tvorbu tréninkových plánů.
 */
@Local
public interface Generating {

    /**
     * Metoda pro generování plánu cvičení.
     */
    public void generatePlan();

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getForwardness();

    public int getAttendance();

    public TrainingDurationEnum getTrainingDuration();
    // </editor-fold>
}
