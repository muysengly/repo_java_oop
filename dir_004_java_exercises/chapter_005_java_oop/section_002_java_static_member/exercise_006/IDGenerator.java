// Define the IDGenerator class
public class IDGenerator {
    // Declare a static variable nextID
    private static int nextID = 1;

    // Define a static method generateID to return the next ID and increment nextID
    public static int generateID() {
        return nextID++;
    }

    // Main method to demonstrate the usage of generateID
    public static void main(String[] args) {
        // Generate and print IDs
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
    }
}
