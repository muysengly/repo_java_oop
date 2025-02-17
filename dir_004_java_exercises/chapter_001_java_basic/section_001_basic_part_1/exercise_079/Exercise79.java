import java.util.Arrays;

public class Exercise79 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {20, 30, 40};
        
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums)); 
        
        // Create a new array by rotating the elements of the original array
        int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
        
        // Print the elements of the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(new_array_nums)); 
    }
}
