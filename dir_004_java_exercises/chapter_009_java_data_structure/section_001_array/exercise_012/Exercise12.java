
// Import the Arrays class from the java.util package.
import java.util.Arrays;

// Define a class named Exercise12.
public class Exercise12 {

    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };

        // Iterate through the elements of the array.
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                // Check if two elements are equal and not the same element.
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element : " + my_array[j]);
                }
            }
        }
    }
}
