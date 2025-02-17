
// Import the necessary Java utility classes.
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // A method to find if there exists a subarray with a sum of zero.

  public static Boolean find_subarray_sum_zero(int[] nums) {
    // Create a HashSet to store the cumulative sum of elements.
    
    Set<Integer> set = new HashSet<>();
    set.add(0);
    int suba_sum = 0;

    // Iterate through the elements of the array.
    for (int i = 0; i < nums.length; i++) {
      suba_sum += nums[i];

      // If the cumulative sum already exists in the set, return true.
      if (set.contains(suba_sum)) {
        return true;
      }

      // Add the cumulative sum to the set.
      set.add(suba_sum);
    }

    // If no subarray with a sum of zero is found, return false.
    return false;
  }

  public static void main(String[] args) {
    // Define an array 'nums1'.
    int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
    System.out.println("Original array: " + Arrays.toString(nums1));

    // Check if the array contains a subarray with a sum of zero and print the
    // result.
    System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums1));

    // Define another array 'nums2'.
    int[] nums2 = { 1, 2, 3, 4, 5, 6 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums2));

    // Check if the array contains a subarray with a sum of zero and print the
    // result.
    System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums2));

    // Define yet another array 'nums3'.
    int[] nums3 = { 1, 2, -3, 4, 5, 6 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums3));

    // Check if the array contains a subarray with a sum of zero and print the
    // result.
    System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums3));
  }
}
// </integer>