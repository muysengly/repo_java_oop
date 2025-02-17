// Importing the required Java utilities package
import java.util.*;

// Defining a class named Solution
public class Solution {

  // Method to find the length of the longest sequence in an array
  public static int longest_sequence(int[] nums) {
    // Checking if the input array is null
    if (nums == null) {
      throw new IllegalArgumentException("Null array..!"); // Throwing an exception for a null array
    }
    
    // Checking if the array is empty
    if (nums.length == 0) {
      return 0; // Returning 0 if the array is empty
    }
    
    boolean flag = false; // Initializing a flag to track the presence of a sequence
    int result = 0; // Initializing the variable to store the length of the longest sequence
    int start = 0, end = 0; // Initializing variables to track the start and end of a sequence

    // Loop to iterate through the array elements
    for (int i = 1; i < nums.length; i++) {
      // Checking if the current element is greater than the previous element
      if (nums[i - 1] < nums[i]) {
        end = i; // Updating the end of the sequence if the condition is met
      } else {
        start = i; // Updating the start of the sequence if the condition is not met
      }
      
      // Checking if the length of the current sequence is greater than the stored result
      if (end - start > result) {
        flag = true; // Setting the flag to indicate the presence of a longer sequence
        result = end - start; // Updating the result with the length of the longer sequence
      }
    }
    
    // Returning the length of the longest sequence
    if (flag) {
      return result + 1; // Adding 1 to the result if a sequence is found
    } else {
      return result; // Returning the result if no sequence is found
    }
  }

  // The main method of the program
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2 }; // Initializing an array
    
    // Displaying the original array
    System.out.println("\nOriginal array: " + Arrays.toString(nums));
    
    // Finding and displaying the length of the longest sequence in the array
    System.out.println(longest_sequence(nums));
  }
} 
