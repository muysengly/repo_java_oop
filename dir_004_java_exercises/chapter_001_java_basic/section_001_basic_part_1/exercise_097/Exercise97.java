import java.util.*;

public class Exercise97 {
    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
        //int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
        boolean testd = false; // Initialize a boolean variable for testing
        int result = 0; // Initialize a result variable to track the outcome
        int x = 10; // Define the number to search for

        // Iterate through the array, considering pairs of adjacent elements
        for (int i = 0; i < array_nums.length - 1; i++) {
            if (array_nums[i] == x && array_nums[i + 1] == x) {
                System.out.printf(String.valueOf(true)); // Print true when consecutive x elements are found
                result = 1; // Set the result to 1
            }

            // Check if the element x is followed by another x with one element in between
            if (i <= array_nums.length - 3 && array_nums[i] == x && array_nums[i + 2] == x) {
                System.out.printf(String.valueOf(true)); // Print true when x elements are found with one element in between
                result = 1; // Set the result to 1
            }
        }

        // If result is still 0, it means the specific pattern was not found
        if (result == 0) {
            System.out.printf(String.valueOf(false)); // Print false
        }
        System.out.printf("\n"); // Add a newline character for formatting
    }
}
