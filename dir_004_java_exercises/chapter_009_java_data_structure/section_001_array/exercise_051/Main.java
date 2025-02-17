// Import the necessary Java utility class for working with arrays.
import java.util.Arrays;

// Define the Main class.
public class Main {
    public static void main(String[] args)
    {
        // Create an array of integers containing 0s and 1s.
        int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1, 0 };
        int result[];
        
        // Print the original array.
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        // Get the length of the array.
        int n = arr.length;
 
        // Call the separate_0_1 method to separate 0s and 1s.
        result = separate_0_1(arr, n);
        
        // Print the rearranged array.
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
    }
    
    // A method to separate 0s and 1s in an array.
    static int[] separate_0_1(int arr[], int n)
     {
        // Initialize a count to track the number of 0s.
        int count = 0;   
     
        // Count the number of 0s in the array.
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        // Set the first 'count' elements to 0.
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        // Set the remaining elements to 1.
        for (int i = count; i < n; i++)
            arr[i] = 1;
    
        // Return the modified array.
        return arr;
     }       
}
