
// Importing Scanner class for user input
import java.util.Scanner;

// Defining a class named "Main"
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object for reading user input
        Scanner in = new Scanner(System.in);

        // Prompting the user to input a positive number with a maximum of three digits
        System.out.println("Input a positive number(max three digits):");

        // Reading an integer, formatting it as a three-digit string, and converting it
        // to a character array
        char[] num = String.format("%03d", in.nextInt()).toCharArray();

        // Creating a StringBuilder object to build the result string
        StringBuilder tm = new StringBuilder();

        // Appending "H" to the StringBuilder based on the hundreds digit of the input
        // number
        for (int i = 0; i < num[0] - '0'; i++) {
            tm.append("H");
        }

        // Appending "T" to the StringBuilder based on the tens digit of the input
        // number
        for (int i = 0; i < num[1] - '0'; i++) {
            tm.append("T");
        }

        // Appending numbers from 1 to the units digit to the StringBuilder
        for (int i = 0; i < num[2] - '0'; i++) {
            tm.append(i + 1);
        }

        // Printing the result
        System.out.println("Result:");
        System.out.println(tm.toString());
    }
}
