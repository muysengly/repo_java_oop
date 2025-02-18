// Outer class called Computer
public class Computer {

    // Inner class called Processor
    class Processor {
        // Method to display processor details
        void displayDetails() {
            // Print details of the processor
            System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
        }
    }

    // Method to create and display Processor details
    void showProcessorDetails() {
        // Create an instance of the inner class Processor
        Processor processor = new Processor();
        // Call the displayDetails() method
        processor.displayDetails();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of the outer class Computer
        Computer computer = new Computer();
        // Call the method to show processor details
        computer.showProcessorDetails();
    }
}
