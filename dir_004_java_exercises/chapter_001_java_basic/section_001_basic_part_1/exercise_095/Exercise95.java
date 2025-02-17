import java.util.*;

public class Exercise95 {
    public static void main(String[] args) {
        // Define the number of elements in the array
        int n = 5;

        // Create an array of strings with n elements
        String[] arr_string = new String[n];

        // Initialize the array with string representations of numbers
        for (int i = 0; i < n; i++) {
            arr_string[i] = String.valueOf(i);
        }

        // Display the new array
        System.out.println("New Array: " + Arrays.toString(arr_string));
    }
}
