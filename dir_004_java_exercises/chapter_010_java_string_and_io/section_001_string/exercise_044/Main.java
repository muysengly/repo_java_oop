// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to reverse a string recursively.
    void reverseString(String str1) {
        // Base case: if the string is null or has a length less than or equal to 1, print the string.
        if ((str1 == null) || (str1.length() <= 1))
            System.out.println(str1);
        else {
            // Print the last character of the string.
            System.out.print(str1.charAt(str1.length() - 1));
            
            // Recursive call to reverseString method by excluding the last character.
            reverseString(str1.substring(0, str1.length() - 1));
        }
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the string in reverse order.
        System.out.println("The string in reverse order is:");
        
        // Create an object of Main class to call the reverseString method.
        Main obj = new Main();
        obj.reverseString(str1);
    }
}
