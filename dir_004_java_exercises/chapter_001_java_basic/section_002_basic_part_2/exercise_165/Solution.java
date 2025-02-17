import java.util.*;

public class Solution {
    // Method to split and sort an array
    public static int[] split_sorting_array(int[] nums) {
        // Check if the input array is null
        if (nums == null) {
            throw new IllegalArgumentException("Null array......!"); // Throw an exception for null array
        }
        
        boolean flag = true; // Initialize flag to indicate array status
        while (flag) {
            flag = false; // Set flag to false initially
            
            // Iterate through the array to perform sorting
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) { // Check if the current element is greater than the next element
                    swap(nums, j, j + 1); // Swap the elements if they are in the wrong order
                    flag = true; // Set flag to true to indicate that swapping occurred
                }
            }
        }
        return nums; // Return the sorted array
    }
    
    // Method to swap elements in the array
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[right]; // Store the value of the right index in a temporary variable
        nums[right] = nums[left]; // Assign the value of left index to the right index
        nums[left] = temp; // Assign the stored value to the left index
    }
    
    public static void main(String[] args) {
        int[] nums = {-2, 3, 4, -1, -3, 1, 2, -4, 0}; // Initialize the input array
        System.out.println("\nOriginal array: " + Arrays.toString(nums)); // Display the original array
        
        int[] result = split_sorting_array(nums); // Obtain the result of split and sorting
        System.out.println("\nResult: " + Arrays.toString(result)); // Display the result
    }
} 
