import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Prompting the user to input two integers (a and b)
        System.out.println("Input two integers(a b):");

        // Creating a Scanner object for user input
        Scanner stdIn = new Scanner(System.in);

        // Reading the values of integers a and b from user input
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        // Calculating the sum of integers a and b
        int sum = a + b;

        // Initializing a variable to count the number of digits in the sum
        int count = 0;

        // Counting the number of digits in the sum using a while loop
        while (sum != 0) {
            sum /= 10;
            ++count;
        }

        // Displaying the digit number of the sum of the two integers
        System.out.println("Digit number of sum of said two integers:");
        System.out.println(count);
    }
} 
