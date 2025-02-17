import java.util.*;

// Define a class named Main
public class Main {

    // Method to exclude '#' character considering some conditions from the input string
    public String excludeHash(String stng) {
        int len = stng.length(); // Get the length of the input string
        String resultString = ""; // Initialize an empty string to store the result

        // Iterate through each character in the input string
        for (int i = 0; i < len; i++) {
            // If the current character is the first character and it is not '#', append it to the resultString
            if (i == 0 && stng.charAt(i) != '#')
                resultString += stng.charAt(i);

            // If the current character is not '#' and the previous character and current character both are not '#', append it to the resultString
            if (i > 0 && stng.charAt(i) != '#' && stng.charAt(i - 1) != '#')
                resultString += stng.charAt(i);

            // If the current character is '#' and the previous character is not '#', remove the last character from resultString
            if (i > 0 && stng.charAt(i) == '#' && stng.charAt(i - 1) != '#')
                resultString = resultString.substring(0, resultString.length() - 1);
        }
        return resultString; // Return the modified string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "test#string"; // Input string

        // Display the given string and the new string using excludeHash method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.excludeHash(str1));
    }
}
