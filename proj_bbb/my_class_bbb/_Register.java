package my_class_bbb;

public class _Register {

    StringValidation_V2 sv;
    DatabaseManagement db;

    public _Register() {
        sv = new StringValidation_V2();

        db = new DatabaseManagement();
        db.loadDatabase("database.csv");
    }

    public boolean isUsernameValid(String username) {

        Boolean isValid;

        isValid = sv.isUserNameValid(username)
                && sv.isStringGreater(username, 6)
                && sv.isStringLess(username, 20)
                && !sv.isStringHasSpace(username)
                && !sv.isStringHasSpecialChar(username)
                && !sv.isStringHasUpper(username);

        return isValid;
    }

    public boolean isPasswordValid(String password) {
        Boolean isValid;

        isValid = sv.isStringGreater(password, 6)
                && sv.isStringLess(password, 20)
                && sv.isStringHasUpper(password)
                && sv.isStringHasLower(password)
                && sv.hasTwoLower(password)
                && sv.isStringHasSpecialChar(password)
                && sv.isStringHasNumber(password)
                && !sv.isStringHasSpace(password);

        return isValid;
    }

    public boolean isRegisterSuccessful(String username, String password) {

        if (isUsernameValid(username) && isPasswordValid(password)) {
            db.setDatabase(username, password);
            System.out.println("Registration successful!");
            return true;
        } else {
            System.out.println("Registration failed! Invalid credentials.");
            return false;
        }

    }

}
