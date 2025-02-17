import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if a substring of length 'n_chr' appears elsewhere in the string
    public boolean nChrStringSomewhere(String stng, int n_chr) {
        int len = stng.length(); // Get the length of the input string

        // Extract the prefix substring of length 'n_chr' from the input string
        String pre_str = stng.substring(0, n_chr);

        for (int i = n_chr; i < len; i++) {
            // Check if 'n_chr' characters can be extracted starting from the current index 'i'
            if (n_chr + i <= len) {
                // Extract a substring of length 'n_chr' starting from index 'i'
                if (pre_str.equals(stng.substring(i, n_chr + i))) // Compare the extracted substring with the prefix
                    return true; // If a match is found, return true
            }
        }
        return false; // If no match is found, return false
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "MrsJemsMrsam"; // Input string to be checked
        int n = 3; // Define the length of the prefix to be checked
        String prechr = str1.substring(0, n); // Extract the prefix of length 'n' from the input string

        // Display the given string, prefix string length, and check if the prefix appears elsewhere in the string
        System.out.println("The given string is: " + str1);
        System.out.println("The prefix string length is: " + n);
        System.out.println("Does '" + prechr + "' appear elsewhere in the string? " + m.nChrStringSomewhere(str1, n));
    }
}
