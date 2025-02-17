// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Declaring and initializing two strings
        String str1 = "abca";
        String str2 = "zbxz";
		
		// Printing if the two strings are isomorphic or not
        System.out.println("Is " + str1 + " and " + str2 + " are Isomorphic? " + is_Isomorphic(str1, str2));
    }

    // Method to check if two strings are isomorphic
    public static boolean is_Isomorphic(String str1, String str2) {
        // Check for invalid inputs or unequal lengths of strings
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        
        // Creating a HashMap to store character mappings
        Map<Character, Character> map = new HashMap<>();
        
        // Loop through each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            char char_str1 = str1.charAt(i), char_str2 = str2.charAt(i);
            
            // If the mapping for str1 character already exists
            if (map.containsKey(char_str1)) {
                // Check if the mapping matches with the corresponding character in str2
                if (map.get(char_str1) != char_str2)
                    return false;
            } else {
                // If no mapping for str1 character exists, check if str2 character is already mapped to another str1 character
                if (map.containsValue(char_str2))
                    return false;
                
                // Create a new mapping for str1 character to str2 character
                map.put(char_str1, char_str2);
            }
        }
        
        // If no discrepancies found, return true (strings are isomorphic)
        return true;
    }
}
