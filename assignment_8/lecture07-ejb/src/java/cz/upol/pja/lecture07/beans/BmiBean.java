package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.BmiInt;
import cz.upol.pja.lecture07.model.Bmi;
import jakarta.ejb.Stateless;

@Stateless
public class BmiBean implements BmiInt {

    private final Bmi bmi = new Bmi();

    @Override
    public double calculateBMI(String weight, String height) {
        return bmi.calculateBMI(weight, height);
    }

    @Override
    public String calculateCategory(double bmi) {
        return this.bmi.calculateCategory(bmi);
    }
}
