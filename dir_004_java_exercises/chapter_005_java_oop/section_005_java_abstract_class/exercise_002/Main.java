// Main.java

// Define the Main class
public class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Declare and initialize the radius for the circle
        double r = 4.0;
        // Create an instance of Circle with the specified radius
        Circle circle = new Circle(r);

        // Declare and initialize the sides for the triangle
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        // Create an instance of Triangle with the specified sides
        Triangle triangle = new Triangle(ts1, ts2, ts3);

        // Print the radius of the circle
        System.out.println("Radius of the Circle: " + r);
        // Print the area of the circle by calling the calculateArea method
        System.out.println("Area of the Circle: " + circle.calculateArea());
        // Print the perimeter of the circle by calling the calculatePerimeter method
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        // Print the sides of the triangle
        System.out.println("\nSides of the Triangle are: " + ts1 + ',' + ts2 + ',' + ts3);
        // Print the area of the triangle by calling the calculateArea method
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        // Print the perimeter of the triangle by calling the calculatePerimeter method
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}
// Triangle.java

// Define a subclass named Triangle that extends Shape
class Triangle extends Shape {
    // Declare private double variables to store the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor that accepts three sides and sets them to the corresponding
    // variables
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the calculateArea method to compute the area of the triangle
    @Override
    double calculateArea() {
        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;
        // Return the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the calculatePerimeter method to compute the perimeter of the
    // triangle
    @Override
    double calculatePerimeter() {
        // Return the perimeter by summing up all the sides
        return side1 + side2 + side3;
    }
}
// Circle.java

// Define a subclass named Circle that extends Shape
class Circle extends Shape {
    // Declare a private double variable to store the radius
    private double radius;

    // Constructor that accepts a radius and sets it to the radius variable
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method to compute the area of the circle
    @Override
    double calculateArea() {
        // Return the area using the formula π * radius^2
        return Math.PI * radius * radius;
    }

    // Override the calculatePerimeter method to compute the perimeter of the circle
    @Override
    double calculatePerimeter() {
        // Return the perimeter using the formula 2 * π * radius
        return 2 * Math.PI * radius;
    }
}
// Shape.java

// Define an abstract class named Shape
abstract class Shape {
    // Declare an abstract method to calculate the area
    abstract double calculateArea();

    // Declare an abstract method to calculate the perimeter
    abstract double calculatePerimeter();
}
