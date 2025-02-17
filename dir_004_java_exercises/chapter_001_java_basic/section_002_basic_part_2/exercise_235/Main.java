
// Importing the necessary package for Scanner class
import java.util.*;

// Importing the static Math class for using static methods
import static java.lang.Math.*;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String args[]) {
        // Prompting the user to input coordinates
        System.out.println("Input xp, yp, xq, yq, xr, yr, xs, ys:");

        // Creating a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Arrays to store x and y coordinates
        double x[] = new double[4];
        double y[] = new double[4];

        // Reading input for coordinates
        for (int i = 0; i < 4; i++) {
            x[i] = scan.nextDouble();
            y[i] = scan.nextDouble();
        }

        // Calculating the product of differences for x and y coordinates
        double a = (x[0] - x[1]) * (x[2] - x[3]);
        double b = (y[0] - y[1]) * (y[2] - y[3]);

        // Checking if the sum of products is zero to determine orthogonality
        if ((float) a + (float) b == 0)
            System.out.println("Two lines are orthogonal.");
        else
            System.out.println("Two lines are not orthogonal.");
    }
}
