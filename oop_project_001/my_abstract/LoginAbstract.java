package my_abstract;

public abstract class LoginAbstract {

    public abstract boolean login(String username, String password);

    public void logout() {
        System.out.println("Logged out successfully.");
    }

    public static void main(String[] args) {
        System.out.println("Test Abstract Class");
    }
}
