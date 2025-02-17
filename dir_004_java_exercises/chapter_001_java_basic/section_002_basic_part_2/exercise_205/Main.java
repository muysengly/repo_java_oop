import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize a boolean variable
        boolean b = true;

        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");
        int num = in.nextInt();

        // Start a block of code
        {
            // Continue looping until num becomes 1
            while (num != 1) {
                // Check if num is odd
                if (num % 2 != 0) {
                    // Toggle the boolean variable
                    b = !b;

                    // Print the current value of the boolean variable and exit the program
                    System.out.print(b);
                    System.exit(0);
                }

                // Divide num by 2
                num = num / 2;
            }

            // Print the final value of the boolean variable
            System.out.print(b);
        }
    }
} 
