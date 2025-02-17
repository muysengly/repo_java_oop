// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Main method to execute the program.
    public static void main(String[] args) {
        // Define the input string.
        String strg = "abrambabasc";
        System.out.println("The given string is: " + strg);
        System.out.print("After removing the specified characters, the new string is: ");
        // Call the method to remove specific characters from the string.
        removeSetofCharacters(strg, "ac", "b");
    }

    // Method to remove specified characters from the given string.
    public static void removeSetofCharacters(String str, String ptn1, String ptn2) {
        // Get the length of the string and initialize variables.
        int n = str.length(), i;
        int ptr = 0;
        // Convert the string to a character array.
        char[] arr1 = str.toCharArray();

        // Loop through each character in the string.
        for (i = 0; i < n; ++i) {
            // Check conditions to remove characters based on the specified patterns.
            if (arr1[i] == 'b') {
                continue; // Skip 'b'.
            } else if (i + 1 < n && arr1[i] == 'a' && arr1[i + 1] == 'c') {
                ++i; // Skip 'ac'.
            } else {
                arr1[ptr++] = arr1[i]; // Copy character to the new position.
            }
        }

        // Create a new character array with the modified string.
        char[] ret = Arrays.copyOfRange(arr1, 0, ptr);
        // Convert the character array to a string and print the result.
        System.out.println(new String(ret));
    }
}
