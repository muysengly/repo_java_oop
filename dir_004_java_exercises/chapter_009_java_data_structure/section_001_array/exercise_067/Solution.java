
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // Method to find the maximum sum of a subarray within a circular array.
  public static int max_Subarray_Sum_Circular(int[] nums) {
    int n = nums.length;
    int result = nums[0]; // Initialize 'result' with the first element.
    int sum = nums[0]; // Initialize 'sum' with the first element.

    // Iterate through the array starting from the second element.
    for (int i = 1; i < n; i++) {
      // Calculate the maximum of 'sum + nums[i]' and 'nums[i]' (Kadane's algorithm).
      sum = Math.max(sum + nums[i], nums[i]);
      // Update 'result' with the maximum value.
      result = Math.max(result, sum);
    }

    // Create arrays to store right sum and right max.
    int[] right_Sum = new int[n];
    int[] right_Max = new int[n];

    // Initialize the last elements of right sum and right max arrays.
    right_Sum[n - 1] = nums[n - 1];
    right_Max[n - 1] = nums[n - 1];

    // Iterate through the array in reverse order.
    for (int i = n - 2; i >= 0; i--) {
      // Calculate right sum and right max values.
      right_Sum[i] = right_Sum[i + 1] + nums[i];
      right_Max[i] = Math.max(right_Sum[i], right_Max[i + 1]);
    }

    int left_Sum = 0; // Initialize the left sum.

    // Iterate through the array with a circular view, except the last two elements.
    for (int i = 0; i < n - 2; i++) {
      left_Sum += nums[i];
      // Update 'result' with the maximum of 'left_Sum + right_Max[i + 2]' and the
      // current 'result'.
      result = Math.max(result, left_Sum + right_Max[i + 2]);
    }

    return result;
  }

  // Main method to demonstrate finding the maximum sum of a subarray in a
  // circular array.
  public static void main(String[] args) {
    // Initialize two circular arrays.
    int[] nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
    int[] nums2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 };

    // Print the original circular arrays.
    System.out.println("\nOriginal circular array 1: " + Arrays.toString(nums1));
    System.out.println("The sum of subarray with the largest sum is " + max_Subarray_Sum_Circular(nums1));
    System.out.println("\nOriginal circular array 2: " + Arrays.toString(nums2));
    System.out.println("The sum of subarray with the largest sum is " + max_Subarray_Sum_Circular(nums2));
  }
}
