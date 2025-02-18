// Main.java
// Main class

// Declare the Main class
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {

        // Declare a double variable r and initialize it to 8.0
        double r = 8.0;

        // Create a Circle object named c1 with radius r
        Circle c1 = new Circle(r);

        // Print the radius of the circle c1
        System.out.println("Radius of the circle=" + r);

        // Print the perimeter of the circle c1
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Print the area of the circle c1
        System.out.println("Area: " + c1.getArea());

        // Update the value of r to 3.2
        r = 3.2;

        // Create a Circle object named c2 with radius r
        Circle c2 = new Circle(r);

        // Print the radius of the circle c2
        System.out.println("\nRadius of the circle=" + r);

        // Print the perimeter of the circle c2
        System.out.println("Perimeter: " + c2.getPerimeter());

        // Print the area of the circle c2
        System.out.println("Area: " + c2.getArea());
    }
}

// Shape.java
// Parent class Shape

// Declare the Shape class
class Shape {

    // Public method to get the perimeter of the shape, returning a default value of
    // 0.0
    public double getPerimeter() {
        return 0.0;
    }

    // Public method to get the area of the shape, returning a default value of 0.0
    public double getArea() {
        return 0.0;
    }
}
// Circle.java
// Child class Circle

// Declare the Circle class which extends the Shape class
class Circle extends Shape {

    // Private instance variable for the radius of the circle
    private double radius;

    // Constructor for the Circle class, taking the radius as a parameter
    public Circle(double radius) {
        // Initialize the radius instance variable
        this.radius = radius;
    }

    // Override the getPerimeter method from the superclass (Shape)
    @Override
    public double getPerimeter() {
        // Return the perimeter of the circle calculated as 2 * π * radius
        return 2 * Math.PI * radius;
    }

    // Override the getArea method from the superclass (Shape)
    @Override
    public double getArea() {
        // Return the area of the circle calculated as π * radius^2
        return Math.PI * radius * radius;
    }
}
