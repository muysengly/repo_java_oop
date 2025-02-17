
// Import Scanner and Map classes from java.util package for user input and data storage
import java.util.*;

// Main class for the solution
public class Solution {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Sample input strings for testing word pattern matching
        String str = "red black black red";
        // String str = "red red red red";
        String pattern = "xyxx";
        // String pattern = "xxxx";

        // Display the result of the word_Pattern_Match function
        System.out.print("Is the string and pattern matched? " + word_Pattern_Match(pattern, str));
    }

    // Function to check if a given string follows a given word pattern
    public static boolean word_Pattern_Match(String pattern, String str) {
        // Convert the pattern string to an array of characters
        char[] word_pattern = pattern.toCharArray();

        // Split the input string into an array of words using space as a delimiter
        String[] words = str.split(" ");

        // Create a HashMap to store the mapping between characters and words
        Map<Character, String> map = new HashMap<>();

        // Create a HashSet to check for duplicate mappings
        Set<String> set = new HashSet<>();

        // Iterate through the characters in the pattern
        for (int i = 0; i < word_pattern.length; i++) {
            // Check if the character is already mapped
            if (map.containsKey(word_pattern[i])) {
                // Check if the mapped word is different from the current word in the array
                if (!map.get(word_pattern[i]).equals(words[i])) {
                    return false;
                }
                continue;
            }

            // Check if the current word is already mapped to another character
            if (set.contains(words[i])) {
                return false;
            }

            // Add the mapping between the character and the current word to the HashMap
            map.put(word_pattern[i], words[i]);

            // Add the current word to the HashSet to mark it as used
            set.add(words[i]);
        }

        // If all conditions are satisfied, return true
        return true;
    }
}
