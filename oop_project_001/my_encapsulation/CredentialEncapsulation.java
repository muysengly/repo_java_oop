package my_encapsulation;

import my_abstract.CredentialAbstract;

public class CredentialEncapsulation extends CredentialAbstract {

    private String database;
    private String[][] credentials;

    @Override
    public void loadCredentials(String filePath) {
        database = filePath;
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            java.util.List<String[]> tempCredentials = new java.util.ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                tempCredentials.add(line.split(","));
            }
            credentials = tempCredentials.toArray(new String[0][]);
        } catch (java.io.IOException e) {
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
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(database, true))) {
            bw.write(username + "," + password);
            bw.newLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CredentialEncapsulation encapsulation = new CredentialEncapsulation();

        encapsulation.loadCredentials("../credentials.csv");

        encapsulation.setCredentials("admin000", "admin000");

        System.out.println(encapsulation.getCredentials("admin", "admin"));

    }

}
