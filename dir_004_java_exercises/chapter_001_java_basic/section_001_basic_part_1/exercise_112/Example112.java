import java.util.Scanner;

public class Example112 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Input a number: "); // Prompt the user to input a number
        int n = in.nextInt(); // Read and store the user's input as 'n'
        int n1 = n; // Create a copy of 'n' to preserve the original value
        long ctr = 0; // Initialize a variable 'ctr' to count trailing zeros

        while (n != 0) {
            ctr += n / 5; // Count the number of trailing zeros by dividing 'n' by 5 and accumulating the result
            n /= 5; // Reduce 'n' by dividing it by 5 for the next iteration
        }
        System.out.printf("Number of trailing zeros of the factorial %d is %d ", n1, ctr); // Print the result
        System.out.printf("\n"); // Print a new line
    }
} 
