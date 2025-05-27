import java.util.Arrays;

import my_class_bbb.DatabaseManagement;
import my_class_bbb.StringValidation_V1;

public class Test {
    public static void main(String[] args) {

        // StringValidation_V1 string_validation = new StringValidation_V1();

        // Boolean boo = string_validation.isUserNameValid("test_user");

        // System.out.println("" + boo);

        DatabaseManagement database_management = new DatabaseManagement();
        database_management.loadDatabase("database.csv");

        database_management.setDatabase("abcdef", "abcdef");

    }
}
