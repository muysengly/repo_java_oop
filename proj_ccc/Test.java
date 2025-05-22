import java.util.Arrays;

import my_class.DatabaseManagement;

public class Test {
    public static void main(String[] args) {

        DatabaseManagement database_management = new DatabaseManagement();

        database_management.loadDB("database.csv");

        String[][] credential = database_management.getDB();

        System.out.println(Arrays.deepToString(credential));

    }
}
