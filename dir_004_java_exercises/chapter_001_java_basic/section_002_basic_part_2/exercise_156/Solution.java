import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Initializing an integer variable 'n' with the value 2350
        int n = 2350;

        // Displaying the original number
        System.out.printf("Original Number: %d\n", n);

        // Initializing a variable to count the number of right shifts
        int shift_right_count = 0;

        // Performing right shift operations until 'n' becomes zero
        do {
            n >>= 1; // Right shifting 'n' by 1 bit
            shift_right_count++; // Incrementing the shift count
        } while (n != 0); // Loop continues until 'n' becomes zero

        shift_right_count--; // Decrementing the shift count by 1 to correct the count

        // Displaying the final result (shift count)
        System.out.printf("Result: %s\r\n", shift_right_count);
    }
}
