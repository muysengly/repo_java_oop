import java.util.*;

// Define a class named Main
public class Main {

    // Method to extract the middle of the bread based on certain conditions
    public String pickMiddleOfBread(String stng) {
        int len = stng.length(); // Get the length of the input string
        String tmpString = ""; // Initialize a temporary string variable
        String resultString = ""; // Initialize a result string variable
        int st = 0; // Initialize starting index
        int en = 0; // Initialize ending index
        boolean found = false; // Initialize a boolean variable indicating if "toast" is found

        // If the length of the input string is less than or equal to 10, return an empty string
        if (len <= 10)
            return "";

        // Iterate through the characters of the input string
        for (int i = 0; i < len - 4; i++) {
            tmpString = stng.substring(i, i + 5); // Extract a substring of length 5 starting at index 'i'

            // Check if the substring is "toast" and 'found' flag is true, update the ending index
            if (tmpString.equals("toast") && found == true)
                en = i;

            // Check if the substring is "toast" and 'found' flag is false, update the starting index and set 'found' flag to true
            if (tmpString.equals("toast") && found == false) {
                st = i + 5;
                found = true;
            }
        }

        // Extract the middle of the bread based on the starting and ending indices
        resultString = stng.substring(st, en);

        return resultString; // Return the result
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "sweettoastbuttertoast"; // Input string

        // Display the given string and the new string using pickMiddleOfBread method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.pickMiddleOfBread(str1));
    }
}
