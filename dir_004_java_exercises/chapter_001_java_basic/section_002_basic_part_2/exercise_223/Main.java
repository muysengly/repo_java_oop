
// Importing necessary Java utilities for input
import java.util.*;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Prompting the user to specify the number of integers to input
        System.out.println("How many integers would you like to input?");
        int n = s.nextInt();

        // Initializing variables for the maximum sum and the current accumulation
        int ans = -100000;
        int acc = 0;

        // Prompting the user to input the integers
        System.out.println("Input the integers:");

        // Looping through each input integer to find the maximum contiguous subsequence
        // sum
        for (int i = 0; i < n; i++) {
            // Accumulating the current integer
            acc += s.nextInt();

            // Updating the maximum sum using Math.max function
            ans = Math.max(ans, acc);

            // Resetting the accumulation to 0 if it becomes negative
            if (acc < 0)
                acc = 0;
        }

        // Outputting the maximum sum of the contiguous subsequence
        System.out.println("Maximum sum of the said contiguous subsequence:");
        System.out.println(ans);
    }
}
