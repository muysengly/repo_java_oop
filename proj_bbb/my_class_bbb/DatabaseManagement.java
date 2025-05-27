package my_class_bbb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DatabaseManagement {

    private String path_csv;
    private String[][] credential;

    public DatabaseManagement() {
        System.out.println("Object is constructed!");
    }

    public void loadDatabase(String path) {
        path_csv = path;
    }

    public String[][] getDatabase() {

        try {

            List<String> lines = Files.readAllLines(Paths.get(path_csv));

            // System.out.println("Lines: " + lines);

            credential = new String[lines.size()][];
            for (String line : lines) {
                credential[lines.indexOf(line)] = line.split(",");
            }

        } catch (Exception e) {
        }

        return credential;
    }

    public void setDatabase(String username, String password) {

        try {

            FileWriter file_writer = new FileWriter(path_csv, true);
            BufferedWriter buffer_writer = new BufferedWriter(file_writer);
            buffer_writer.write(username + "," + password);
            buffer_writer.newLine();
            buffer_writer.flush();

        } catch (Exception e) {
        }

    }

}
