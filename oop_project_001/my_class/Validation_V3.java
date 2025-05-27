package my_class;

public class Validation_V3 extends Validation_V2 {

    int getStringCapitalLetterCount(String username) {
        int count = 0;
        for (char c : username.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    int getStringLowerCaseLetterCount(String username) {
        int count = 0;
        for (char c : username.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    int getStringNumberCount(String username) {
        int count = 0;
        for (char c : username.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

}
