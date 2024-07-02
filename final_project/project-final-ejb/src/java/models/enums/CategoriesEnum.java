package models.enums;

public enum CategoriesEnum {
    LEGS("nohy"),
    BACK("záda"),
    CHEST("prsa"),
    FRONT_DELTS("přední delty"),
    MIDDLE_DELTS("střední delty"),
    REAR_DELTS("zadní delty"),
    BICEPS("biceps"),
    TRICEPS("triceps"),
    CALVES("lýtka"),
    ABDOMEN("břicho");

    private final String value;

    CategoriesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String[] getValuesAsStrings() {
        CategoriesEnum[] categories = CategoriesEnum.values();
        String[] valuesAsStrings = new String[categories.length];

        for (int i = 0; i < categories.length; i++) {
            valuesAsStrings[i] = categories[i].getValue();
        }

        return valuesAsStrings;
    }
}
