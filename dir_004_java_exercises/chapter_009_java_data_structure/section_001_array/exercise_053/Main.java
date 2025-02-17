// Import the necessary Java input/output and utility classes.
import java.io.*;
import java.util.Arrays;

// Define the Main class.
public class Main {
   
    public static void main(String[] args)
    {
        // Create an array of integers.
        int nums[] = {45, 20, 100, 23, -5, 2, -6};
        int result[];
        
        // Print the original array.
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));

        // Call the next_greatest_num method to modify the array.
        result = next_greatest_num(nums);
        
        // Print the modified array.
        System.out.println("The modified array:");
        System.out.println(Arrays.toString(result));
    }

    // A method to modify the array by replacing each element with the next greatest number.
    static int[] next_greatest_num(int arr_nums[])
    {
        // Get the size of the array.
        int size = arr_nums.length;
        
        // Initialize the maximum element from the right side.
        int max_from_right_num = arr_nums[size - 1];
        
        // Set the last element of the array to -1.
        arr_nums[size - 1] = -1;

        // Iterate through the array from right to left.
        for (int i = size - 2; i >= 0; i--)
        {
            int temp = arr_nums[i];
            
            // Replace the current element with the maximum from the right side.
            arr_nums[i] = max_from_right_num;
            
            // Update the maximum from the right side if needed.
            if (max_from_right_num < temp)
                max_from_right_num = temp;
        }

        // Return the modified array.
        return arr_nums;
    } 
}
