package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.BmiInt;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named("bmi")
@RequestScoped
public class BmiController {

    @EJB
    private BmiInt bmiInt;
    
    private String weight;
    private String height;
    private double bmi;

    public BmiController() {
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double calculateBMI() {
        bmi = bmiInt.calculateBMI(weight, height);
        return bmi;
    }

    public String calculateCategory() {
        return bmiInt.calculateCategory(bmi);
    }
}
