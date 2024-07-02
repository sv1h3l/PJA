package models.trainingplan;

/**
 * Tato třída reprezentuje cvičení a uchovává informace o něm, jako je název,
 * kategorie, množství, jednotka, počet sérií a opakování.
 */
public class Exercise {

    private String name;
    private String category;
    private String quantity;
    private String unit;
    private String sets;
    private String repetitions;

    public Exercise(String name, String category, String quantity, String unit, String sets, String repetitions) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.unit = unit;
        this.sets = sets;
        this.repetitions = repetitions;
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(String repetitions) {
        this.repetitions = repetitions;
    }

    // </editor-fold>
}
