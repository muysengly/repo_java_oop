import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt the user to input the value of n
        System.out.println("Input the value of n: ");
        
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Read an integer from the user
        int n = in.nextInt();
        
        // Continue looping until n becomes 1
        while (n != 1) {
            // Check if n is even
            if (n % 2 == 0) {
                n = n / 2; // If even, divide n by 2
            } else {
                n = (3 * n + 1) / 2; // If odd, perform a calculation
            }
        }
        
        // Print the final value of n
        System.out.println("\nValue of n = " + n);
        
        // Close the Scanner
        in.close();
    }
}
