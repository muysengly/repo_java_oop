package my_class;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DatabaseManagement {

    private String path_csv;
    private String[][] credential;

    DatabaseManagement() {
        System.out.println("Object is constructed!");
    }

    public void loadDatabase(String path) {
        path_csv = path;
    }

    public String[][] getDatabase() {

        try {

            List<String> lines = Files.readAllLines(Paths.get(path_csv));

            System.out.println("Lines: " + lines);

        } catch (Exception e) {
            // TODO: handle exception
        }

        return credential;
    }

    public void setDatabase(String username, String password) {

    }

    // This is a placeholder for testing the DatabaseManagement class.
    public static void main(String[] args) {

        DatabaseManagement database_management = new DatabaseManagement();

        database_management.loadDatabase("../database.csv");

        String[][] credential = database_management.getDatabase();

    }

}
