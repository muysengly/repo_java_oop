import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Define a string 'text' with certain characters
        String text = "abcdaa";
        System.out.println("Original String: " + text); // Display the original string

        // Count and display the number of duplicate characters occurring more than
        // twice in the string
        System.out
                .println("Number of duplicate characters in the said String (Occurs more than twice.): " + test(text));

        // Change the value of 'text' to another string
        text = "Tergiversation";
        System.out.println("\nOriginal String: " + text); // Display the original string

        // Count and display the number of duplicate characters occurring more than
        // twice in the string
        System.out
                .println("Number of duplicate characters in the said String (Occurs more than twice.): " + test(text));
    }

    // Method to count duplicate characters occurring more than twice in a string
    public static int test(String text) {
        return (int) text.chars() // Convert the string into an IntStream of characters
                .boxed() // Box each integer value into its corresponding Integer object
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Collect the characters
                                                                                            // into a map
                                                                                            // with their counts
                .values() // Get the values (counts) from the map
                .stream() // Convert the Collection into a Stream
                .filter(ctr -> ctr > 2) // Filter the counts to keep those occurring more than twice
                .count(); // Count the filtered occurrences
    }
}
