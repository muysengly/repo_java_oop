import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        // Specify the word to search for
        String searchColor = "Orange";

        // Check if the list contains the specified color using a lambda expression
        Predicate<String> containsWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containsWord);

        // Print the result
        System.out.println("Is the word " + searchColor + " present in the list? " + flag);

        // Specify the word to search for
        String searchColor1 = "White";

        // Check if the list contains the specified color using a lambda expression
        Predicate<String> containsWord1 = word -> word.equals(searchColor1);
        flag = colors.stream().anyMatch(containsWord1);

        // Print the result
        System.out.println("\nIs the word " + searchColor1 + " present in the list? " + flag);
    }
}
