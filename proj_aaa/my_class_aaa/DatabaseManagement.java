package my_class_aaa;

import java.io.BufferedWriter;
import java.io.FileWriter;
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

    public void setDB(String username, String password) {
        try {

            FileWriter fw = new FileWriter(path_CSV, true);
            BufferedWriter bf = new BufferedWriter(fw);

            bf.write(username + "," + password);
            bf.newLine();

            bf.flush();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}