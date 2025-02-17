// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str1 = "w3resource";
        
        // Print the original string.
        System.out.println("The given string is: " + str1);
        
        // Print the new string after removing duplicate characters.
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    
    // Method to remove duplicate characters from a string.
    private static String removeDuplicateChars(String sourceStr) {
        // Convert the input string to a character array.
        char[] arr1 = sourceStr.toCharArray();
        
        // Initialize an empty string to store the resulting string without duplicates.
        String targetStr = "";
        
        // Loop through each character in the character array.
        for (char value: arr1) {
            // Check if the character doesn't exist in the targetStr.
            if (targetStr.indexOf(value) == -1) {
                // If the character doesn't exist, add it to the targetStr.
                targetStr += value;
            }
        }
        
        // Return the resulting string without duplicates.
        return targetStr;
    }
}
