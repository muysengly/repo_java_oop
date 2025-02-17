// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    // Constant to represent the maximum number of characters (ASCII).
    static final int MAX_CHARS = 256;

    // Method to count the occurrences of each character in the string.
    static void CountCharacters(String str1, int[] ctr) {
        // Loop through the characters in the string.
        for (int i = 0; i < str1.length(); i++)
            ctr[str1.charAt(i)]++; // Increment the count for the corresponding character.
    }

    // Method to display the duplicate characters along with their counts.
    static void showDuplicates(String str1) {
        int ctr[] = new int[MAX_CHARS]; // Array to store character counts.
        CountCharacters(str1, ctr); // Count the characters in the string.

        // Loop through all ASCII characters.
        for (int i = 0; i < MAX_CHARS; i++) {
            // If the count of a character is greater than 1, it's a duplicate character.
            if (ctr[i] > 1)
                // Print the duplicate character and its count.
                System.out.printf("%c  appears  %d  times\n", i, ctr[i]);
        }
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "w3resource";
        System.out.println("The given string is: " + str1);
        System.out.println("The duplicate characters and counts are: ");
        showDuplicates(str1); // Display the duplicate characters and their counts.
    }
}
