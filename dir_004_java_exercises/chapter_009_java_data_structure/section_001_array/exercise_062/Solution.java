//Source: https://bit.ly/2ziUROQ

// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  public static void main(String[] args) {
    // Initialize an array of integers.
    int[] nums = { -7, 1, 5, 2, -4, 3, 0 };
    System.out.println("Original array: " + Arrays.toString(nums));

    // Call the 'equlibrium_indices' method to find equilibrium indices.
    equlibrium_indices(nums);
  }

  public static void equlibrium_indices(int[] nums) {
    // Find the total sum of elements in the array.
    int totalSum = 0;
    for (int n : nums) {
      totalSum += n;
    }

    // Initialize a running sum to keep track of the sum as we iterate.
    int runningSum = 0;

    // Iterate through the array to find equilibrium indices.
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];

      // Check if the current index is an equilibrium index.
      if (totalSum - runningSum - n == runningSum) {
        System.out.println("Equilibrium indices found at: " + i);
      }

      // Update the running sum as we move through the array.
      runningSum += n;
    }
  }
}
