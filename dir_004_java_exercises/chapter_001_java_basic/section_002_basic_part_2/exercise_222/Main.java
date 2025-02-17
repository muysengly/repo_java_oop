
// Importing necessary Java utilities for input
import java.util.*;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompting the user to input coordinates for point P(x1, y1)
        System.out.println("Input P(x1, y1), separated by a space.");
        double x1 = in.nextDouble(), y1 = in.nextDouble();

        // Prompting the user to input coordinates for point Q(x2, y2)
        System.out.println("Input Q(x2, y2), separated by a space.");
        double x2 = in.nextDouble(), y2 = in.nextDouble();

        // Prompting the user to input coordinates for point R(x3, y3)
        System.out.println("Input R(x3, y3), separated by a space.");
        double x3 = in.nextDouble(), y3 = in.nextDouble();

        // Prompting the user to input coordinates for point S(x4, y4)
        System.out.println("Input S(x4, y4), separated by a space.");
        double x4 = in.nextDouble(), y4 = in.nextDouble();

        // Calculating differences between coordinates to represent vectors
        double p1 = x2 - x1, p2 = y2 - y1, q1 = x4 - x3, q2 = y4 - y3,
                r1 = x3 - x1, r2 = y3 - y1, s1 = x4 - x1, s2 = y4 - y1;

        // Checking if the cross product of vectors P-Q and R-S is close to zero
        if (Math.abs(p1 * q2 - p2 * q1) < 1e-9)
            // Output if the cross product is close to zero, indicating parallel lines
            System.out.println("Two lines are parallel.");
        else
            // Output if the cross product is not close to zero, indicating non-parallel
            // lines
            System.out.println("Two lines are not parallel.");
    }
}
