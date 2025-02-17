// Define the Rectangle class
class Rectangle {
    // Declare a private variable to store the width of the rectangle
    private double width;
    // Declare a private variable to store the height of the rectangle
    private double height;

    // Constructor for the Rectangle class that initializes the width and height
    // variables
    public Rectangle(double width, double height) {
        // Set the width variable to the provided width parameter
        this.width = width;
        // Set the height variable to the provided height parameter
        this.height = height;
    }

    // Method to retrieve the width of the rectangle
    public double getWidth() {
        // Return the value of the width variable
        return width;
    }

    // Method to set the width of the rectangle
    public void setWidth(double width) {
        // Set the width variable to the provided width parameter
        this.width = width;
    }

    // Method to retrieve the height of the rectangle
    public double getHeight() {
        // Return the value of the height variable
        return height;
    }

    // Method to set the height of the rectangle
    public void setHeight(double height) {
        // Set the height variable to the provided height parameter
        this.height = height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        // Calculate the area by multiplying width and height, and return the result
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        // Calculate the perimeter by adding width and height, multiplying by 2, and
        // return the result
        return 2 * (width + height);
    }
}

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Rectangle class with the width 7 and height 12
        Rectangle rectangle = new Rectangle(7, 12);

        // Print the area of the rectangle to the console
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        // Print the perimeter of the rectangle to the console
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        // Set a new width for the rectangle
        rectangle.setWidth(6);
        // Set a new height for the rectangle
        rectangle.setHeight(12);

        // Print the updated area of the rectangle to the console
        System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
        // Print the updated perimeter of the rectangle to the console
        System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());
    }
}
