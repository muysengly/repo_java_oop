package my_class_bbb;

import java.util.Arrays;

public class Register {

    StringValidation_V2 sv;
    DatabaseManagement db;

    public Register() {

        db = new DatabaseManagement();
        db.loadDatabase("database.csv");
        // System.out.println(Arrays.deepToString(db.getDatabase()));

        sv = new StringValidation_V2();
        // System.out.println(sv.isStringGreater("123456"));
    }

    public boolean isUserNameValid(String username) {

        boolean isValid = sv.isUserNameValid(username)
                && !sv.isStringHasSpace(username)
                && sv.isStringGreater(username, 6)
                && sv.isStringLess(username, 20)
                && !sv.isStringHasUpper(username)
                && !sv.isStringHasSpecialChar(username);

        return isValid;
    }

    public boolean isPasswordValid(String password) {

        boolean isValid = sv.isStringGreater(password, 6)
                && sv.isStringLess(password, 20)
                && sv.isStringHasUpper(password)
                && sv.isStringHasLower(password)
                && sv.isStringHasNumber(password)
                && sv.hasTwoLower(password)
                && sv.isStringHasSpecialChar(password)
                && !sv.isStringHasSpace(password);

        return isValid;
    }

    public boolean isRegisterSuccess(String username, String password) {

        if (isUserNameValid(username) && isPasswordValid(password)) {
            db.setDatabase(username, password);
            return true;
        } else {
            return false;
        }

    }

}
