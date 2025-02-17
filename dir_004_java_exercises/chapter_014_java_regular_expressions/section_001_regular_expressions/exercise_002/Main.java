import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(validate("p"));
        System.out.println(validate("pq"));
        System.out.println(validate("pqq"));
        System.out.println(validate("pqr"));
        System.out.println(validate("prr"));
    }

    public static String validate(String text) {
        if (text.matches("pq*?"))
            return "Found a match!";
        else
            return "Not matched!";
    }
}
