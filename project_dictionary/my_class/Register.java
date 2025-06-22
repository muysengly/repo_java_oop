package my_class;

import java.util.Arrays;

import my_class.DatabaseManagement;
import my_class.StringValidation_V2;

public class Register {

    StringValidation_V2 sv;
    DatabaseManagement db;

    public Register() {
        sv = new StringValidation_V2();

        // System.out.println(sv.isStringGreater("abcde"));

        db = new DatabaseManagement();
        db.loadDB("database.csv");

        // System.out.println(Arrays.deepToString(db.getDB()));

    }

    public boolean isUserNameValid(String username) {

        boolean isValid = sv.isUserNameValid(username)
                && sv.isStringGreater(username, 6)
                && sv.isStringLesser(username, 20)
                && !sv.isStringHasUpper(username)
                && !sv.isStringHasSpecialChar(username)
                && !sv.isStringHasSpace(username)
                && !sv.isStringHasNumber(username);

        return isValid;
    }

    public boolean isPasswordValid(String password) {

        boolean isValid = sv.isStringGreater(password, 6)
                && sv.isStringLesser(password, 20)
                && sv.isStringHasUpper(password)
                && sv.isStringHasTwoLower(password)
                && sv.isStringHasSpecialChar(password)
                && sv.isStringHasNumber(password)
                && !sv.isStringHasSpace(password);

        return isValid;
    }

    public boolean isRegisterSuccess(String username, String password, String verify_password) {

        if (isUserNameValid(username) && isPasswordValid(password) && password.equals(verify_password)) {
            db.setDB(username, password);
            return true;
        } else {
            return false;
        }

    }

}