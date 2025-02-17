// Import necessary Java libraries.
import java.util.*;
import java.lang.*;

// Define a class named Main.
public class Main
{
    // The main method for executing the program.
    public static void main(String[] args) 
    {  
        // Define an array of integers containing 0s and 1s.
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i, nums_size = nums.length;
        int left = 0, right = nums_size - 1;
        
        // Print the original array.
        System.out.println("Original Array : " + Arrays.toString(nums));  

        // Perform segregation of 0s and 1s in the array.
        while (left < right) 
        {
            /* While 0 at the left, increment the left index. */
            while (nums[left] == 0 && left < right)
                left++;

            /* While we see 1 at the right, decrement the right index. */
            while (nums[right] == 1 && left < right)
                right--;

            if (left < right) 
            {
                // Swap 0 and 1 and increment left and decrement right.
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }

        // Print the array after segregation.
        System.out.println("Array after segregation is : " + Arrays.toString(nums));  
    }
}
