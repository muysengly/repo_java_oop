import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if the first two characters of a string appear at the end of the string
    public boolean firstInLast(String str) {
        if (str.length() < 2) // If the length of the string is less than 2, return false
            return false;
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
            // If the substring of the first two characters is equal to the substring of the last two characters, return true
            return true;
        else
            return false; // Otherwise, return false
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "educated"; // Input string

        // Display the given string and whether the first two characters appear at the end of the string using firstInLast method
        System.out.println("The given strings is: " + str1);
        System.out.println("The first two characters appear in the last: " + m.firstInLast(str1));
    }
}
