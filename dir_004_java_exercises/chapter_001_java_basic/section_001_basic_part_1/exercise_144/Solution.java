import java.util.*;

public class Solution {
    /**
     * Remove all occurrences of a given element from an array and return the new
     * length.
     * 
     * @param nums:    A list of integers
     * @param element: An integer to be removed
     * @return: The new length after removing the element
     */
    public static int removeElement(int[] nums, int elem) {
        int length = nums.length; // Get the initial length of the array
        if (length == 0)
            return 0; // If the array is empty, return 0 (no changes)

        int i = 0; // Initialize the index for the new array

        // Iterate through the original array
        for (int j = 0; j < length; j++) {
            if (nums[j] != elem) {
                // If the current element is not equal to the element to be removed
                // Copy it to the new position in the array
                nums[i] = nums[j];
                i++;
            }
        }

        // Replace elements beyond the new length with a sentinel value
        if (i < length)
            nums[i] = '\0';

        // Return the new length (the value of 'i')
        return i;
    }

    public static void main(String[] args) {
        int x = 6; // Element to be removed
        int[] nums = { 1, 4, 6, 7, 6, 2 }; // Original array
        System.out.println("Original array: " + Arrays.toString(nums));

        // Call the removeElement function and print the new length
        System.out.println("The length of the new array is: " + removeElement(nums, x));
    }
}
