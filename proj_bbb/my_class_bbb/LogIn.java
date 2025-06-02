package my_class_bbb;

import java.util.Arrays;

public class LogIn {
    String[][] credentials;

    public LogIn() {
        DatabaseManagement db = new DatabaseManagement();
        db.loadDatabase("database.csv");
        credentials = db.getDatabase();

        // System.out.println(Arrays.deepToString(credentials));
    }

    public boolean loginSuccess(String username, String password) {

        for (String[] c : credentials) {

            // System.out.println(c[0] + " " + c[1]);
            if (c[0].equals(username) && c[1].equals(password)) {

                // System.out.println("Login successful for user: " + username);
                return true;
            }
        }
        return false;

    }
}
