// Import the necessary Java utilities package.
import java.util.Arrays;

// Define a class named Main.
public class Main {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Create an integer array with numeric values.
        int[] my_array = {
            10789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
        
        // Print the original numeric array.
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        
        // Sort the array to find the second largest value.
        Arrays.sort(my_array);
        
        // Initialize an index to the last element's index.
        int index = my_array.length - 1;
        
        // Find the second largest value by iterating from the end of the array.
        while (my_array[index] == my_array[my_array.length - 1]) {
            index--;
        }
        
        // Print the second largest value found.
        System.out.println("Second largest value: " + my_array[index]);
    }
}
