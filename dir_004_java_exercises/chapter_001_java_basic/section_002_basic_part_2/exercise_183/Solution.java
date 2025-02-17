
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompting user to input a positive integer
        System.out.print("Input a positive integer: ");

        // Reading the input value provided by the user
        int n = in.nextInt();

        // Checking if the input is a positive integer
        if (n > 0)
            // Printing the result of add_digits_until_one method if the input is positive
            System.out.println(add_digits_until_one(n));
    }

    // Method to add digits of a number until the result becomes a single digit
    public static int add_digits_until_one(int n) {
        // Loop to keep adding digits until the number becomes a single digit
        while (n > 9) {
            int sum_digits = 0;

            // Loop to extract digits and calculate their sum
            while (n != 0) {
                sum_digits += n % 10; // Adding the last digit to sum
                n /= 10; // Removing the last digit
            }
            n = sum_digits; // Assigning the sum to 'n' for next iteration
        }
        return n; // Returning the single-digit sum
    }
}
