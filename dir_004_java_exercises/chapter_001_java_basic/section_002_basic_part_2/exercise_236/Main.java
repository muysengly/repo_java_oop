
// Importing the Scanner class from java.util package
import java.util.Scanner;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String arg[]) {
        // Creating a Scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Initializing variables to store the count and temporary numeric value
        int count = 0;
        String tmp = "0";

        // Prompting the user to input some text and numeric values
        System.out.println("Input some text and numeric values:");

        // Converting the input string to a character array
        char ch[] = in.nextLine().toCharArray();

        // Looping through each character in the array
        for (int i = 0; i < ch.length; i++) {
            // Checking if the current character is a digit
            while (i < ch.length && (Character.isDigit(ch[i]))) {
                // Concatenating digits to form a temporary numeric value
                tmp += ch[i];
                i++;
            }

            // Adding the numeric value to the count
            count += Integer.valueOf(tmp);

            // Resetting the temporary numeric value
            tmp = "0";
        }

        // Displaying the sum of the numeric values
        System.out.println("\nSum of the numeric values:");
        System.out.println(count);
    }
}
