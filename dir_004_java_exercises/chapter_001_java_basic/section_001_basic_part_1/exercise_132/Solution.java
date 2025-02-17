import java.util.Arrays;

class Solution {
    // Static method to remove duplicates from the given array, allowing at most two duplicates
    static int remove_Duplicates_twice(int[] nums) {
        // Check for invalid or empty input array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 1; // Initialize the index for the resulting array
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is different from the element at 'index',
            // or if it's the second occurrence of a duplicate, but not the third
            if (nums[i] != nums[index] || (nums[i] == nums[index] && nums[i] != nums[index - 1])) {
                index++; // Increment the index for the resulting array
                nums[index] = nums[i]; // Copy the unique or second occurrence of a duplicate element
            }
        }
        // The new length of the array is one more than the 'index'
        return index + 1;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);
        System.out.println("After removing duplicates, the new length of the array is: " + remove_Duplicates_twice(nums));
    }
}
