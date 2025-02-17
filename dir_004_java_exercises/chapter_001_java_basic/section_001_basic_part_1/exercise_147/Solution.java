import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Test the bitSwapRequired function and print the result
        System.out.println(bitSwapRequired(27, 23));
    }

    public static int bitSwapRequired(int x, int y) {
        int ctr = 0; // Initialize a counter to keep track of bit differences

        // XOR the two integers (x and y) to find differing bits
        for (int z = x ^ y; z != 0; z = z >>> 1) {
            // Right shift 'z' by 1 bit and check the least significant bit
            ctr += z & 1; // If the least significant bit is 1, increment the counter
        }
        return ctr; // Return the total count of differing bits
    }
}
