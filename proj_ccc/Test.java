import my_class_ccc.Register;

public class Test {
    public static void main(String[] args) {

        Register register = new Register();

        // System.out.println(register.isUserNameValid("T estuserabc"));

        register.isRegisterSuccess("adminadmin", "Admin@123", "Admin@123");
    }
}
