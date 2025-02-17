
// Importing the necessary Java utility package
import java.util.*;

// Main class named "Main"
public class Main {
    // Method to calculate the outer product of vectors (x1, y1) and (x2, y2) with
    // respect to point (x, y)
    private double outer_product(double x, double y, double x1, double y1, double x2, double y2) {
        // Shifting vectors to be relative to the point (x, y)
        x1 = x1 - x;
        y1 = y1 - y;
        x2 = x2 - x;
        y2 = y2 - y;

        // Calculating the cross product (outer product) of the two vectors
        double s = x1 * y2 - y1 * x2;
        return s;
    }

    // Method to input coordinates and determine if a point is inside a triangle
    public void point() {
        // Creating a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Arrays to store coordinates of the triangle vertices (x, y)
        double[] x = new double[3];
        double[] y = new double[3];

        // Prompting the user to input the coordinates of the three vertices of the
        // triangle
        System.out.println("Input (x1, y1)");
        x[0] = sc.nextDouble();
        y[0] = sc.nextDouble();

        System.out.println("Input (x2, y2)");
        x[1] = sc.nextDouble();
        y[1] = sc.nextDouble();

        System.out.println("Input (x3, y3)");
        x[2] = sc.nextDouble();
        y[2] = sc.nextDouble();

        // Prompting the user to input the coordinates of the point (xp, yp)
        System.out.println("Input (xp, yp)");
        double xp = sc.nextDouble();
        double yp = sc.nextDouble();

        // Array to store the results of the outer product calculations for each edge of
        // the triangle
        boolean[] ans = new boolean[3];

        // Calculating the outer product for each edge and determining if the point is
        // inside the triangle
        for (int i = 0; i < 3; i++) {
            ans[i] = outer_product(xp, yp, x[i], y[i], x[(i + 1) % 3], y[(i + 1) % 3]) > 0.0;
        }

        // Checking if all outer products have the same sign, indicating the point is
        // inside the triangle
        if (ans[0] == ans[1] && ans[1] == ans[2]) {
            // The point is inside the triangle
            // Additional processing, if needed, can be added here
        } else {
            // The point is outside the triangle
            System.out.println("The point is outside the triangle.");
        }
    }

    // Main method to create an object of the class and invoke the point method
    public static void main(String[] args) {
        Main obj = new Main();
        obj.point();
    }
}
