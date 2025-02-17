import java.util.*;

public class Exercise56 {
    public static void main(String[] args) {
        // Initialize variables x, y, and p
        int x = 5;
        int y = 20;
        int p = 3;

        // Call the result method and print the result
        System.out.println(result(x, y, p));
    }

    // Define a method to calculate the result based on x, y, and p
    public static int result(int x, int y, int p) {
        // Check if x is divisible by p
        if (x % p == 0) {
            // Calculate the result and return it
            return (y / p - x / p + 1);
        } else {
            // Calculate the result and return it
            return (y / p - x / p);
        }
    }
}
