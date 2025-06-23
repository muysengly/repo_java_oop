package my_class_aaa;

import my_class_aaa.StringValidation_V1;

public class StringValidation_V2 extends StringValidation_V1 {

    public boolean isStringHasUpper(String string) {
        return string.matches(".*[A-Z].*");
    }

    public boolean isStringHasLower(String string) {
        return string.matches(".*[a-z].*");
    }

    public boolean isStringHasNumber(String string) {
        return string.matches(".*[0-9].*");
    }

    public boolean isStringHasSpecialChar(String string) {
        return string.matches(".*[!@#$%^&*+-/()*\\[\\]].*");
    }

    public boolean isStringHasSpace(String string) {
        return string.matches(".*[ ].*");
    }

    public boolean isStringHasTwoLower(String string) {

        int count = 0;

        for (char c : string.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }

        return true ? count >= 2 : false;

    }

}
