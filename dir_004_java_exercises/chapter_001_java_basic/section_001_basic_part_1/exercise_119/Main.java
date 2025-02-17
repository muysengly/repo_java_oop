import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declare an array of integers 'nums' and an integer 'target'
        int nums[] = {2, 4, 6, 7, 8};
        int target = 7;
        
        // Initialize 'lower' to the start of the array and 'upper' to the end of the array
        int lower = 0;
        int upper = nums.length - 1;
        
        // Initialize 'index' to -1; it will store the position of the 'target'
        int index = -1;
        
        // Perform a binary search to find the 'target' in the 'nums' array
        while (lower <= upper) {
            // Calculate the middle index 'mid'
            int mid = (lower + upper) >> 1;
            
            // Check if 'nums[mid]' is equal to the 'target'
            if (nums[mid] == target) {
                index = mid; // Set 'index' to the position of the 'target'
            }
            
            // Adjust 'lower' and 'upper' based on the comparison with 'target'
            if (nums[mid] >= target) {
                upper = mid - 1; // Move 'upper' to the left half
            } else {
                lower = mid + 1; // Move 'lower' to the right half
            }
        }
        
        // Print the position of the 'target' in the array
        System.out.print("Position of " + target + " is " + index);
    }
}
