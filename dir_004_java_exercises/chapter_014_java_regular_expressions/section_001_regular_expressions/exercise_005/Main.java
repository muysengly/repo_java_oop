
public class Main {

    public static void main(String[] args) {

        System.out.println(validate("phkuyrt"));
        System.out.println(validate("pq"));
        System.out.println(validate("pccddbbjjjq"));
        System.out.println(validate("Jar"));
        System.out.println(validate("pjhut"));
    }

    public static String validate(String text) {
        if (text.matches("p.*?q$"))
            return "Found a match!";
        else
            return "Not matched!";
    }
}
