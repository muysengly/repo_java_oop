
// Importing necessary classes for input/output operations and array manipulation
import java.util.*;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input an integer created by 8 numbers from 0 to 9
        System.out.println("Input an integer created by 8 numbers from 0 to 9:");

        // Reading the input string
        String s = sc.next();

        // Initializing an array to store individual digits of the input integer
        int[] num = new int[8];

        // Extracting each digit from the input string and storing it in the array
        for (int i = 0; i < 8; i++) {
            num[i] = Integer.valueOf(s.substring(i, i + 1));
        }

        // Sorting the array in ascending order
        Arrays.sort(num);

        // Initializing variables to calculate the smallest and largest integers
        int a = 0;
        int b = 0;
        int c = 1;

        // Calculating the smallest and largest integers from the sorted array
        for (int i = 0; i < 8; i++) {
            a += num[i] * c;
            b += num[7 - i] * c;
            c *= 10;
        }

        // Outputting the difference between the largest and smallest integers
        System.out.println("Difference between the largest and the smallest integer from the given integer:");
        System.out.println(a - b);
    }
}
