
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // Method to find the largest sum of a contiguous sub-array.
  public static int largest_sum(int[] A) {
    // Initialize variables for maximum element value and maximum ending here.
    int max_ele_val = 0;
    int max_end = 0;

    // Iterate through the elements in array 'A'.
    for (int i : A) {
      max_end = max_end + i;

      // Ensure that 'max_end' doesn't go below zero.
      max_end = Integer.max(max_end, 0);

      // Update 'max_ele_val' with the maximum value.
      max_ele_val = Integer.max(max_ele_val, max_end);
    }
    return max_ele_val;
  }

  // Main method to demonstrate finding the largest sum of a contiguous sub-array.
  public static void main(String[] args) {
    // Initialize an array.
    int[] A = { 1, 2, -3, -4, 0, 6, 7, 8, 9 };
    System.out.println("\nOriginal array: " + Arrays.toString(A));

    // Call the 'largest_sum' method to find and print the largest sum.
    System.out.println("The largest sum of a contiguous sub-array: " + largest_sum(A));
  }
}
