package my_class;

import my_abstract.CredentialAbstract;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Credential_v1 extends CredentialAbstract {

    private String database;
    private String[][] credentials;

    @Override
    public void loadCredentials(String filePath) {
        database = filePath;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            java.util.List<String[]> tempCredentials = new java.util.ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                tempCredentials.add(line.split(","));
            }
            credentials = tempCredentials.toArray(new String[0][]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean getCredentials(String username, String password) {
        for (String[] credential : credentials) {
            if (credential[0].equals(username) && credential[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setCredentials(String username, String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(database, true))) {
            bw.write(username + "," + password);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Credential_v1 encapsulation = new Credential_v1();

        encapsulation.loadCredentials("../credentials.csv");

        System.out.println(Arrays.deepToString(encapsulation.credentials));

        encapsulation.setCredentials("admin000", "admin000");

        System.out.println(encapsulation.getCredentials("admin", "admin"));

    }

}
