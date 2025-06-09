import java.util.Arrays;

import my_class_bbb.Register;

public class Test {
    public static void main(String[] args) {

        Register register = new Register();

        // System.out.println(register.isUserNameValid("adminadmin"));

        // System.out.println(register.isPasswordValid("Pa$$word001"));

        System.out.println(register.isRegisterSuccess("adminadmin", "Pa$$word001"));

    }
}
