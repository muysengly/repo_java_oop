// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Define two strings.
        String str1 = "the quick brown fox";
        String str2 = "queen";
        
        // Print the given strings.
        System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);
        
        // Create a character array of the length of the first string.
        char arr[] = new char[str1.length()];
        
        // Create a character array to represent a mask of size 256 (ASCII characters).
        char[] mask = new char[256];
        
        // Loop through the characters of the mask string and count occurrences of each character.
        for (int i = 0; i < str2.length(); i++)
            mask[str2.charAt(i)]++;
        
        // Print a header for the new string.
        System.out.println("\nThe new string is: ");
        
        // Loop through the characters of the first string.
        for (int i = 0; i < str1.length(); i++) {
            // If the character at the current index in str1 is not found in str2 (mask is 0), print it.
            if (mask[str1.charAt(i)] == 0)
                System.out.print(str1.charAt(i));
        }
    }
}
