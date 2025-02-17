import java.util.*;

public class Exercise57 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        
        // Read an integer from the user
        int x = in.nextInt();
        
        // Call the result method and print the result
        System.out.println(result(x));
    }

    // Define a method to calculate the number of divisors for a given integer
    public static int result(int num) {
        int ctr = 0;
        
        // Iterate from 1 to the square root of the input number
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            // Check if 'i' is a divisor, and if it's not a perfect square
            if (num % i == 0 && i * i != num) {
                ctr += 2;  // Increase the count by 2
            } else if (i * i == num) {
                ctr++;  // If 'i' is a perfect square, increase the count by 1
            }
        }
        return ctr;  // Return the total count of divisors
    }
}
