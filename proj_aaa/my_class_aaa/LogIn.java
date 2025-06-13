package my_class_aaa;

import java.util.Arrays;

public class LogIn {

    String[][] credentials;

    public LogIn() {

        DatabaseManagement db = new DatabaseManagement();
        db.loadDB("database.csv");
        credentials = db.getDB();

        // System.out.println(Arrays.deepToString(credentials[0]));

    }

    public boolean isLogInSuccess(String username, String password) {

        for (String[] c : credentials) {
            if (c[0].equals(username) && c[1].equals(password)) {
                return true;
            }
        }

        return false;
    }
}
