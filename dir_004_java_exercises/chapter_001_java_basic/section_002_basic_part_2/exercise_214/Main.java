import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Creating ArrayDeque to store Double values for x and y
        ArrayDeque<Double>x = new ArrayDeque<>();
        ArrayDeque<Double> y = new ArrayDeque<>();
        // Prompting the user to input the values of a, b, c, d, e, f
        System.out.println("Input the value of a, b, c, d, e, f:");
        // Reading values for coefficients a, b, c, d, e, f
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        // Calculating values for variables s and t
        double t = (double) (d * c - a * f) / (d * b - a * e);
        double s = (double) (c - t * b) / a;
        // Pushing the calculated values of x and y into the respective Deques
        x.push(s);
        y.push(t);
        // Getting the size of the Deques
        int num = x.size();
        // Iterating through the Deques to print the results with rounded values
        for (int i = 0; i < num; i++) {
            BigDecimal bdx = new BigDecimal(x.pollLast());
            BigDecimal bdy = new BigDecimal(y.pollLast());
            BigDecimal ansx = bdx.setScale(4, BigDecimal.ROUND_HALF_UP);
            BigDecimal ansy = bdy.setScale(4, BigDecimal.ROUND_HALF_UP);
            // Printing the rounded values of x and y
            System.out.printf("%.3f", ansx.doubleValue());
            System.out.print(" ");
            System.out.printf("%.3f", ansy.doubleValue());
            System.out.println();
        }
    }
}
