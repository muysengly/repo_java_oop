public class Main {

    public static void main(String[] args) {
        String text = "Java Exercises";
        System.out.println("Original string: " + text);
        System.out.println("After removing all non-alphanumeric characters from the said string: " + validate(text));
        text = "Ex@^%&%(ercis*&)&es";
        System.out.println("\nOriginal string: " + text);
        System.out.println("After removing all non-alphanumeric characters from the said string: " + validate(text));
    }

    public static String validate(String text) {
        return text.replaceAll("[^a-zA-Z]", "");
    }
}
