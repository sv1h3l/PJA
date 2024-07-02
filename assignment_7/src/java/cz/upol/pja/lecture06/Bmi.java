package cz.upol.pja.lecture06;

public class Bmi {

    private String weight;
    private String height;
    private double bmi;

    public Bmi() {
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
        if (weight != null && height != null) {
            try {
                double weightValue = Double.parseDouble(weight);
                double heightValue = Double.parseDouble(height) / 100;
                if (heightValue > 0) {
                    bmi = weightValue / (heightValue * heightValue);
                    return bmi;
                }
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    public String calculateCategory() {
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
