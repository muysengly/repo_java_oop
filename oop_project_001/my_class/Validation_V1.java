package my_class;

public class Validation_V1 {

    public boolean isStringGreaterThan6(String str) {
        return str.length() > 6;
    }

    public boolean isStringLessThan20(String str) {
        return str.length() < 20;
    }

    public boolean isUserNameInDatabase(String username) {
        String[][] database = {
                { "admin", "admin" },
                { "user", "user" }
        };

        for (String[] row : database) {
            if (row[0].equals(username)) {
                return true;
            }
        }
        return false;

    }

}
