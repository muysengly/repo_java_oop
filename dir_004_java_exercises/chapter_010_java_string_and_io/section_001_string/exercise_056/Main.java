import java.util.*;

// Define a class named Main
public class Main {

    // Method to concatenate two strings based on specific conditions
    public String conCat(String st1, String st2) {
        // Check if both strings are not empty and the last character of the first string matches the first character of the second string
        if (st1.length() != 0 && st2.length() != 0 && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1); // Concatenate the strings excluding the duplicate character
        return st1 + st2; // If no match or empty strings, concatenate the strings as they are
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        // Define two strings for concatenation
        String str1 = "food";
        String str2 = "door";

        // Display the given strings and the concatenated string using the conCat method
        System.out.println("The given strings are: " + str1 + " and " + str2);
        System.out.println("The string after concatenation is: " + m.conCat(str1, str2));
    }
}
