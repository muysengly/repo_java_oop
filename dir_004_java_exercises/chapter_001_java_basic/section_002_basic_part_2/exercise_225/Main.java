
// Importing the Scanner class for user input
import java.util.*;

// Main class named "Main"
public class Main {

    // Array to store the number of days in each month
    static int days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Array to store the names of the days
    static String name[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    // Main method to execute the program
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompting the user to input month and date (0 0 to exit)
        System.out.println("Input month and date (0 0 to exit)");

        // Infinite loop for continuous input until 0 0 is entered
        for (;;) {
            // Reading the input values for month and date
            int m = in.nextInt(), d = in.nextInt();

            // Checking for the exit condition
            if (m == 0 && d == 0)
                break;

            // Calling the solve method and printing the result
            System.out.println(solve(m, d));
        }
    }

    // Method to determine the day of the week based on the given month and date
    static String solve(int month, int date) {
        // Setting the initial day to Wednesday (index 3 in the 'name' array)
        int cur = 3;

        // Calculating the day index for the given month and date
        for (int i = 0; i < month - 1; i++) {
            cur += days[i];
        }
        cur += date - 1;

        // Returning the name of the day based on the calculated index
        return name[cur % 7];
    }
}
