package beans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.trainingplan.TrainingPlan;
import models.trainingplan.TrainingPlans;
import interfaces.ActiveSession;
import interfaces.History;

/**
 * Třída sloužící k zobrazování historie plánů konkrétního uživatele a
 * manipulaci s daty uloženými ve formátu JSON.
 */
@Stateless
public class HistoryBean implements History {

    @EJB
    private ActiveSession activeSession;

    private URL resourceUrl;

    public HistoryBean() {
    }

    @PostConstruct
    public void init() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        resourceUrl = loader.getResource("plans.json");
    }

    public void addPlanToJSON(TrainingPlan plan) {

        TrainingPlans plans = getPlansFromJSON();

        plans.getPlans().add(plan);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter fileWriter = new FileWriter(resourceUrl.getFile())) {
            gson.toJson(plans, fileWriter);
        } catch (IOException ex) {
            Logger.getLogger(HistoryBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removePlanFromJSON(TrainingPlan plan) {

        TrainingPlans plans = getPlansFromJSON();

        plans.removePlan(plan);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter fileWriter = new FileWriter(resourceUrl.getFile())) {
            gson.toJson(plans, fileWriter);
        } catch (IOException ex) {
            Logger.getLogger(HistoryBean.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public TrainingPlans getPlansFromJSON() {
        Gson gson = new GsonBuilder().create();
        TrainingPlans plans = null;

        try (FileReader fileReader = new FileReader(resourceUrl.getFile())) {
            plans = gson.fromJson(fileReader, TrainingPlans.class
            );

        } catch (IOException ex) {
            Logger.getLogger(HistoryBean.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (plans == null) {
            plans = new TrainingPlans();
        }

        return plans;
    }

    public ArrayList<TrainingPlan> getUsersPlans() {
        TrainingPlans allPlans = getPlansFromJSON();

        ArrayList<TrainingPlan> plans = new ArrayList<>();

        for (TrainingPlan plan : allPlans.getPlans()) {
            if (plan.getOwner().equals(activeSession.getUser().getEmail())) {
                plans.add(plan);
            }
        }

        Collections.reverse(plans);

        return plans;
    }

    public void selectPlan(TrainingPlan plan) {
        activeSession.getUser().setPlan(plan);
    }

}
