// Main.java
// Main class

// Define the Main class
public class Main {

    // Main method that serves as the entry point for the application
    public static void main(String[] args) {

        // Create a Circle object with radius 4
        Circle circle = new Circle(4);
        // Print the area of the Circle object
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object with width 12 and height 34
        Rectangle rectangle = new Rectangle(12, 34);
        // Print the area of the Rectangle object
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        // Create a Triangle object with base 5 and height 9
        Triangle triangle = new Triangle(5, 9);
        // Print the area of the Triangle object
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}
// Triangle.java
// Subclass Triangle

// Define the Triangle class as a subclass of Shape
class Triangle extends Shape {

    // Declare private double variables base and height
    private double base;
    private double height;

    // Constructor for Triangle class that takes base and height as parameters
    public Triangle(double base, double height) {
        // Assign the parameter base to the instance variable base
        this.base = base;
        // Assign the parameter height to the instance variable height
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the triangle using the formula 0.5 * base *
        // height
        return 0.5 * base * height;
    }
}
// Rectangle.java
// Subclass Rectangle

// Define the Rectangle class as a subclass of Shape
class Rectangle extends Shape {

    // Declare private double variables width and height
    private double width;
    private double height;

    // Constructor for Rectangle class that takes width and height as parameters
    public Rectangle(double width, double height) {
        // Assign the parameter width to the instance variable width
        this.width = width;
        // Assign the parameter height to the instance variable height
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle using the formula width *
        // height
        return width * height;
    }
}
// Circle.java
// Subclass Circle

// Define the Circle class as a subclass of Shape
class Circle extends Shape {

    // Declare a private double variable radius
    private double radius;

    // Constructor for Circle class that takes radius as a parameter
    public Circle(double radius) {
        // Assign the parameter radius to the instance variable radius
        this.radius = radius;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the circle using the formula πr²
        return Math.PI * radius * radius;
    }
}
// Shape.java
// Base class Shape

// Declare the Shape class
class Shape {
    // Method to calculate the area of the shape
    // Default implementation returns 0
    public double calculateArea() {
        return 0;
    }
}
