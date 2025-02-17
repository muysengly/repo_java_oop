
// Importing the necessary package for Scanner class
import java.util.*;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompting the user to input the number of straight lines
        System.out.println("Input number of straight lines:");

        // Reading the input value for the number of straight lines
        int n = scan.nextInt();

        // Outputting the number of regions based on the given formula
        System.out.println("Number of regions:");
        System.out.println((n * (n + 1) >> 1) + 1);
    }
}
