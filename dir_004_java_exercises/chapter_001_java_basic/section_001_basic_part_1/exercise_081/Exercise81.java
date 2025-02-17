import java.util.Arrays;

public class Exercise81 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {20, 30, 40};
        
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums)); 
        
        // Store the value of the first element in the variable x
        int x = array_nums[0];
        
        // Swap the first and last elements of the array
        array_nums[0] = array_nums[array_nums.length - 1];
        array_nums[array_nums.length - 1] = x;
        
        // Print the new array after swapping the first and last elements
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(array_nums));  
    }
}
