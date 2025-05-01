package my_objects;

public class Register_v2 extends Register_v1 {

    public Register_v2(String filePath) {
        super(filePath);
    }

    @Override
    public boolean validateUsername(String username) {
        if (username.length() >= 6 && username.matches("^[a-zA-Z0-9]*$")) { // Only alphanumeric characters
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Register_v2 register_v2 = new Register_v2("../credentials.csv");

        System.out.println(register_v2.validateUsername("admin123"));
        System.out.println(register_v2.validateUsername("admin123!@#"));

        register_v2.register("admin123456", "admin123456");
    }
}
