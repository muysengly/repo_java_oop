
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // Method to find the product of every other element in an array.
  public static int[] find_Product_in_array(int[] nums) {
    int n = nums.length;

    // Initialize arrays to store left and right products.
    int[] left_element = new int[n];
    int[] right_element = new int[n];

    // Calculate left products.
    left_element[0] = 1;
    for (int i = 1; i < n; i++) {
      left_element[i] = nums[i - 1] * left_element[i - 1];
    }

    // Calculate right products.
    right_element[n - 1] = 1;
    for (int j = n - 2; j >= 0; j--) {
      right_element[j] = nums[j + 1] * right_element[j + 1];
    }

    // Calculate the product of every other element.
    for (int i = 0; i < n; i++) {
      nums[i] = left_element[i] * right_element[i];
    }

    // Return the modified array.
    return nums;
  }

  // Main method to demonstrate finding product of every other element in arrays.
  public static void main(String[] args) {
    // Initialize an array.
    int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("Original array:\n" + Arrays.toString(nums1));

    // Call the 'find_Product_in_array' method to calculate product and print the
    // result.
    int[] result1 = find_Product_in_array(nums1);
    System.out.println("Array with product of every other element:\n" + Arrays.toString(result1));

    // Initialize another array.
    int[] nums2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("\nOriginal array:\n" + Arrays.toString(nums2));

    // Call the method and print the result for the second array.
    int[] result2 = find_Product_in_array(nums2);
    System.out.println("Array with product of every other element:\n" + Arrays.toString(result2));
  }
}
