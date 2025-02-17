// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to reverse each word in a given string.
    public void reverseEachWordInString(String str1) {
        // Split the input string into individual words.
        String[] each_words = str1.split(" ");
        String revString = "";
        
        // Iterate through each word in the array.
        for (int i = 0; i < each_words.length; i++) {
            String word = each_words[i];
            String reverseWord = "";
            
            // Reverse each word character by character.
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            
            // Build the reversed string by appending the reversed word.
            revString = revString + reverseWord + " ";
        }
        
        // Display the string with reversed words.
        System.out.println(revString);
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Create an object of the Main class.
        Main obj = new Main();
        String StrGiven = "This is a test string"; // Given input string.
        
        // Display the given input string.
        System.out.println("The given string is: " + StrGiven);
        System.out.println("The string reversed word by word is: ");
        
        // Call the method to reverse each word in the string.
        obj.reverseEachWordInString(StrGiven);
    }
}
