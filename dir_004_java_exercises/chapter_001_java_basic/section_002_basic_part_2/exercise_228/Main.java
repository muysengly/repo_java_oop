
// Importing the Scanner class for user input
import java.util.*;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner stdIn = new Scanner(System.in);

        // Prompting the user to input the number of combinations and sum (separated by
        // a space in a line)
        System.out.println("Input number of combinations and sum (separated by a space in a line):");

        // Reading the number of combinations (n) and the sum (s) from the user
        int n = stdIn.nextInt();
        int s = stdIn.nextInt();

        // Calling the comnum method to calculate the number of combinations
        int c1 = comnum(0, n, s, 0);

        // Prompting the user with the number of combinations
        System.out.println("Number of combinations:");
        System.out.println(c1);
    }

    // Recursive method to calculate the number of combinations
    public static int comnum(int i, int n, int s, int p) {
        // Base case: If the sum (p) matches the target sum (s) and no more elements (n)
        // are left
        if (s == p && n == 0) {
            return 1;
        }

        // Base case: If all elements are considered (i reaches 10), return 0
        if (i >= 10) {
            return 0;
        }

        // Base case: If the sum (p) exceeds the target sum (s), return 0
        if (p > s) {
            return 0;
        }

        // Recursive calls for including and excluding the current element
        int c1 = comnum(i + 1, n - 1, s, p + i);
        int c2 = comnum(i + 1, n, s, p);

        // Returning the sum of combinations from both recursive calls
        return c1 + c2;
    }
}
