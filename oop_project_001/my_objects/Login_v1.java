package my_objects;

import my_abstract.LoginAbstract;
import my_encapsulation.CredentialEncapsulation;

public class Login_v1 extends LoginAbstract {

    private CredentialEncapsulation credentials = new CredentialEncapsulation();

    public Login_v1(String filePath) {
        credentials.loadCredentials(filePath);
    }

    @Override
    public boolean login(String username, String password) {
        return credentials.getCredentials(username, password);
    }

    public static void main(String[] args) {
        Login_v1 login_v1 = new Login_v1("../credentials.csv");
        System.out.println(login_v1.login("admin", "admin"));
        login_v1.logout();
    }

}
