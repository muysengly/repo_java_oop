import java.util.stream.IntStream;

public class test {

    public static void main(String[] args) {
        String text = "Follow"; // Define a string 'text' with the value "Follow"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and
        // display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));

        text = "Java"; // Change the value of 'text' to "Java"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and
        // display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));

        text = "Yellow"; // Change the value of 'text' to "Yellow"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and
        // display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));
    }

    // Method to test if there are two consecutive identical letters in the string
    // using IntStream
    public static boolean test(String text) {
        return IntStream.range(0, text.length() - 1) // Generate a stream of integers from 0 to text.length()-1
                .anyMatch(n -> text.charAt(n) == text.charAt(n + 1)); // Check if any pair of consecutive letters are
                                                                      // identical
    }
}
