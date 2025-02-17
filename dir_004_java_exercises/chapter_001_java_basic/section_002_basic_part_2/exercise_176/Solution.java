
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {

    // Main method
    public static void main(String[] args) {
        int[] nums = { 7, 2, 4, 1, 3, 5, 6, 8, 2, 10 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(nums));

        // Calling the partitionArray2 method to partition the array
        int[] result = partitionArray2(nums);

        // Printing the resulting array after partitioning
        System.out.println("After partition the said array becomes: " + Arrays.toString(result));
    }

    // Method to partition the array based on odd and even numbers
    public static int[] partitionArray2(int[] nums) {
        int i = 0; // Initializing pointer i to the start of the array
        int j = nums.length - 1; // Initializing pointer j to the end of the array

        // Looping until pointers i and j meet or cross each other
        while (i < j) {
            // Moving pointer i until it finds an odd number
            while (nums[i] % 2 == 0) {
                i++;
            }

            // Moving pointer j until it finds an even number
            while (nums[j] % 2 != 0) {
                j--;
            }

            // Swapping the odd and even numbers if i is less than j
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Returning the partitioned array
        return nums;
    }
}
