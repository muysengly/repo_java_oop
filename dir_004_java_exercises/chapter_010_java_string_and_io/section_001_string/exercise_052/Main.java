// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    // Method to check if one string is a rotation of another string.
    static boolean checkForRotation(String str1, String str2) {
        // Check if both strings have the same length and str2 is found in the concatenated str1+str1.
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        // Define two strings for comparison.
        String str1 = "ABACD";
        String str2 = "CDABA";

        // Print the given strings.
        System.out.println("The given strings are: " + str1 + "  and  " + str2);

        // Print the concatenation of the 1st string twice.
        System.out.println("\nThe concatenation of 1st string twice is: " + str1 + str1);

        // Check if the second string is a rotation of the first string.
        if (checkForRotation(str1, str2)) {
            // Print messages when the rotation is found.
            System.out.println("The 2nd string " + str2 + "  exists in the new string.");
            System.out.println("\nStrings are rotations of each other");
        } else {
            // Print messages when the rotation is not found.
            System.out.println("The 2nd string " + str2 + "  does not exist in the new string.");
            System.out.printf("\nStrings are not rotations of each other");
        }
    }
}
