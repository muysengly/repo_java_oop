
// Import the java.util package to use utility classes, including Arrays.
import java.util.*;

// Import the java.io package to use input and output classes.
import java.io.*;

// Define a class named Exercise32.
public class Exercise32 {
    // The main method for executing the program.
    public static void main(String[] args) {
        // Declare and initialize an array of integers.
        int[] array_nums = { 77, 77, 65, 65, 65, 77 };

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Define two numbers to be checked in the array.
        int num1 = 77;
        int num2 = 65;

        // Call the result method with the array and two numbers as arguments and print
        // the result.
        System.out.println("Result: " + result(array_nums, num1, num2));
    }

    // Define a method named result that takes an array of integers and two numbers
    // as inputs.
    public static boolean result(int[] array_nums, int num1, int num2) {
        // Use an enhanced for loop to iterate through the array elements.
        for (int number : array_nums) {
            // Check if the current number is not equal to num1 and not equal to num2.
            boolean r = number != num1 && number != num2;
            // If the condition is met, return false.
            if (r) {
                return false;
            }
        }
        // If all elements in the array are either num1 or num2, return true.
        return true;
    }
}
