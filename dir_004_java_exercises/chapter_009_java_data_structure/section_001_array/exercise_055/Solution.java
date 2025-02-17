
// Import necessary Java classes.
import java.util.*;
import java.lang.*;

// Define a class named 'solution'.
public class Solution {
  // A method to print all subarrays with a sum of zero.
  public static void print_all_Subarrays(int[] A) {
    // Create a list to store elements of subarrays.
    List<Integer> llist = new ArrayList<Integer>();

    // Iterate through the array.
    for (int i = 0; i < A.length; i++) {
      int sum = 0;
      llist.removeAll(llist);

      // Nested loop to find subarrays starting from index i.
      for (int j = i; j < A.length; j++) {
        sum += A[j];
        llist.add(A[j]);

        // If the sum of the subarray is zero, print it.
        if (sum == 0) {
          System.out.println("Sub-arrays with 0 sum: " + llist.toString());
        }
      }
    }
  }

  public static void main(String[] args) {
    // Define an array 'nums1'.
    int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums1));

    // Print all subarrays with a sum of zero for 'nums1'.
    print_all_Subarrays(nums1);

    // Define another array 'nums2'.
    int[] nums2 = { 1, 2, -3, 4, 5, 6 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums2));

    // Print all subarrays with a sum of zero for 'nums2'.
    print_all_Subarrays(nums2);

    // Define yet another array 'nums3'.
    int[] nums3 = { 1, 2, -2, 3, 4, 5, 6 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums3));

    // Print all subarrays with a sum of zero for 'nums3'.
    print_all_Subarrays(nums3);
  }
}
