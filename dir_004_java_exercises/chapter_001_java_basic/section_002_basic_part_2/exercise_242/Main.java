
// Importing the necessary Java utility package
import java.util.*;

// Main class named "Main"
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input the number of rows/columns (0 to exit)
        System.out.println("Input number of rows/columns (0 to exit)");

        // Continuous loop to handle multiple inputs until 0 is entered
        while (true) {

            // Reading an integer from the user
            int n = sc.nextInt();

            // Checking if the entered value is 0, and breaking the loop if true
            if (n == 0)
                break;

            // Creating a 2D array 'map' with dimensions (n+1) x (n+1)
            int[][] map = new int[n + 1][n + 1];

            // Nested loops to populate the 'map' array with user inputs and calculate row
            // sums
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                    map[i][n] += map[i][j];
                }
                map[n][n] += map[i][n];
            }

            // Nested loops to calculate column sums
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[n][i] += map[j][i];
                }
            }

            // Printing the result header
            System.out.println("Result:");

            // Nested loops to print the final 'map' array
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    // Formatting and printing each element of the array
                    System.out.printf("%5d", map[i][j]);
                }
                // Moving to the next line after each row is printed
                System.out.println();
            }
        }
    }
}
