package validators;

public class MethodsForValidators {

    public static synchronized boolean checkEmptiness(String value) {
        if (value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static synchronized boolean checkSpaces(String value) {
        if (value.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }
}
