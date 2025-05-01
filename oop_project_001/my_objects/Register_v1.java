package my_objects;

import my_abstract.RegisterAbstract;
import my_encapsulation.CredentialEncapsulation;

public class Register_v1 extends RegisterAbstract {

    private CredentialEncapsulation credentials = new CredentialEncapsulation();

    public Register_v1(String filePath) {
        credentials.loadCredentials(filePath);
    }

    public void testCredentials() {
        System.out.println("Credentials loaded");
    }

    @Override
    public boolean validateUsername(String username) {
        if (username.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validatePassword(String password) {
        if (password.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validateTwoPasswords(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void register(String username, String password) {
        if (validateUsername(username) && validatePassword(password)) {
            credentials.setCredentials(username, password);
        }
    }

    public static void main(String[] args) {

        Register_v1 register_v1 = new Register_v1("../credentials.csv");
        System.out.println(register_v1.validateUsername("admin"));
        System.out.println(register_v1.validateUsername("adminnn"));

        System.out.println(register_v1.validatePassword("admin"));
        System.out.println(register_v1.validatePassword("adminnn"));

        System.out.println(register_v1.validateTwoPasswords("admin", "admin"));

        register_v1.register("admin123456", "admin123456");

    }

}
