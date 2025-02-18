// Define the Car class
public class Car {
    // Private instance variables
    private String make;
    private String model;
    private int year;

    // Parameterized constructor with default values
    public Car(String make, String model, int year) {
        // Initialize make with the provided parameter or a default value
        this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;
        // Initialize model with the provided parameter or a default value
        this.model = (model == null || model.isEmpty()) ? "Unknown Model" : model;
        // Initialize year with the provided parameter or a default value
        this.year = (year <= 0) ? 2000 : year;
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create a new Car object with valid data
        Car car1 = new Car("Toyota", "Corolla", 2021);
        // Print the values of the instance variables for car1
        System.out.println("Car 1 Make: " + car1.make);
        System.out.println("Car 1 Model: " + car1.model);
        System.out.println("Car 1 Year: " + car1.year);

        // Create a new Car object with some invalid data
        Car car2 = new Car("", "", -1);
        // Print the values of the instance variables for car2
        System.out.println("Car 2 Make: " + car2.make);
        System.out.println("Car 2 Model: " + car2.model);
        System.out.println("Car 2 Year: " + car2.year);
    }
}
