// Define the Main class
public class Main {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a Triangle object with sides 4, 5, and 6
        GeometricShape triangle = new Triangle(4, 5, 6);
        // Create a Square object with side length 6
        GeometricShape square = new Square(6);

        // Print the area of the triangle
        System.out.println("Triangle Area: " + triangle.area());
        // Print the perimeter of the triangle
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        // Print the area of the square
        System.out.println("Square Area: " + square.area());
        // Print the perimeter of the square
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}

// Square.java
// Define a class named Square that extends GeometricShape
class Square extends GeometricShape {
    // Declare a private instance variable for the side of the square
    private double side;

    // Define a constructor that initializes the side of the square
    public Square(double side) {
        // Assign the parameter to the instance variable
        this.side = side;
    }

    // Override the area method from GeometricShape
    @Override
    // Implementation of the area method that calculates and returns the area of the
    // square
    public double area() {
        // Calculate and return the area by squaring the side length
        return side * side;
    }

    // Override the perimeter method from GeometricShape
    @Override
    // Implementation of the perimeter method that returns the perimeter of the
    // square
    public double perimeter() {
        // Calculate and return the perimeter by multiplying the side length by 4
        return 4 * side;
    }
}

// Triangle.java
// Define a class named Triangle that extends GeometricShape
class Triangle extends GeometricShape {
    // Declare private instance variables for the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Define a constructor that initializes the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        // Assign the parameters to the instance variables
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the area method from GeometricShape
    @Override
    // Implementation of the area method that calculates and returns the area of the
    // triangle
    public double area() {
        // Calculate the semi-perimeter of the triangle
        double s = (side1 + side2 + side3) / 2;
        // Calculate and return the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the perimeter method from GeometricShape
    @Override
    // Implementation of the perimeter method that returns the perimeter of the
    // triangle
    public double perimeter() {
        // Return the sum of the sides of the triangle
        return side1 + side2 + side3;
    }
}

// GeometricShape.java
// Define an abstract class named GeometricShape
abstract class GeometricShape {
    // Declare an abstract method named area that returns a double
    public abstract double area();

    // Declare an abstract method named perimeter that returns a double
    public abstract double perimeter();
}
