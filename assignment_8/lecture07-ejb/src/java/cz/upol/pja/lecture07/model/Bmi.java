package cz.upol.pja.lecture07.model;

public class Bmi {

        public double calculateBMI(String weight, String height) {
        if (weight != null && height != null) {
            try {
                double weightValue = Double.parseDouble(weight);
                double heightValue = Double.parseDouble(height) / 100;
                if (heightValue > 0) {
                    double bmi = weightValue / (heightValue * heightValue);
                    return bmi;
                }
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    public String calculateCategory(double bmi) {
        if (bmi == 0) {
            return "";
        }
 
        double[] thresholds = {16.5, 18.5, 25, 30, 35, 40};
        String[] categories = {"těžká podvýživa", "podváha", "ideální váha", "nadváha", "obezita prvního stupně", "obezita druhého stupně", "obezita třetího stupně"};

        for (int i = 0; i < thresholds.length; i++) {
            if (bmi <= thresholds[i]) {
                return categories[i];
            }
        }

        return "Neznámá kategorie";
    }
}
