// Define the Circle class
class Circle {
    // Declare a private variable to store the radius of the circle
    private double radius;

    // Constructor for the Circle class that initializes the radius variable
    public Circle(double radius) {
        // Set the radius variable to the provided radius parameter
        this.radius = radius;
    }

    // Method to retrieve the radius of the circle
    public double getRadius() {
        // Return the value of the radius variable
        return radius;
    }

    // Method to set the radius of the circle
    public void setRadius(double radius) {
        // Set the radius variable to the provided radius parameter
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        // Calculate the area using the formula π * radius^2 and return the result
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle
    public double getCircumference() {
        // Calculate the circumference using the formula 2 * π * radius and return the
        // result
        return 2 * Math.PI * radius;
    }
}

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Declare an integer variable r and initialize it with the value 5
        int r = 5;
        // Create an instance of the Circle class with the radius r
        Circle circle = new Circle(r);
        // Print the radius of the circle to the console
        System.out.println("Radius of the circle is " + r);
        // Print the area of the circle to the console
        System.out.println("The area of the circle is " + circle.getArea());
        // Print the circumference of the circle to the console
        System.out.println("The circumference of the circle is " + circle.getCircumference());
        // Update the radius variable r to 8
        r = 8;
        // Set the radius of the circle to the new value of r
        circle.setRadius(r);
        // Print the updated radius of the circle to the console
        System.out.println("\nRadius of the circle is " + r);
        // Print the updated area of the circle to the console
        System.out.println("The area of the circle is now " + circle.getArea());
        // Print the updated circumference of the circle to the console
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
    }
}
