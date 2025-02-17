import java.util.*;

public class Exercise66 {
    public static void main(String[] args) {
        // Initialize variables for sum, counter, and the number 'n'
        int sum = 1;
        int ctr = 0;
        int n = 0;

        // Iterate while the counter is less than 100
        while (ctr < 100) {
            n++;

            // Check if the number is odd
            if (n % 2 != 0) {
                // If the number is prime, add it to the sum
                if (is_Prime(n)) {
                    sum += n;
                }
            }

            // Increment the counter
            ctr++;
        }

        // Print the sum of prime numbers up to 100
        System.out.println("\nSum of the prime numbers till 100: " + sum);
    }

    // Check if a number is prime
    public static boolean is_Prime(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
