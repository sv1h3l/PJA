package controllers;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import interfaces.Generating;

/**
 * Třída sloužící pro automatickou tvorbu tréninkových plánů.
 */
@SessionScoped
@Named("generatingController")
public class GeneratingController implements Serializable {

    @EJB
    private Generating generating;

    public GeneratingController() {
    }

    /**
     * Metoda pro generování plánu cvičení.
     */
    public String generate() {
        generating.generatePlan();

        return "plan";
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getForwardness() {
        return generating.getForwardness();
    }

    public int getAttendance() {
        return generating.getAttendance();
    }

    public String getTrainingDuration() {
        return generating.getTrainingDuration().getLength();
    }
    // </editor-fold>
}
