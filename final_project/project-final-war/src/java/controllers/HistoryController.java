package controllers;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import models.trainingplan.TrainingPlan;
import models.trainingplan.TrainingPlans;
import interfaces.History;

/**
 * Třída sloužící k zobrazování historie plánů konkrétního uživatele a
 * manipulaci s daty uloženými ve formátu JSON.
 */
@SessionScoped
@Named("historyController")
public class HistoryController implements Serializable {

    @EJB
    private History history;

    public HistoryController() {
    }

    public void addPlanToJSON(TrainingPlan plan) {
        history.addPlanToJSON(plan);
    }

    public String removePlanFromJSON(TrainingPlan plan) {
        history.removePlanFromJSON(plan);

        return "";
    }

    public TrainingPlans getPlansFromJSON() {
        return history.getPlansFromJSON();
    }

    public ArrayList<TrainingPlan> getUsersPlans() {
        return history.getUsersPlans();
    }

    public String selectPlan(TrainingPlan plan) {
        history.selectPlan(plan);

        return "plan";
    }

}
