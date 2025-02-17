// Import necessary Java utilities and packages.
import java.util.*;
import java.lang.*;
import java.io.*;

// Define a class named Main.
public class Main {
    // Method to remove all adjacent duplicates from the string.
    public static void check(String str) {
        // Check if the length of the string is less than or equal to 1.
        if (str.length() <= 1) {
            // Print the string and return if the length is 1 or less.
            System.out.println(str);
            return;
        }

        // Initialize variables.
        String n = new String();
        int count = 0;

        // Loop through the string to remove adjacent duplicates.
        for (int i = 0; i < str.length(); i++) {
            // Check for adjacent duplicates and skip them.
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                if (i < str.length() - 2 && str.charAt(i) != str.charAt(i + 2))
                    i += 2;
                else
                    i++;
                count++;
            }

            // Add non-duplicate characters to the new string.
            if (i != str.length() - 1)
                n = n + str.charAt(i);
            else {
                if (i == str.length() - 1 && str.charAt(i) != str.charAt(i - 1))
                    n = n + str.charAt(i);
            }
        }

        // Recursively check for more adjacent duplicates.
        if (count > 0)
            check(n);
        else
            // Print the final string after removing adjacent duplicates.
            System.out.println(n);
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        // Define a sample string for testing.
        String ab = "aabaarbarccrabmq";
        System.out.println("The given string is: " + ab);
        System.out.println("The new string after removing all adjacent duplicates is:");

        // Call the check method to remove adjacent duplicates.
        check(ab);
    }
}
