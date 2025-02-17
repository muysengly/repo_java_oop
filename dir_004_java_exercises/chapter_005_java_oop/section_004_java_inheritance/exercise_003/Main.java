// Define the main class
public class Main {
  // Define the main method
  public static void main(String[] args) {
    // Create an instance of Rectangle with length 3.0 and width 10.0
    Rectangle rectangle = new Rectangle(3.0, 10.0);
    // Call the getArea method on the rectangle instance and store the result in the
    // area variable
    double area = rectangle.getArea();
    // Print the area of the rectangle to the console
    System.out.println("The area of the rectangle is: " + area);
  }
}

// Define the parent class Shape
class Shape {
  // Define a public method named getArea that returns a double
  public double getArea() {
    // Return 0.0 as the default area
    return 0.0;
  }
}

// Define the child class Rectangle that extends Shape
class Rectangle extends Shape {
  // Define private instance variables length and width
  private double length;
  private double width;

  // Define the constructor that takes length and width as parameters
  public Rectangle(double length, double width) {
    // Assign the length parameter to the instance variable length
    this.length = length;
    // Assign the width parameter to the instance variable width
    this.width = width;
  }

  // Use the @Override annotation to indicate that this method overrides a method
  // in the superclass
  @Override
  // Define the getArea method that returns a double
  public double getArea() {
    // Return the area of the rectangle (length * width)
    return length * width;
  }
}
