package models.trainingplan;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Třída představující kolekci plánů cvičení.
 */
public class TrainingPlans {

    private ArrayList<TrainingPlan> plans;

    public TrainingPlans() {
        plans = new ArrayList<>();
    }

    public void removePlan(TrainingPlan planForDelete) {
        Iterator<TrainingPlan> iterator = plans.iterator();
        while (iterator.hasNext()) {
            TrainingPlan plan = iterator.next();
            if (plan.getOwner().equals(planForDelete.getOwner())
                    && plan.getDate().equals(planForDelete.getDate())
                    && plan.getAttendance() == (planForDelete.getAttendance())
                    && plan.getForwardness().equals(planForDelete.getForwardness())
                    && plan.getTrainingDuration().equals(planForDelete.getTrainingDuration())) {

                iterator.remove();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public ArrayList<TrainingPlan> getPlans() {
        return plans;
    }

    public void setPlans(ArrayList<TrainingPlan> plans) {
        this.plans = plans;
    }
    // </editor-fold>
}
