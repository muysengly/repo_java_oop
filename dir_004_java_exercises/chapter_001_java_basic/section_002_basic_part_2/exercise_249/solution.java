
// Importing the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Defining a class named "solution"
public class solution {

    // Method to count the number of set bits (1s) in the binary representation of a
    // number
    static int count_Set_Bits(int num) {
        int ctr = 0;

        // Looping until the number becomes zero
        while (num != 0) {
            // Using bitwise AND operation to clear the rightmost set bit and incrementing
            // the counter
            num = num & (num - 1);
            ctr++;
        }

        // Returning the count of set bits
        return ctr;
    }

    // Main method, the entry point of the program
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input a number
        System.out.print("Input a number: ");

        // Reading the input number from the user
        int num = sc.nextInt();

        // Calling the count_Set_Bits method and printing the result
        System.out.println(count_Set_Bits(num));

        // Closing the Scanner to avoid resource leaks
        sc.close();
    }
}
