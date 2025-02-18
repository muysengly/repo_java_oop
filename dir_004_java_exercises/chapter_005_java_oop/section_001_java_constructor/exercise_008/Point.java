// Define the Point class
public class Point {
    // Private instance variables
    private int x;
    private int y;

    // Constructor that takes int parameters
    public Point(int x, int y) {
        // Initialize instance variables
        this.x = x;
        this.y = y;
    }

    // Constructor that takes double parameters
    public Point(double x, double y) {
        // Initialize instance variables by casting double to int
        this.x = (int) x;
        this.y = (int) y;
    }

    // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        // Create a Point object using the int constructor
        Point point1 = new Point(4, 5);
        // Print the values of point1
        point1.printPoint();

        // Create a Point object using the double constructor
        Point point2 = new Point(4.5, 5.5);
        // Print the values of point2
        point2.printPoint();
    }
}
