package my_class;

import my_abstract.LoginAbstract;

public class Login_v1 extends LoginAbstract {

    private Credential_v1 credentials = new Credential_v1();

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
