
// Importing the Scanner class to read user input
import java.util.Scanner;

// Main class named "test"
public class test {
    // Main method
    public static void main(String[] args) {
        // Prompting the user to input the number (n)
        System.out.println("Input the number(n):");

        // Creating a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Reading the input number (n) from the user
        int c = s.nextInt();

        // Initializing a counter for prime numbers
        int prime_ctr = 0;

        // Loop to iterate through numbers and check for primes
        for (int i = 2; i <= c; i++) {
            // Checking if the current number is prime using the Check_Prime method
            if (Check_Prime(i)) {
                prime_ctr++;
            }
        }

        // Displaying the number of prime numbers which are less than or equal to n
        System.out.println("Number of prime numbers which are less than or equal to " + c + ": " + prime_ctr);
    }

    // Method to check if a given number is prime
    public static boolean Check_Prime(int n) {
        // Loop to check for factors of the number
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            // If the number has a factor other than 1 and itself, it is not prime
            if (n % divisor == 0) {
                return false;
            }
        }

        // If no factors were found, the number is prime
        return true;
    }
}
