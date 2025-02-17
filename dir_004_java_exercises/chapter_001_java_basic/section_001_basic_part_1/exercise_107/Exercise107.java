import java.util.*;

public class Exercise107 {
    public static void main(String[] args) {
        // Initialize an integer array with some values
        int[] array_nums = {11, 12, 13, 14, 45, 20};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Initialize a result variable to 1
        int result = 1;

        // Iterate through the array to check for consecutive integers
        for (int i = 0; i <= array_nums.length - 3; i++) {
            // Check if the current number, the next, and the one after that are consecutive
            if (array_nums[i] + 1 == array_nums[i + 1] && array_nums[i + 1] + 1 == array_nums[i + 2]) {
                // If they are consecutive, set the result to 0
                result = 0;
            }
        }

        // Check the result and print either true or false
        if (result == 1) {
            System.out.printf(String.valueOf(false));
        } else {
            System.out.printf(String.valueOf(true));
        }

        // Print a newline character for formatting
        System.out.printf("\n");
    }
}
