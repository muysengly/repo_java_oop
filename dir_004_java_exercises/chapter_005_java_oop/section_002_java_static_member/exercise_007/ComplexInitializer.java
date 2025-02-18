// Define the ComplexInitializer class
public class ComplexInitializer {
    // Declare static variables x, y, z
    private static int x;
    private static int y;
    private static int z;

    // Static block to initialize the static variables using complex logic
    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    // Static method to calculate the value of z
    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }

    // Main method to print the values of the static variables
    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
