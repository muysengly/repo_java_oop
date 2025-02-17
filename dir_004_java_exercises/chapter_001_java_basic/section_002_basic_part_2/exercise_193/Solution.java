// Import Scanner class from java.util package for user input
import java.util.Scanner;

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

        // Calculate the sum of subsets using a mathematical formula
        int result = (n * (n + 1) / 2) * (1 << (n - 1));

        // Display the result of the sum of subsets
        System.out.print("Sum of subsets of n is : " + result);
    }
} 
