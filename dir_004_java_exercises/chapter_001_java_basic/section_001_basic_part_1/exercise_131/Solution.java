import java.util.Arrays;

public class Solution {
    // Static method to remove duplicates from the given array
    static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int current_pos = 0;
        int moving_pos;
        for (moving_pos = 1; moving_pos < nums.length; moving_pos++) {
            // Check if the current element is different from the next element
            if (nums[current_pos] != nums[moving_pos]) {
                // If different, move the unique element to the next position in the array
                nums[current_pos + 1] = nums[moving_pos];
                current_pos++; // Increment the position for the unique element
            }
        }
        // The new length of the array is one more than the current position
        return current_pos + 1;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7 };
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);
        System.out.println("After removing duplicates, the new length of the array is: " + removeDuplicates(nums));
    }
}
