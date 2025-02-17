
// Importing necessary classes from the java.util package
import java.util.*;

// Defining a class named "solution"
public class solution {

    // Method to check if a word is an abecedarian word
    public static boolean is_abecedarian_word(String word) {
        // Finding the index of the last character in the word
        int index = word.length() - 1;

        // Looping through the characters of the word
        for (int i = 0; i < index; i++) {
            // Comparing the current character with the next one
            if (word.charAt(i) <= word.charAt(i + 1)) {
                // If the current character is less than or equal to the next one, continue
            } else {
                // If the current character is greater than the next one, return false
                return false;
            }
        }
        // If the loop completes without returning false, return true
        return true;
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input a word
        System.out.print("Input a word: ");
        // Reading the input word from the user
        String word1 = scanner.nextLine();

        // Printing whether the input word is an abecedarian word
        System.out.println("Is Abecedarian word? " + is_abecedarian_word(word1));
    }
}
