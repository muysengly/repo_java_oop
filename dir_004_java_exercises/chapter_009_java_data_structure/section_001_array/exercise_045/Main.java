// Import the Arrays class to use the toString method for array display.
import java.util.Arrays;

// Define the Main class.
public class Main
{
    // Define an integer array named 'arra'.
    static int arra[] = new int[]{10, 20, 30, 40, 50, 60};

    // Define a method to rotate the array elements.
    static void rotate_array()
    {
        // Store the last element of the array in variable 'a'.
        int a = arra[arra.length - 1];
        int i;

        // Iterate through the array to shift elements to the right.
        for (i = arra.length - 1; i > 0; i--)
            arra[i] = arra[i - 1];

        // Set the first element of the array to 'a' (rotating it to the end).
        arra[0] = a;
    }

    // The main method for executing the program.
    public static void main(String[] args)
    {
        // Display the original array.
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arra));

        // Call the rotate_array method to rotate the array.
        rotate_array();

        // Display the rotated array.
        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(arra));
    }
}
