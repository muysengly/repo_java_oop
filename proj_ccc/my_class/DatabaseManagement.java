package my_class;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DatabaseManagement {

    private String path_csv;
    private String[][] credential;

    public DatabaseManagement() {
        System.out.println("class is constructed");
    }

    public void loadDB(String path) {
        path_csv = path;
        // System.out.println(path_csv);
    }

    public String[][] getDB() {

        try {

            List<String> lines = Files.readAllLines(Paths.get(path_csv));

            credential = new String[lines.size()][];
            for (String line : lines) {
                credential[lines.indexOf(line)] = line.split(",");
            }

        } catch (Exception e) {
        }

        return credential;
    }

    public void setDB(String username, String password) {

    }

}