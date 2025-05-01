package my_abstract;

public abstract class RegisterAbstract {

    public abstract boolean validateUsername(String username);

    public abstract boolean validatePassword(String password);

    public abstract boolean validateTwoPasswords(String password, String confirmPassword);

    public abstract void register(String username, String password);

}
