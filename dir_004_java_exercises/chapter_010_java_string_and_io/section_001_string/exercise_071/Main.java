import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if one string appears at the end of the other string
    public boolean anyStringAtEnd(String stng1, String stng2) {
        stng1 = stng1.toLowerCase(); // Convert the first string to lowercase
        int aLen = stng1.length(); // Get the length of the first string

        stng2 = stng2.toLowerCase(); // Convert the second string to lowercase
        int bLen = stng2.length(); // Get the length of the second string

        // Check if the length of the first string is less than the length of the second string
        if (aLen < bLen) {
            // Extract a substring from the end of the second string, which is the length of the first string
            String temp = stng2.substring(bLen - aLen, bLen);

            // Compare the extracted substring with the first string and return true if they match, else return false
            if (temp.compareTo(stng1) == 0)
                return true;
            else
                return false;
        } else {
            // Extract a substring from the end of the first string, which is the length of the second string
            String temp = stng1.substring(aLen - bLen, aLen);

            // Compare the extracted substring with the second string and return true if they match, else return false
            if (temp.compareTo(stng2) == 0)
                return true;
            else
                return false;
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "pqrxyz"; // First input string
        String str2 = "xyz"; // Second input string

        // Display the given strings and check if one string appears at the end of the other using anyStringAtEnd method
        System.out.println("The given strings are: " + str1 + " and " + str2);
        System.out.println("Is one string appears at the end of the other? " + m.anyStringAtEnd(str1, str2));
    }
}
