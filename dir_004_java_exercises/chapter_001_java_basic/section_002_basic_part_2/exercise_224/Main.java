
// Importing the Scanner class for user input
import java.util.Scanner;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String arg[]) {
        // Creating a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompting the user to input x1, y1, and r1 for the first circle
        System.out.println("Input x1, y1, r1: (numbers are separated by a space)");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), r1 = in.nextDouble();

        // Prompting the user to input x2, y2, and r2 for the second circle
        System.out.println("Input x2, y2, r2: (numbers are separated by a space)");
        double x2 = in.nextDouble(), y2 = in.nextDouble(), r2 = in.nextDouble();

        // Calculating the distance between the centers of the two circles
        double l = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Checking the relationship between the circles based on their radii and
        // distance
        if (l > r1 + r2)
            System.out.println("Circumference of C1 and C2 intersect");
        else if (r1 > l + r2)
            System.out.println("C2 is in C1");
        else if (r2 > l + r1)
            System.out.println("C1 is in C2");
        else
            System.out.println("C1 and C2 do not overlap");
    }
}
