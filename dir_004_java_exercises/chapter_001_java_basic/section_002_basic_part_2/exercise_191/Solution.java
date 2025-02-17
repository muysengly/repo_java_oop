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

        // Check if the input is a positive integer
        if (n > 0) {
            // Display the result of the sum_of_square_numbers function
            System.out.print("Is " + n + " sum of two square numbers? " + sum_of_square_numbers(n));
        }
    }

    // Function to check if a number is the sum of two square numbers
    public static boolean sum_of_square_numbers(int n) {
        // Initialize two pointers, left_num and right_num
        int left_num = 0, right_num = (int) Math.sqrt(n);

        // Iterate until the left_num pointer is less than or equal to the right_num
        // pointer
        while (left_num <= right_num) {
            // Check if the sum of squares of left_num and right_num is equal to n
            if (left_num * left_num + right_num * right_num == n) {
                return true;
            } else if (left_num * left_num + right_num * right_num < n) {
                // Increment left_num if the current sum is less than n
                left_num++;
            } else {
                // Decrement right_num if the current sum is greater than n
                right_num--;
            }
        }

        // If no pair of square numbers sum up to n, return false
        return false;
    }
}
