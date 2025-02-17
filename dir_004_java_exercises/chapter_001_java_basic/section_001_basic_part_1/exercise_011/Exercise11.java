public class Exercise11 {
    // Define a constant for the radius of the circle
    private static final double radius = 7.5;

    public static void main(String[] args) {
        // Calculate the perimeter of the circle using the constant radius
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
