import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if 'abc' appears before a period in the given string
    public Boolean abcBeforePeriod(String stng) {
        int len = stng.length(); // Get the length of the input string
        String abc = "abc"; // Create a string variable 'abc' to match against
        Boolean match = false; // Initialize a boolean variable 'match' to false

        if (len < 3)
            return false; // If the length of the string is less than 3, return false as 'abc' cannot appear

        for (int i = 0; i < len - 2; i++) {
            // Extract a substring of length 3 starting from the current index 'i'
            String temp = stng.substring(i, i + 3);

            // Check if the extracted substring matches 'abc' and it's at the beginning of the string
            if (temp.compareTo(abc) == 0 && i == 0)
                match = true;
            // Check if the extracted substring matches 'abc' and the character before it is not a period ('.')
            else if (temp.compareTo(abc) == 0 && stng.charAt(i - 1) != 46)
                match = true;
        }
        return match; // Return the boolean variable indicating if 'abc' appeared before a period
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "testabc.test"; // Input string to be checked

        // Display the given string and check if 'abc' appears before a period using abcBeforePeriod method
        System.out.println("The given string is: " + str1);
        System.out.println("Does 'abc' appear before a period? " + m.abcBeforePeriod(str1));
    }
}
