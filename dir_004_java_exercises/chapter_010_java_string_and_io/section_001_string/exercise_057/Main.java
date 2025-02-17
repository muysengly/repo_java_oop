import java.util.*;

// Define a class named Main
public class Main {
    
    // Method to swap the last two characters of a string
    public String lastTwo(String str) {
        // Check if the string has less than two characters, return the string as is
        if (str.length() < 2) return str;
        
        // Swap the last two characters of the string and return the modified string
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        // Define a string for swapping the last two characters
        String str1 = "string";

        // Display the given string and the string after swapping its last two characters using the lastTwo method
        System.out.println("The given string is: " + str1);
        System.out.println("The string after swapping the last two characters is: " + m.lastTwo(str1));
    }
}
