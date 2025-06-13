package my_class_aaa;

import java.util.Arrays;

public class StringValidation_V1 {

    String[] usernames;

    public StringValidation_V1() {

        DatabaseManagement db = new DatabaseManagement();
        db.loadDB("database.csv");
        String[][] credential = db.getDB();

        usernames = new String[credential.length];
        for (int i = 0; i < credential.length; i++) {
            usernames[i] = credential[i][0];
        }

        // System.out.println(Arrays.deepToString(usernames));

    }

    public boolean isUserNameValid(String username) {

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username)) {
                return false;
            }
        }

        return true;
    }

    public boolean isStringGreater(String string) {
        return string.length() >= 6;
    }

    public boolean isStringGreater(String string, int lenght) {
        return string.length() >= lenght;
    }

    public boolean isStringLesser(String string) {
        return string.length() <= 20;
    }

    public boolean isStringLesser(String string, int lenght) {
        return string.length() <= lenght;
    }

}
