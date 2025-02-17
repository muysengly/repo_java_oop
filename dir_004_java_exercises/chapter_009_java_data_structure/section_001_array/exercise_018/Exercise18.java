// Import the necessary Java utilities package.
import java.util.Arrays;

// Define a class named Exercise18.
public class Exercise18 {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Create an integer array with numeric values.
        int[] my_array = {-1, 4, 0, 2, 7, -3};
        
        // Print the original numeric array.
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        
        // Initialize variables to find the minimum and second minimum values.
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        
        // Iterate through the array to find the second lowest number.
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == min) {
                // If the current element equals the minimum, update the second minimum.
                second_min = min;
            } else if (my_array[i] < min) {
                // If the current element is less than the minimum, update both minimum and second minimum.
                second_min = min;
                min = my_array[i];
            } else if (my_array[i] < second_min) {
                // If the current element is less than the second minimum, update the second minimum.
                second_min = my_array[i];
            }
        }

        // Print the second lowest number found.
        System.out.println("Second lowest number is : " + second_min);
    }
}
