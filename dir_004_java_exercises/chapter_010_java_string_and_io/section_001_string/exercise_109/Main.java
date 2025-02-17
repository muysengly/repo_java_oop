import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Check two consecutive identical letters in a given string";
        System.out.println("Original text: " + text);
        System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
        text = "Create a Date object using the Calendar class";
        System.out.println("\nOriginal text: " + text);
        System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
    }

    public static String test(String text) {
        return String.join(" ", Arrays.stream(text.split(" "))
                .map(n -> n.length() % 2 == 0 ? new StringBuffer(n).reverse().toString() : n).toArray(String[]::new));
    }
}
