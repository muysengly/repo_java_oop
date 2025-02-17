
// Importing the Scanner class for user input
import java.util.Scanner;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store the count of occurrences for each integer (0-99)
        int cnt[] = new int[100];

        // Variable to track the current index in the loop
        int i;

        // Prompting the user to input the number of integers
        System.out.println("How many integers would you like to input (Max. 100)?");

        // Reading the input value for the number of integers
        int x = input.nextInt();

        // Prompting the user to input the integers
        System.out.println("Input the integers:");

        // Loop to process user input and update the count array
        for (i = 0; i < x; i++) {
            // Reading the next integer from the input
            int n = input.nextInt();

            // Updating the count array based on the input integer
            cnt[--n]++;
        }

        // Variable to store the maximum count
        int max = 0;

        // Loop to find the maximum count in the count array
        for (int n : cnt) {
            if (max < n) {
                max = n;
            }
        }

        // Prompting the user with the mode value(s) in ascending order
        System.out.println("Mode value(s) in ascending order:");

        // Loop to find and print the mode value(s)
        for (i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                // Printing the mode value (adding 1 to get the original value)
                System.out.println(i + 1);
            }
        }
    }
}
