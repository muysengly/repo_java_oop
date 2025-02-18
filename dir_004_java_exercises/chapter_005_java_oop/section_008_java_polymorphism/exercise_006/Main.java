// Main.java
// Main class
public class Main { // Declare the Main class
    public static void main(String[] args) { // Define the main method
        double r = 4.0; // Initialize a double variable r with the value 4.0
        Circle circle = new Circle(r); // Create an instance of the Circle class with radius r

        double rs1 = 4.0, rs2 = 6.0; // Initialize double variables rs1 and rs2 with the values 4.0 and 6.0
                                     // respectively
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0; // Initialize double variables ts1, ts2, and ts3 with the values 3.0,
                                                // 4.0,
                                                // and 5.0 respectively

        Rectangle rectangle = new Rectangle(rs1, rs2); // Create an instance of the Rectangle class with sides rs1 and
                                                       // rs2
        Triangle triangle = new Triangle(ts1, ts2, ts3); // Create an instance of the Triangle class with sides ts1,
                                                         // ts2,
                                                         // and ts3

        System.out.println("Radius of the Circle" + r); // Print the radius of the circle
        System.out.println("Area of the Circle: " + circle.getArea()); // Print the area of the circle
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter()); // Print the perimeter of the circle

        System.out.println("\nSides of the rectangle are: " + rs1 + ',' + rs2); // Print the sides of the rectangle
        System.out.println("Area of the Rectangle: " + rectangle.getArea()); // Print the area of the rectangle
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter()); // Print the perimeter of the
                                                                                       // rectangle

        System.out.println("\nSides of the Triangle are: " + ts1 + ',' + ts2 + ',' + ts3); // Print the sides of the
                                                                                           // triangle
        System.out.println("Area of the Triangle: " + triangle.getArea()); // Print the area of the triangle
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter()); // Print the perimeter of the
                                                                                     // triangle
    }
}
// Triangle.java
// Subclass Triangle

class Triangle extends Shape { // Declare a subclass Triangle that extends the Shape class
    private double side1; // Declare a private double variable side1
    private double side2; // Declare a private double variable side2
    private double side3; // Declare a private double variable side3

    public Triangle(double side1, double side2, double side3) { // Define a constructor that takes three double
                                                                // parameters
                                                                // side1, side2, and side3
        this.side1 = side1; // Initialize the side1 variable with the provided parameter
        this.side2 = side2; // Initialize the side2 variable with the provided parameter
        this.side3 = side3; // Initialize the side3 variable with the provided parameter
    }

    @Override // Override the getArea method from the Shape class
    public double getArea() { // Define the getArea method
        double s = (side1 + side2 + side3) / 2; // Calculate the semi-perimeter of the triangle
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculate and return the area of the triangle
                                                                       // using Heron's formula
    }

    @Override // Override the getPerimeter method from the Shape class
    public double getPerimeter() { // Define the getPerimeter method
        return side1 + side2 + side3; // Calculate and return the perimeter of the triangle
    }
}

// Rectangle.java
// Subclass Rectangle
class Rectangle extends Shape { // Declare a subclass Rectangle that extends the Shape class
    private double length; // Declare a private double variable length
    private double width; // Declare a private double variable width

    public Rectangle(double length, double width) { // Define a constructor that takes two double parameters length and
                                                    // width
        this.length = length; // Initialize the length variable with the provided parameter
        this.width = width; // Initialize the width variable with the provided parameter
    }

    @Override // Override the getArea method from the Shape class
    public double getArea() { // Define the getArea method
        return length * width; // Calculate and return the area of the rectangle
    }

    @Override // Override the getPerimeter method from the Shape class
    public double getPerimeter() { // Define the getPerimeter method
        return 2 * (length + width); // Calculate and return the perimeter of the rectangle
    }
}

// Circle.java
// Subclass Circle
class Circle extends Shape { // Declare a subclass Circle that extends the Shape class
    private double radius; // Declare a private double variable radius

    public Circle(double radius) { // Define a constructor that takes a double parameter radius
        this.radius = radius; // Initialize the radius variable with the provided parameter
    }

    @Override // Override the getArea method from the Shape class
    public double getArea() { // Define the getArea method
        return Math.PI * radius * radius; // Calculate and return the area of the circle
    }

    @Override // Override the getPerimeter method from the Shape class
    public double getPerimeter() { // Define the getPerimeter method
        return 2 * Math.PI * radius; // Calculate and return the perimeter of the circle
    }
}

// Shape.java
// Base class Shape
abstract class Shape { // Declare an abstract class Shape
    public abstract double getArea(); // Declare an abstract method getArea that returns a double

    public abstract double getPerimeter(); // Declare an abstract method getPerimeter that returns a double
}
