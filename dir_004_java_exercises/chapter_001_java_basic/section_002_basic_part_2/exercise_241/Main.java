
// Importing the necessary Java utility package
import java.util.*;

// Main class named "Main"
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input a positive integer
        System.out.println("Input a positive integer:");

        // Initializing arrays to store temporary and final results
        int[] temp = new int[2001];
        int[] ans = new int[4001];

        // Nested loops to calculate combinations and populate the 'temp' array
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                temp[i + j]++;
            }
        }

        // Nested loops to calculate combinations and populate the 'ans' array
        for (int i = 0; i <= 2000; i++) {
            for (int j = 0; j <= 2000; j++) {
                ans[i + j] += temp[i] * temp[j];
            }
        }

        // Reading a positive integer from the user
        int n = sc.nextInt();

        // Prompting the user with the result
        System.out.println("Number of combinations of a, b, c, d:");

        // Printing the final result
        System.out.println(ans[n]);
    }
}
