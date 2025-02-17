import java.util.*;

public class Exercise96 {
    public static void main(String[] args) {
        int[] array_nums = {10, 70, 80, 50, 20, 13, 50};
        boolean testd = false; // Initialize a boolean variable for testing
        int result = 0; // Initialize a result variable to track the outcome
        int x = 10; // Define the first number to search for
        int y = 20; // Define the second number to search for

        // Iterate through the array
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] == x)
                testd = true; // Set the boolean flag when x is found in the array

            // Check if both x and y are found in the array with specific conditions
            if (testd && array_nums[i] == y) {
                System.out.printf(String.valueOf(true)); // Print true when both x and y are found
                result = 1; // Set the result to 1
            }
        }

        // If result is still 0, it means y did not follow x in the array
        if (result == 0) {
            System.out.printf(String.valueOf(false)); // Print false
        }
        System.out.printf("\n"); // Add a newline character for formatting
    }
}
