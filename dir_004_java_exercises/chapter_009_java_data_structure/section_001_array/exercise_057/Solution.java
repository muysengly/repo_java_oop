
// Import necessary Java classes.
import java.lang.Math;
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // A method to check if the elements in a sub-array are consecutive.
  static boolean is_consecutive(int nums[], int i, int j, int min, int max) {
    if (max - min != j - i) {
      return false;
    }

    // Create a boolean array to check for duplicates.
    boolean check[] = new boolean[j - i + 1];

    // Check each element in the sub-array.
    for (int k = i; k <= j; k++) {
      if (check[nums[k] - min]) {
        return false;
      }

      check[nums[k] - min] = true;
    }

    return true;
  }

  // A method to find and print the largest consecutive sub-array.
  public static void find_Max_SubArray(int[] nums) {
    int len = 1;
    int start = 0, end = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      int min_val = nums[i], max_val = nums[i];

      for (int j = i + 1; j < nums.length; j++) {
        min_val = Math.min(min_val, nums[j]);
        max_val = Math.max(max_val, nums[j]);

        // Check if the sub-array is consecutive and larger.
        if (is_consecutive(nums, i, j, min_val, max_val)) {
          if (len < max_val - min_val + 1) {
            len = max_val - min_val + 1;
            start = i;
            end = j;
          }
        }
      }
    }

    // Print the largest sub-array and its elements.
    System.out.println("The largest sub-array is [" + start + ", " + end + "]");
    System.out.print("Elements of the sub-array: ");
    for (int x = start; x <= end; x++) {
      System.out.print(nums[x] + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
    System.out.println("Original array: " + Arrays.toString(nums));

    // Find and print the largest consecutive sub-array.
    find_Max_SubArray(nums);
  }
}
