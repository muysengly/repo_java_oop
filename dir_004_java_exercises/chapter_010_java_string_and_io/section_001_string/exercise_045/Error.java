// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to reverse words in a given string.
    public static String WordsInReverse(String str1) {
        // Create a StringBuilder object and reverse the entire string.
        StringBuilder sb = new StringBuilder(str1);
        String StrRev = sb.reverse().toString();

        // Split the reversed string into words.
        String[] words = StrRev.split(" ");
        
        // Create a StringBuilder to store the reversed words.
        StringBuilder reverse = new StringBuilder();
        
        // Iterate through each word, reverse it, and append it to the result string.
        for (String tmp: words) {
            sb = new StringBuilder(tmp);
            reverse.append(sb.reverse() + " ");
        }
        
        // Remove the trailing space and return the reversed words string.
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "Reverse words in a given string"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the string after reversing the words.
        System.out.println("The new string after reversing the words: " + WordsInReverse(str1));
    }
}
