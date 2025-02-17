import java.util.*;

// Define a class named Main
public class Main {
    
    // Method to concatenate two strings while ensuring the minimum length
    public String minCat(String st1, String st2) {
        // Check if the lengths of the strings are equal
        if (st1.length() == st2.length())
            return st1 + st2; // If equal, concatenate the strings directly
        
        // Check if the length of the first string is greater than the length of the second string
        if (st1.length() > st2.length()) {
            int diff = st1.length() - st2.length(); // Calculate the length difference
            return st1.substring(diff, st1.length()) + st2; // Concatenate with adjusted lengths
        } else {
            int diff = st2.length() - st1.length(); // Calculate the length difference
            return st1 + st2.substring(diff, st2.length()); // Concatenate with adjusted lengths
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "Welcome"; // First string
        String str2 = "home";    // Second string
        
        // Display the given strings and the new concatenated string using the minCat method
        System.out.println("The given strings are: " + str1 + " and " + str2);
        System.out.println("The new string is: " + m.minCat(str1, str2));
    }
}
