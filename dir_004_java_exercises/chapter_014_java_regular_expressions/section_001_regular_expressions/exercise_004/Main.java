import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(validate("Java"));
        System.out.println(validate("java"));
        System.out.println(validate("javA"));
        System.out.println(validate("JAVa"));
        System.out.println(validate("Ja"));
        System.out.println(validate("aJ"));
    }

    public static String validate(String text) {
        if (text.matches("[A-Z][a-z]+$"))
            return "Found a match!";
        else
            return "Not matched!";
    }
}
