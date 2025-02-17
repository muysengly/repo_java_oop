// Main.java
// Public class Main
public class Main {
  // Main method
  public static void main(String[] args) {
    // Creating an instance of Sphere with radius 7.0
    Shape3D sphere = new Sphere(7.0);
    // Creating an instance of Cube with side length 6.0
    Shape3D cube = new Cube(6.0);

    // Printing the volume of the sphere
    System.out.println("Sphere Volume: " + sphere.calculateVolume());
    // Printing the surface area of the sphere
    System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

    // Printing the volume of the cube
    System.out.println("Cube Volume: " + cube.calculateVolume());
    // Printing the surface area of the cube
    System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
  }
}

// Cube.java
// Class Cube extending Shape3D
class Cube extends Shape3D {
  // Private variable to store side length
  private double sideLength;

  // Constructor to initialize side length
  public Cube(double sideLength) {
    // Setting the side length value
    this.sideLength = sideLength;
  }

  // Overriding the calculateVolume method
  @Override
  public double calculateVolume() {
    // Calculating the volume of the cube using the formula sideLength^3
    return Math.pow(sideLength, 3);
  }

  // Overriding the calculateSurfaceArea method
  @Override
  public double calculateSurfaceArea() {
    // Calculating the surface area of the cube using the formula 6 * sideLength^2
    return 6 * Math.pow(sideLength, 2);
  }
}

// Sphere.java
// Class Sphere extending Shape3D
class Sphere extends Shape3D {
  // Private variable to store radius
  private double radius;

  // Constructor to initialize radius
  public Sphere(double radius) {
    // Setting the radius value
    this.radius = radius;
  }

  // Overriding the calculateVolume method
  @Override
  public double calculateVolume() {
    // Calculating the volume of the sphere using the formula (4/3) * π * radius^3
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }

  // Overriding the calculateSurfaceArea method
  @Override
  public double calculateSurfaceArea() {
    // Calculating the surface area of the sphere using the formula 4 * π * radius^2
    return 4 * Math.PI * Math.pow(radius, 2);
  }
}

// Shape3D.java
// Abstract class Shape3D
abstract class Shape3D {
  // Abstract method to calculate volume
  public abstract double calculateVolume();

  // Abstract method to calculate surface area
  public abstract double calculateSurfaceArea();
}
