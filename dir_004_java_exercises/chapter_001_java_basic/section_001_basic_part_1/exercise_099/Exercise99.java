import java.util.*;

public class Exercise99 {
    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
        int result = 0; // Initialize a result variable

        int x = 20; // The value to check for

        // Iterate through the array, stopping at the second-to-last element
        for (int i = 0; i < array_nums.length - 1; i++) {
            // Check if the current element and the next element are not equal to the value 'x'
            if (array_nums[i] != x && array_nums[i + 1] != x) {
                result = 1; // If the condition is met, set the result to 1
            }
        }

        // If result is still 0, it means no adjacent pairs without 'x' were found
        if (result == 0) {
            System.out.printf(String.valueOf(true)); // Print true
        } else {
            System.out.printf(String.valueOf(false)); // Print false
        }
    }
}
