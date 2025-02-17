
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Initializing a string
        String str1 = "The length of last word";
        // Printing the original string
        System.out.println("Original String: " + str1);
        // Printing the length of the last word of the string
        System.out.println("Length of the last word of the above string: " + length_Of_last_word(str1));
    }

    // Method to calculate the length of the last word in a string
    public static int length_Of_last_word(String str1) {
        int length_word = 0; // Initializing the variable to store the length of the last word
        String[] words = str1.split(" "); // Splitting the string into words based on spaces

        // Checking if words exist in the array after splitting
        if (words.length > 0) {
            // Assigning the length of the last word to the variable
            length_word = words[words.length - 1].length();
        } else {
            length_word = 0; // If no words are present, setting the length to 0
        }

        return length_word; // Returning the length of the last word
    }
}
