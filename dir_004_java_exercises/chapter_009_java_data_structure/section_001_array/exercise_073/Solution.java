// Import the necessary Java classes.
import java.util.Arrays;

// Define the 'solution' class.
public class Solution
{
    // Define a private method to sort the given array.
	private static int [] sort_Array(int[] nums)
	{
		// Initialize variables to track indices for swapping.
		int x = -1, y = -1;
		// Initialize a variable to store the previous element in the array.
		int prev = nums[0];

		// Traverse the array to find elements that need to be swapped.
		for (int i = 1; i < nums.length; i++)
		{
			// Compare the current element with the previous element.
			if (prev > nums[i])
			{
				// If this is the first unsorted pair, set x and y.
				if (x == -1) {
					x = i - 1;
					y = i;
				}
				// If a previous unsorted pair exists, update y.
				else {
					y = i;
				}
			}
			// Update the previous element.
			prev = nums[i];
		}

		// Call a private method to swap the elements at indices x and y.
		swap_nums(nums, x, y);
		// Return the sorted array.
		return nums;
	}

    // Define a private method to swap two elements in the array.
	private static void swap_nums(int[] a, int i, int j) {
		int temp_val = a[i];
		a[i] = a[j];
		a[j] = temp_val;
	}

    // Define the main method for running the program.
	public static void main(String[] args)
	{
		// Initialize the first array.
		int[] nums1 = { 3, 5, 6, 9, 8, 7 };
        System.out.println("\nOriginal array: "+Arrays.toString(nums1));
		// Call the sort_Array method to sort the array and print the result.
		int[] result1 = sort_Array(nums1);
		System.out.println("\nAfter sorting new array becomes: "+Arrays.toString(result1));

		// Initialize the second array.
		int[] nums2 = { 5, 0, 1, 2, 3, 4, -2 };
        System.out.println("\nOriginal array: "+Arrays.toString(nums2));
		// Call the sort_Array method to sort the array and print the result.
		int[] result2 = sort_Array(nums2);
		System.out.println("\nAfter sorting new array becomes: "+Arrays.toString(result2));
	}
}
