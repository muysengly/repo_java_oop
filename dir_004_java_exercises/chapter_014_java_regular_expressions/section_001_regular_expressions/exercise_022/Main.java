//Ref.https://bit.ly/33gB1TY
public class Main {

    public static void main(String[] args) {
        String text = "(123)4567890";
        System.out.println("Original Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "(123)4567890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "1234567890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "123-456-7890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "(1234567890)";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "123)4567890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "12345678901";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "(1)234567890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "(123)-4567890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "1";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "12-3456-7890";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
        text = "123-4567";
        System.out.println("\nOriginal Phone number: " + text);
        System.out.println("Check the said Phone number is true or not! " + validate(text));
    }

    public static Boolean validate(String text) {
        return text.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
    }
}
