// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Define a constant for the size of the character set.
    static final int N = 256;
    
    // Method to find the character with the maximum occurrence in the string.
    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N]; // Array to count occurrences of each character.
        int l = str1.length(); // Length of the given string.
        
        // Loop through the string to count occurrences of each character.
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        
        int max = -1; // Variable to store maximum occurrence.
        char result = ' '; // Variable to store the character with the maximum occurrence.

        // Loop through the string to find the character with the maximum occurrence.
        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result; // Return the character with the maximum occurrence.
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "test string"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the character with the maximum occurrence in the given string.
        System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
    }
}
