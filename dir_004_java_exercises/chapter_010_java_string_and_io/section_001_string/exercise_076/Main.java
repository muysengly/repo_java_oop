import java.util.*;

// Define a class named Main
public class Main {

    // Method to count the number of times the substring "life" or "li?e" appears
    public int substringCounting(String stng) {
        int l = stng.length(); // Get the length of the input string
        int ctr = 0; // Initialize a counter variable to count occurrences
        String firsttwo = "li"; // Define the substring "li"
        String lastone = "e"; // Define the substring "e"

        if (l < 4)
            return 0; // If the length of the string is less than 4, return 0

        for (int i = 0; i < l - 3; i++) {
            // Check if the substring from i to i+2 matches "li" and i+3 matches "e"
            if (firsttwo.compareTo(stng.substring(i, i + 2)) == 0 && lastone.compareTo(stng.substring(i + 3, i + 4)) == 0)
                ctr++; // Increment the counter if the condition is satisfied
        }
        return ctr; // Return the total count of occurrences
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "liveonwildlife"; // Input string to be checked
        System.out.println("The given string is: " + str1);
        System.out.println("The substring 'life' or 'li?e' appears number of times: " + m.substringCounting(str1)); // Display the result
    }
}
