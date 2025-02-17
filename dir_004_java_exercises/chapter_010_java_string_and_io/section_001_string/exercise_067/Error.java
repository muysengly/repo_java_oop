import java.util.*;

// Define a class named Main
public class Main {

    // Method to exclude 'x' characters at the first two positions from the input string
    public String exceptTwoO(String stng) {
        String temp = ""; // Create an empty string

        // Iterate through each character in the input string
        for (int i = 0; i < stng.length(); i++) {
            // If the current index is 0 and the character is not 'x', append the character to the temporary string
            if (i == 0 && stng.charAt(i) != 'x')
                temp += stng.charAt(i);
            // If the current index is 1 and the character is not 'x', append the character to the temporary string
            else if (i == 1 && stng.charAt(i) != 'x')
                temp += stng.charAt(i);
            // If the current index is greater than 1, append the character to the temporary string
            else if (i > 1)
                temp += stng.charAt(i);
        }
        return temp; // Return the modified string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "xxcyte"; // Input string

        // Display the given string and the new string using exceptTwoO method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.exceptTwoO(str1));
    }
}
