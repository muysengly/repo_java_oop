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
        int arr[] = {1, 5, -4, 7, 8, -6};
        int size = arr.length;
        int l, r, min_sum, sum, min_l_num, min_r_num;

        // Check if the array has less than 2 elements.
        if(size < 2)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Initialize variables to track the indices and minimum sum.
        min_l_num = 0;
        min_r_num = 1;
        min_sum = arr[0] + arr[1];

        // Nested loops to find the pair with the minimum sum.
        for(l = 0; l < size - 1; l++)
        {
            for(r = l+1; r < size; r++)
            {
                sum = arr[l] + arr[r];

                // Update min_sum and indices if a smaller sum is found.
                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_l_num = l;
                    min_r_num = r;
                }
            }
        }

        // Print the two elements whose sum is minimum.
        System.out.println("Two elements whose sum is minimum are " +
                            arr[min_l_num] + " and " + arr[min_r_num]);
    }
}
