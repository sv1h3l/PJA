package cz.upol.pja.lecture07.api;

import jakarta.ejb.Local;

@Local
public interface BmiInt {

    public double calculateBMI(String weight, String height);

    public String calculateCategory(double bmi);

}