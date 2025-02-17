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
        int arr[] = {5, 7, -8, 5, 14, 1};
        
        int first_element, second_element, arr_size = arr.length;

        // Check if the array size is less than two.
        /* Return if the array size less than two */
        if (arr_size < 2)
        {
            System.out.println("Array size is less than two.");
            return;
        }

        // Initialize variables to find the first and second smallest elements.
        first_element = second_element = Integer.MAX_VALUE;
        
        // Loop through the array to find the smallest and second smallest elements.
        for (int i = 0; i < arr_size; i++)
        {
            /* Update both first and second if the current element is smaller than first. */
            if (arr[i] < first_element)
            {
                second_element = first_element;
                first_element = arr[i];
            }

            /* Update second if arr[i] is between first and second elements. */
            else if (arr[i] < second_element && arr[i] != first_element)
                second_element = arr[i];
        }
        
        // Check and print the results.
        if (second_element == Integer.MAX_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("The smallest element is " +
                               first_element + " and the second smallest element is " + second_element + ".");
    }
}
