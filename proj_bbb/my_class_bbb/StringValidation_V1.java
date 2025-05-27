package my_class_bbb;

import java.util.Arrays;

public class StringValidation_V1 {

    String[] usernames;

    public StringValidation_V1() {

        DatabaseManagement db = new DatabaseManagement();
        db.loadDatabase("database.csv");
        String[][] credentials = db.getDatabase();

        usernames = new String[credentials.length];
        for (int i = 0; i < credentials.length; i++) {
            usernames[i] = credentials[i][0];
        }

    }

    public boolean isStringGreater(String string) {
        return string.length() >= 6;
    }

    public boolean isStringGreater(String string, int length) {
        return string.length() >= length;
    }

    public boolean isStringLess(String string) {
        return string.length() <= 20;
    }

    public boolean isStringLess(String string, int length) {
        return string.length() <= length;
    }

    public boolean isUserNameValid(String username) {

        for (String user : usernames) {
            if (user.equals(username)) {
                return false;
            }
        }

        return true;

    }

}
