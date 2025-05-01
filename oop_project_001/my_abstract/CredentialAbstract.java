package my_abstract;

public abstract class CredentialAbstract {

    public abstract void loadCredentials(String filePath);

    public abstract boolean getCredentials(String username, String password);

    public abstract void setCredentials(String username, String password);

    public static void main(String[] args) {
        System.out.println("Test Interface Class");
    }

}
