
// Import the java.util package to use utility classes, including Arrays.
import java.util.Arrays;

// Define a class named Exercise27.
public class Exercise27 {
    // The main method for executing the program.
    public static void main(String[] args) {
        // Declare and initialize an array of integers.
        int[] array_nums = { 5, 7, 2, 4, 9 };

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Initialize a counter variable for even numbers.
        int ctr = 0;

        // Use a loop to iterate through the array elements and count even numbers.
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0)
                ctr++;
        }

        // Print the number of even and odd numbers in the array.
        System.out.println("Number of even numbers : " + ctr);
        System.out.println("Number of odd numbers  : " + (array_nums.length - ctr));
    }
}
