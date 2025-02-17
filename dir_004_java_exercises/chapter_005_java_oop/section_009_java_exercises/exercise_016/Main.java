//Shape.java
// Define the Shape class as an abstract class
abstract class Shape {

  // Abstract method to get the area of the shape
  // This method must be implemented by any subclass of Shape
  public abstract double getArea();

  // Abstract method to get the perimeter of the shape
  // This method must be implemented by any subclass of Shape
  public abstract double getPerimeter();
}

// Rectangle.java
// Define the Rectangle class, which extends the Shape class
class Rectangle extends Shape {

  // Private fields to store the length and width of the rectangle
  private double length;
  private double width;

  // Constructor to initialize the length and width of the rectangle
  public Rectangle(double length, double width) {
    this.length = length; // Set the length field to the provided length
    this.width = width; // Set the width field to the provided width
  }

  // Method to calculate and return the area of the rectangle
  public double getArea() {
    return length * width; // Calculate the area by multiplying length and width
  }

  // Method to calculate and return the perimeter of the rectangle
  public double getPerimeter() {
    return 2 * (length + width); // Calculate the perimeter using the formula 2 * (length + width)
  }
}
// Circle.java

// Define the Circle class, which extends the Shape class
class Circle extends Shape {

  // Private field to store the radius of the circle
  private double radius;

  // Constructor to initialize the radius of the circle
  public Circle(double radius) {
    this.radius = radius; // Set the radius field to the provided radius
  }

  // Method to calculate and return the area of the circle
  public double getArea() {
    return Math.PI * radius * radius; // Calculate the area using the formula π * radius^2
  }

  // Method to calculate and return the perimeter (circumference) of the circle
  public double getPerimeter() {
    return 2 * Math.PI * radius; // Calculate the perimeter using the formula 2 * π * radius
  }
}
// Triangle.java

// Define the Triangle class, which extends the Shape class
class Triangle extends Shape {

  // Private fields to store the sides of the triangle
  private double side1;
  private double side2;
  private double side3;

  // Constructor to initialize the sides of the triangle
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1; // Set the side1 field to the provided side1
    this.side2 = side2; // Set the side2 field to the provided side2
    this.side3 = side3; // Set the side3 field to the provided side3
  }

  // Method to calculate and return the area of the triangle
  public double getArea() {
    double s = (side1 + side2 + side3) / 2; // Calculate the semi-perimeter
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculate the area using Heron's formula
  }

  // Method to calculate and return the perimeter of the triangle
  public double getPerimeter() {
    return side1 + side2 + side3; // Calculate the perimeter by summing the sides
  }
}

// Define the Main class
public class Main {

  // The main method - the entry point of the Java application
  public static void main(String[] args) {

    // Create a rectangle shape with length 10 and width 12
    Shape rectangle = new Rectangle(10, 12);

    // Create a circle shape with radius 5
    Shape circle = new Circle(5);

    // Create a triangle shape with sides 7, 8, and 6
    Shape triangle = new Triangle(7, 8, 6);

    // Print the header for the area and perimeter calculations
    System.out.println("\nArea and perimeter of various shapes:");

    // Print the details and calculations for the rectangle
    System.out.println("\nRectangle: Length-10, Width-12");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());

    // Print the details and calculations for the circle
    System.out.println("\nCircle: Radius-5");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());

    // Print the details and calculations for the triangle
    System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
    System.out.println("Area: " + triangle.getArea());
    System.out.println("Perimeter: " + triangle.getPerimeter());
  }
}
