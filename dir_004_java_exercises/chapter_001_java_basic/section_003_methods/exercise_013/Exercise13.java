import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Side-1: ");
        double side1 = in.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = in.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = in.nextDouble();
        System.out.println(
                is_Valid(side1, side2, side3) ? "The area of the triangle is " + area_triangle(side1, side2, side3)
                        : "Invalid triangle");
    }

    public static boolean is_Valid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2)
            return true;
        else
            return false;
    }

    public static double area_triangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
