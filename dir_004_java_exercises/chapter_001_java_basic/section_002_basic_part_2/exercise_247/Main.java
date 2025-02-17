
// Importing Scanner class for user input
import java.util.Scanner;

// Defining a class named "Main"
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object for reading user input
        Scanner in = new Scanner(System.in);

        // Prompting the user to input three integers (a, b, c)
        System.out.println("Input three integers (a, b, c):");

        // Reading long integers a, b, and c from the user
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        // Prompting the user with a message
        System.out.println("Check whether (a + b) is greater than c?");

        // Checking and printing whether the sum of a and b is greater than c
        System.out.println(a + b > c);
    }
}
