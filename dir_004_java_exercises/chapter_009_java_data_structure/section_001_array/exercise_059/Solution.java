
// Import necessary Java classes.
import java.util.*;

// Define a class named 'solution'.
public class Solution {
  // A method to find the pair of elements with the maximum product.
  public static void find_max_product(int[] nums) {
    int max_pair_product = Integer.MIN_VALUE;
    int max_i = -1, max_j = -1;

    // Loop through the array elements.
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        // Check if the product of elements at indices i and j is greater than the
        // current maximum.
        if (max_pair_product < nums[i] * nums[j]) {
          max_pair_product = nums[i] * nums[j];
          max_i = i;
          max_j = j;
        }
      }
    }

    // Print the pair and maximum product.
    System.out
        .print("Pair is (" + nums[max_i] + ", " + nums[max_j] + "), Maximum Product: " + (nums[max_i] * nums[max_j]));
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 5, 7, -7, 5, 8, -5 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums));

    // Find and print the pair of elements with the maximum product.
    find_max_product(nums);
  }
}
