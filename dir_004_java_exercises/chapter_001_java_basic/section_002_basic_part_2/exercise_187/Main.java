// Importing necessary Java utilities
import java.util.*;
// Main class Solution
public class Main {
    // Main method
    public static void main(String[] args) {
        // Declaring and initializing a string
        String str1 = "google";
        // Printing the index of the first non-repeating character in the given string
        System.out.println("Index of first non-repeating character in '" + str1 + "' is: " + first_unique_character(str1));
    }
    // Method to find the index of the first non-repeating character in the given string
    public static int first_unique_character(String str1) {
        // Creating a HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        // Iterating through the string to count character occurrences and store in the map
        for (int i = 0; i < str1.length(); ++i) {
            char chr = str1.charAt(i);
            // Incrementing the count if character already exists, else adding the character with count 1
            map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
        }
        // Iterating through the string to find the first non-repeating character
        for (int i = 0; i < str1.length(); ++i) {
            if (map.get(str1.charAt(i)) < 2) {
                // Returning the index of the first non-repeating character
                return i;
            }
        }
        // If no non-repeating character found, returning -1
        return -1;
    }
}
