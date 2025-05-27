import java.util.Arrays;

import my_class_ccc.DatabaseManagement;

public class Test {
    public static void main(String[] args) {

        DatabaseManagement db = new DatabaseManagement();

        db.loadDB("database.csv");

        String[][] credential = db.getDB();

        System.out.println(Arrays.deepToString(credential));

    }
}
