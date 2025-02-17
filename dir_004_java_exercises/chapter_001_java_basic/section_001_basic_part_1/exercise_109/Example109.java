import java.util.Scanner;

public class Example109 {
    public static void main(String[] arg) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");
        
        // Read the user's input as an integer
        int n = in.nextInt(); 

        if (n > 0) {
            // Check if n is a positive integer
            double sqrtResult = Math.sqrt(8 * (long) n + 1);  // Calculate the square root
            int numRows = (int) ((sqrtResult - 1) / 2);      // Calculate the number of rows
            System.out.println("Number of rows: " + numRows);
        }
        
        // Close the input scanner
        in.close();
    }	
}
