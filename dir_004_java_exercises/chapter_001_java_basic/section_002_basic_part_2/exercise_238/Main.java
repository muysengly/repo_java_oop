
// Importing the Scanner class from java.util package
import java.util.*;

// Main class named "Main"
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner stdIn = new Scanner(System.in);

        // Prompting the user to input the text
        System.out.println("Input the text:");

        // Reading the input string
        String str = stdIn.next();

        // Iterating through each character in the input string
        for (int i = 0; i < str.length(); ++i) {
            // Checking if the current character is '#'
            if (str.charAt(i) == '#') {
                // Repeating the next character by the specified number of times
                for (int j = 0; j < (str.charAt(i + 1) - '0'); ++j) {
                    // Printing the repeated character
                    System.out.print(str.charAt(i + 2));
                }
                // Skipping the processed characters (the count and the repeated character)
                i += 2;
            } else {
                // Printing the current character as it is
                System.out.print(str.charAt(i));
            }
        }
        // Printing a new line after processing the input string
        System.out.println();
    }
}
