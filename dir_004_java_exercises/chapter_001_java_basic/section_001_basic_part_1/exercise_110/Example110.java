import java.util.Scanner;

public class Example110 {
    public static void main(String[] arg) {
        int test = 0; // Initialize a variable 'test' to 0
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Input a positive integer: "); // Prompt the user to input a positive integer
        
        int n = in.nextInt(); // Read the user's input as an integer 

        if (n < 1) {
            System.out.print(Boolean.toString(false)); // If n is less than 1, print "false" and set 'test' to 1
            test = 1;
        }

        if ((n & (n - 1)) != 0) {
            System.out.print(Boolean.toString(false)); // If n is not a power of 2, print "false" and set 'test' to 1
            test = 1;
        }

        if (test == 0) {
            System.out.print(Boolean.toString((n & 0x55555555) != 0)); // If 'test' is 0, check if n has odd bits set and print the result
        }

        System.out.print("\n"); // Print a new line
    }	
}
