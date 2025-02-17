// Import necessary Java libraries.
import java.util.*;
import java.lang.*;

// Define a class named Main.
public class Main
{
    // The main method for executing the program.
    public static void main(String[] args) 
    {  
        // Define an array of integers.
        int nums[] = {6, 7, 9, 16, 25, 12, 30, 40};
        int n = nums.length;
        System.out.println("Original Array : " + Arrays.toString(nums));  

        // Sort the array elements in non-decreasing order.
        Arrays.sort(nums);
        
        // Initialize count of triangles.
        int ctr = 0;

        // Iterate through the array elements to count the number of triangles.
        for (int i = 0; i < n - 2; ++i)
        {
            int x = i + 2;

            for (int j = i + 1; j < n; ++j)
            {
                while (x < n && nums[i] + nums[j] > nums[x])
                    ++x;
                ctr += x - j - 1;
            }
        }

        System.out.println("Total number of triangles: " + ctr);
    }
}
