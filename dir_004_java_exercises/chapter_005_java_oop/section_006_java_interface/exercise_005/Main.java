// Main.java

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class with an initial size
        Rectangle rectangle = new Rectangle(100, 150);

        // Print the initial size of the rectangle
        rectangle.printSize();

        // Resize the rectangle by changing its width and height
        rectangle.resizeWidth(150);
        rectangle.resizeHeight(200);

        // Print the updated size of the rectangle
        rectangle.printSize();
    }
}

// Rectangle.java

// Declare the Rectangle class, which implements the Resizable interface
class Rectangle implements Resizable {
    // Declare private instance variables to store width and height
    private int width;
    private int height;

    // Constructor for initializing the width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the "resizeWidth" method to resize the width
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement the "resizeHeight" method to resize the height
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to print the current width and height of the rectangle
    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Resizable.java
// Interface Resizable

// Declare the Resizable interface
interface Resizable {
    // Declare the abstract method "resizeWidth" to resize the width
    void resizeWidth(int width);

    // Declare the abstract method "resizeHeight" to resize the height
    void resizeHeight(int height);
}
