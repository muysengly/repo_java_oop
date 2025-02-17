
// Import the necessary Java classes.
import java.util.*;

// Define the 'solution' class.
public class Solution {
  // Method to find the subarray with the minimum sum of size 'k'.
  public static int[] find_min_subarray_sum(int[] nums, int k) {
    // Initialize variables to track the subarray sum and its minimum.
    int sub_arr_sum = 0;
    int min_sub_arr = Integer.MAX_VALUE;
    int last = 0;
    int[] result = new int[3]; // Store the result [start, end, min sum].

    // Iterate through the 'nums' array.
    for (int i = 0; i < nums.length; i++) {
      sub_arr_sum += nums[i];

      // Check if the subarray size 'k' is reached.
      if (i + 1 >= k) {
        // Update the minimum subarray sum and its endpoint.
        if (min_sub_arr > sub_arr_sum) {
          min_sub_arr = sub_arr_sum;
          last = i;
        }

        // Remove the contribution of the first element in the subarray.
        sub_arr_sum -= nums[i + 1 - k];
      }
    }

    // Store the results in the 'result' array.
    result[0] = last - k + 1; // Start index of the minimum subarray.
    result[1] = last; // End index of the minimum subarray.
    result[2] = min_sub_arr; // Minimum subarray sum.
    return result;
  }

  // Main method to demonstrate finding the minimum sum subarray.
  public static void main(String[] args) {
    // Initialize the 'nums' array and subarray size 'k'.
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int k = 4;

    // Print the original array and subarray size.
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));
    System.out.printf("\nSub-array size: %d", k);

    // Find and print the minimum sum subarray.
    int[] result = find_min_subarray_sum(nums, k);
    System.out.printf("\nSub-array from %d to %d and sum is: %d", result[0], result[1], result[2]);
  }
}
