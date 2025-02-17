
// Import Scanner class from java.util package for user input
import java.util.*;

// Main class for the solution
public class Solution {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");

        // Read the user input as an integer
        int n = in.nextInt();

        // Display the result of the is_Perfect_Square function
        System.out.print("Is the said number perfect square? " + is_Perfect_Square(n));
    }

    // Function to check if a given number is a perfect square
    public static boolean is_Perfect_Square(int n) {
        // Extract the last digit of the number
        int x = n % 10;

        // Check if the last digit is 2, 3, 7, or 8 (numbers whose squares end with
        // these digits)
        if (x == 2 || x == 3 || x == 7 || x == 8) {
            return false;
        }

        // Iterate from 0 to half of the input number plus 1
        for (int i = 0; i <= n / 2 + 1; i++) {
            // Check if the square of the current iteration is equal to the input number
            if ((long) i * i == n) {
                return true;
            }
        }

        // If no perfect square is found, return false
        return false;
    }
}
