// Define the Rectangle class
public class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        // Initialize length with the provided parameter
        this.length = length;
        // Initialize width with the provided parameter
        this.width = width;
    }

    // Copy constructor
    public Rectangle(Rectangle rectangle) {
        // Initialize length with the length of the provided rectangle object
        this.length = rectangle.length;
        // Initialize width with the width of the provided rectangle object
        this.width = rectangle.width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a new Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);

        // Create a new Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        // Print the values of the instance variables for rect2
        System.out.println("Rectangle 2 Length: " + rect2.length);
        System.out.println("Rectangle 2 Width: " + rect2.width);
    }
}
