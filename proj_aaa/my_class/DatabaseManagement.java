package my_class;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DatabaseManagement {

    private String path_CSV;
    private String[][] credential;

    public DatabaseManagement() {
        System.out.println("Class is constructed!");
    }

    public void loadDB(String path) {
        path_CSV = path;
        System.out.println(path_CSV);
    }

    public String[][] getDB() {

        try {

            List<String> lines = Files.readAllLines(Paths.get(path_CSV));
            // System.out.println(lines);

            credential = new String[lines.size()][];
            for (String line : lines) {
                credential[lines.indexOf(line)] = line.split(",");
            }

        } catch (Exception e) {
        }

        return credential;
    }

    void setDB(String username, String password) {

    }

}