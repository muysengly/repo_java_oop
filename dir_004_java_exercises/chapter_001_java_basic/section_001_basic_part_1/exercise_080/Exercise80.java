import java.util.Arrays;

public class Exercise80 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {20, 30, 40};
        
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums)); 
        
        // Initialize a variable, max_val, with the first element of the array
        int max_val = array_nums[0];
        
        // Check if the last element of the array is greater than max_val and update max_val if necessary
        if (array_nums[2] >= max_val)
            max_val = array_nums[2];
        
        // Print the larger value between the first and last elements of the array
        System.out.println("Larger value between first and last element: " + max_val); 
    }
}
