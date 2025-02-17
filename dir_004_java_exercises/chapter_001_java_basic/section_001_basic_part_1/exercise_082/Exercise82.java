import java.util.Arrays;

public class Exercise82 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {20, 30, 40, 50, 67};
        
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums)); 
        
        // Initialize a variable max_val with the value of the first element
        int max_val = array_nums[0];
        
        // Check if the last element is greater than max_val
        if (max_val <= array_nums[array_nums.length - 1])
            max_val = array_nums[array_nums.length - 1];
        
        // Check if the middle element is greater than max_val
        if (max_val <= array_nums[array_nums.length / 2])
            max_val = array_nums[array_nums.length / 2];
        
        // Print the largest element among the first, last, and middle values
        System.out.println("Largest element between first, last, and middle values: " + max_val);  
    }
}
