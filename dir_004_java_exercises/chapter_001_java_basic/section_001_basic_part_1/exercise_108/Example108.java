import java.util.Scanner;

public class Example108 {
    public static void main(String[] arg) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");
        
        // Read the user's input as an integer
        int n = in.nextInt(); 

        if (n > 0) {
            // Check if n is a positive integer
            System.out.print("The single digit number is: " + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
        }
        
        // Close the input scanner
        in.close();
        System.out.println("\n");  
    }
}
