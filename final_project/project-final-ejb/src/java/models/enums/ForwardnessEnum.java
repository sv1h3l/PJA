package models.enums;

public enum ForwardnessEnum {
    BEGINNER("začátečník", 1),
    ADVANCED("pokročilý", 2),
    EXPERT("expert", 3);

    private final String difficulty;
    private final int id;

    ForwardnessEnum(String difficulty, int id) {
        this.difficulty = difficulty;
        this.id = id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getId() {
        return id;
    }

    public static String[] getValuesAsStrings() {
        ForwardnessEnum[] forwardness = ForwardnessEnum.values();
        String[] valuesAsStrings = new String[forwardness.length];

        for (int i = 0; i < forwardness.length; i++) {
            valuesAsStrings[i] = forwardness[i].getDifficulty();
        }

        return valuesAsStrings;
    }

    public static ForwardnessEnum getForwardnessEnumFromString(String value) {
        switch (value) {
            case "začátečník":
                return ForwardnessEnum.BEGINNER;
            case "pokročilý":
                return ForwardnessEnum.ADVANCED;
            default:
                return ForwardnessEnum.EXPERT;
        }
    }

}
