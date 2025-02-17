
// Importing necessary Java libraries
import java.math.BigInteger;
import java.util.Scanner;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String args[]) {
        // Creating a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input two integers
        System.out.println("Input two integers:");

        // Declaring and initializing two strings to store user input
        String s1 = new String();
        String s2 = new String();

        // Reading the first integer as a string
        s1 = sc.nextLine();

        // Reading the second integer as a string
        s2 = sc.nextLine();

        // Creating BigInteger objects from the input strings
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        // Creating a BigInteger object to store the result of addition
        BigInteger result = new BigInteger("0");

        // Adding the two input BigIntegers and storing the result
        result = result.add(b1);
        result = result.add(b2);

        // Converting the result to a string
        String s3 = "" + result;

        // Displaying the sum of the two integers
        System.out.println("\nSum of the said two integers:");

        // Checking for overflow by comparing the lengths of the input and result
        // strings
        if (s1.length() > 80 || s2.length() > 80 || s3.length() > 80)
            System.out.println("Overflow");
        else
            System.out.println(result);
    }
}
