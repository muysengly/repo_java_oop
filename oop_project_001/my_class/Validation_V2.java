package my_class;

public class Validation_V2 extends Validation_V1 {

    public boolean isStringHasCapitalLetter(String username) {
        return username.matches(".*[A-Z].*");
    }

    public boolean isStringHasLowerCaseLetter(String username) {
        return username.matches(".*[a-z].*");
    }

    public boolean isStringHasNumber(String username) {
        return username.matches(".*[0-9].*");
    }

    public boolean isStringSpecialCharacter(String username) {
        return username.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

}
