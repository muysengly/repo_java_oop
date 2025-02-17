import java.util.*;
public class Exercise98 {
    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};
        int count = 0; // Initialize a count variable to keep track of the number of occurrences of 20
        int result = 0; // Initialize a result variable to track the outcome

        // Check if the array has at least one element and if the first element is 20
        if (array_nums.length >= 1 && array_nums[0] == 20) {
            count++; // Increment the count if the first element is 20
        }

        // Iterate through the array, starting from the second element (index 1)
        for (int i = 1; i < array_nums.length; i++) {
            // Check if the previous element and the current element are both 20
            if (array_nums[i - 1] == 20 && array_nums[i] == 20) {
                System.out.printf(String.valueOf(false)); // Print false when consecutive 20 elements are found
                result = 1; // Set the result to 1
            }

            // Check if the current element is 20 and increment the count
            if (array_nums[i] == 20) {
                count++;
            }
        }

        // If result is still 0, it means the specific pattern was not found
        if (result == 0) {
            System.out.printf(String.valueOf(count == 3)); // Print true if count is equal to 3
        }
        System.out.printf("\n"); // Add a newline character for formatting
    }
}
