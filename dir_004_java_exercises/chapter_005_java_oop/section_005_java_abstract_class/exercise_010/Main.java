// Main.java
// Define a public class named Main
public class Main {
  // Define the main method, which is the entry point of the program
  public static void main(String[] args) {
    // Create an instance of Rectangle and assign it to a Shape2D reference
    Shape2D rectangle = new Rectangle();
    // Create an instance of Circle and assign it to a Shape2D reference
    Shape2D circle = new Circle();

    // Call the draw method on the rectangle object
    rectangle.draw();
    // Call the resize method on the rectangle object
    rectangle.resize();

    // Call the draw method on the circle object
    circle.draw();
    // Call the resize method on the circle object
    circle.resize();
  }
}

// Circle.java
// Define a class named Circle that extends Shape2D
class Circle extends Shape2D {

  // Override the draw method from Shape2D
  @Override
  // Implementation of the draw method that prints a message
  public void draw() {
    System.out.println("Circle: Drawing a circle.");
  }

  // Override the resize method from Shape2D
  @Override
  // Implementation of the resize method that prints a message
  public void resize() {
    System.out.println("Circle: Resizing the circle.");
  }
}

// Rectangle.java
// Define a class named Rectangle that extends Shape2D
class Rectangle extends Shape2D {

  // Override the draw method from Shape2D
  @Override
  // Implementation of the draw method that prints a message
  public void draw() {
    System.out.println("Rectangle: Drawing a rectangle.");
  }

  // Override the resize method from Shape2D
  @Override
  // Implementation of the resize method that prints a message
  public void resize() {
    System.out.println("Rectangle: Resizing the rectangle.");
  }
}

// Shape2D.java
// Define an abstract class named Shape2D
abstract class Shape2D {
  // Declare an abstract method draw
  public abstract void draw();

  // Declare an abstract method resize
  public abstract void resize();
}
