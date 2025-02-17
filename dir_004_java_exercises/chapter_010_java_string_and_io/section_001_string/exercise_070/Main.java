import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if the string is pq-balanced
    public boolean pqBalanceString(String stng) {
        Boolean p = false; // Initialize flag for 'p'
        Boolean q = false; // Initialize flag for 'q'
        int len = stng.length(); // Get the length of the input string

        // Iterate through the characters of the input string
        for (int i = 0; i < len; i++) {

            // Check if the current character is 'p' and 'q' flag is true, set 'p' flag to true and 'q' flag to false
            if (stng.charAt(i) == 'p' && q == true) {
                p = true;
                q = false;
            } else if (stng.charAt(i) == 'p') {
                p = true;
            }

            // Check if the current character is 'q' and 'p' flag is true, set 'q' flag to true
            if (stng.charAt(i) == 'q' && p == true)
                q = true;
        }

        // If 'p' flag is false, set 'q' flag to true
        if (p == false)
            q = true;

        return q; // Return the 'q' flag indicating pq-balance
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "gfpmpnppqab"; // Input string

        // Display the given string and whether it is pq-balanced using pqBalanceString method
        System.out.println("The given strings is: " + str1);
        System.out.println("The string is pq-balanced? " + m.pqBalanceString(str1));
    }
}
