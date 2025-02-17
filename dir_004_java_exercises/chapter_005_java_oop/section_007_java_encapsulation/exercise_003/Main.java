// Main.java
// Main Class
public class Main {
  public static void main(String[] args) {
    // Create an instance of Rectangle
    Rectangle rectangle = new Rectangle();

    // Set values using setter methods
    rectangle.setLength(6.7);
    rectangle.setWidth(12.0);

    // Get values using getter methods
    double length = rectangle.getLength();
    double width = rectangle.getWidth();

    // Print the values
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
  }
}

// Rectangle.java

// Rectangle Class
class Rectangle {
  // Declare a private double variable for length
  private double length;
  // Declare a private double variable for width
  private double width;

  // Getter method for length
  public double getLength() {
    return length;
  }

  // Setter method for length
  public void setLength(double length) {
    this.length = length;
  }

  // Getter method for width
  public double getWidth() {
    return width;
  }

  // Setter method for width
  public void setWidth(double width) {
    this.width = width;
  }
}
