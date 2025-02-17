// Importing the required Java utilities package
import java.util.*;

// Defining a class named Solution
public class Solution {
  
  // Method to move all zeros in the array to the end
  public static int[] move_zero(int[] nums) {
    // Checking if the input array is null
    if (nums == null) {
      throw new IllegalArgumentException("Null array!"); // Throwing an exception for a null array
    }
    
    boolean swap = true; // Initializing a boolean variable to track swapping operations
    
    // Loop to move zeros to the end of the array
    while (swap) {
      swap = false; // Resetting the swap flag for each iteration
      
      // Iterating through the array elements
      for (int i = 0; i < nums.length - 1; i++) {
        // Swapping non-zero elements with zeros to move zeros towards the end
        if (nums[i] == 0 && nums[i + 1] != 0) {
          swap(nums, i, i + 1); // Calling the swap method to perform the swap operation
          swap = true; // Setting the swap flag to true after performing a swap
        }
      }
    }
    
    return nums; // Returning the modified array
  }
  
  // Private method to swap elements in the array
  private static void swap(int[] nums, int a, int b) {
    int temp = nums[a]; // Storing the value of nums[a] in a temporary variable
    nums[a] = nums[b]; // Assigning the value of nums[b] to nums[a]
    nums[b] = temp; // Assigning the value stored in the temporary variable to nums[b]
  }
  
  // The main method of the program
  public static void main(String[] args) {
    int[] nums = {0, 3, 4, 0, 1, 2, 5, 0}; // Initializing an array with integers
    
    // Displaying the original array
    System.out.println("\nOriginal array: " + Arrays.toString(nums));
    
    // Calling the move_zero method to move zeros to the end of the array
    int[] result = move_zero(nums);
    
    // Displaying the resulting array after moving zeros to the end
    System.out.println("\nResult: " + Arrays.toString(result));
  }
} 
