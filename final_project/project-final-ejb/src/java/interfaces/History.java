package interfaces;

import jakarta.ejb.Local;
import java.util.ArrayList;
import models.trainingplan.TrainingPlan;
import models.trainingplan.TrainingPlans;

/**
 * Třída sloužící k zobrazování historie plánů konkrétního uživatele a
 * manipulaci s daty uloženými ve formátu JSON.
 */
@Local
public interface History{

    public void addPlanToJSON(TrainingPlan plan);

    public void removePlanFromJSON(TrainingPlan plan);

    public TrainingPlans getPlansFromJSON();

    public ArrayList<TrainingPlan> getUsersPlans();

    public void selectPlan(TrainingPlan plan);

}
