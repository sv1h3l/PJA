package models.enums;

public enum TrainingDurationEnum {
    OWN("vlastní", 1),
    SHORT("krátká", 2),
    MEDIUM("střední", 3),
    LONG("dlouhá", 4);

    private final String length;
    private final int id;

    TrainingDurationEnum(String length, int id) {
        this.length = length;
        this.id = id;
    }

    public String getLength() {
        return length;
    }

    public int getId() {
        return id;
    }

    public static TrainingDurationEnum getTrainingDurationEnumFromString(String value) {
        switch (value) {
            case "krátká":
                return TrainingDurationEnum.SHORT;
            case "střední":
                return TrainingDurationEnum.MEDIUM;
            case "dlouhá":
                return TrainingDurationEnum.LONG;
            default:
                return TrainingDurationEnum.OWN;
        }
    }
}
