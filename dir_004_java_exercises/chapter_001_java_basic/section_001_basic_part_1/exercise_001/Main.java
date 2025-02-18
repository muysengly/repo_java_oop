
import java.util.Scanner; // Import the Scanner class

public class Main { // Declare a class named Main
    public static void main(String[] args) { // Declare the main method
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt the user to input their first name
        System.out.print("Input your first name: ");
        String fname = input.next(); // Read the user's input

        // Prompt the user to input their last name
        System.out.print("Input your last name: ");
        String lname = input.next();

        // Output a greeting message with the user's full name
        System.out.println(); // Print a newline
        System.out.println("Hello \n" + fname + " " + lname);

        // Close the Scanner object

    }
}
