
// Import Scanner class from java.util package for user input
import java.util.*;

// Main class for the solution
public class Solution {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a prime number
        System.out.print("Input a prime number: ");

        // Read the user input as an integer
        int n = in.nextInt();

        // Display the position of the given prime number using the kth_Prime function
        System.out.print("Position of the said Prime number: " + kth_Prime(n));
    }

    // Function to find the position of a given prime number in the sequence of
    // primes
    public static int kth_Prime(int n) {
        // Array to store prime numbers, initialized with the first prime number (2)
        int[] prime_num = new int[10000];
        int num = 3; // Starting from the next number after 2
        int i = 0, index = 0; // Variables for iteration and index tracking
        prime_num[0] = 2; // Initialize the first prime number in the array

        // Continue finding primes until reaching the input number
        while (num <= n) {
            // Iterate through the existing primes to check if num is divisible
            for (i = 0; i <= index; i++) {
                if (num % prime_num[i] == 0) {
                    break;
                }
            }

            // If num is not divisible by any existing primes, add it to the array
            if (i > index) {
                prime_num[++index] = num;
            }

            // Move on to the next number
            num++;
        }

        // Return the position of the input prime number in the sequence
        return index + 1;
    }
}
