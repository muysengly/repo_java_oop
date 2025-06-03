package my_class_ccc;

public class StringValidation_V2 extends StringValidation_V1 {

    public boolean isStringHasUpper(String string) {
        return string.matches(".*[A-Z].*");
    }

    public boolean isStringHasLower(String string) {
        return string.matches(".*[a-z].*");
    }

    public boolean isStringHasNum(String string) {
        return string.matches(".*[0-9].*");
    }

    public boolean isStringHasSpecialChar(String string) {
        return string.matches(".*[!@#$%^&*].*");
    }

    public boolean isStringHasSpace(String string) {
        return string.matches(".*[ ].*");
    }

    public boolean hasTwoLower(String string) {

        int count = 0;
        for (char c : string.toCharArray()) {
            if (isStringHasLower(String.valueOf(c))) {
                count++;
            }
        }

        return true ? count >= 2 : false;

    }

}
