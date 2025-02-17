 import java.util.Scanner;

public class Solution {
    // Method to count the number of zero bits in the binary representation of a number
    public static int countBitsTozeroBasedOnString(int n) {
        int ctr = 0; // Initialize counter to count zero bits
        String binaryNumber = Integer.toBinaryString(n); // Convert integer 'n' to its binary representation
        System.out.print("Binary representation of " + n + " is: " + binaryNumber); // Display binary representation
        for (char ch : binaryNumber.toCharArray()) {
            ctr += ch == '0' ? 1 : 0; // Increment counter for each '0' bit encountered
        }
        return ctr; // Return count of zero bits
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create Scanner object to take user input
        System.out.print("Input first number: "); // Prompt user to input a number
        int n = in.nextInt(); // Read input number

        System.out.println("\nNumber of zero bits: " + countBitsTozeroBasedOnString(n)); // Display count of zero bits
    }
}
