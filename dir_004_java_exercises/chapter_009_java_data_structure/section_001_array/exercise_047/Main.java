// Define the Main class.
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    // Define a method to count the number of rotations in the sorted array.
    static int count_rotations(int arr_int[], int n)
    {
        int min_val = arr_int[0];
        int min_index = -1;
        
        // Iterate through the array to find the minimum element.
        for (int i = 0; i < n; i++)
        {
            if (min_val > arr_int[i])
            {
                min_val = arr_int[i];
                min_index = i;
            }
        }

        // Return the index of the minimum element, which is the count of rotations.
        return min_index;
    }
    
    // The main method for executing the program.
    public static void main(String[] args)
    {
        int arr_int[] = {35, 32, 30, 14, 18, 21, 27};
        // int arr_int[] = {35, 32, 14, 18, 21, 27};
        // int arr_int[] = {35, 14, 18, 21, 27};
        int n = arr_int.length;

        // Print the number of rotations in the sorted array.
        System.out.println(count_rotations(arr_int, n));
    }
}
