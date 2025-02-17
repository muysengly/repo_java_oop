// Vehicle.java
// Define the abstract Vehicle class
abstract class Vehicle {
  // Abstract method to start the engine
  public abstract void startEngine();

  // Abstract method to stop the engine
  public abstract void stopEngine();
}

// Car.java
// Define the Car class that extends Vehicle
class Car extends Vehicle {
  // Override the startEngine method
  @Override
  public void startEngine() {
    // Print that the car engine started with a key
    System.out.println("Car engine started with a key.");
  }

  // Override the stopEngine method
  @Override
  public void stopEngine() {
    // Print that the car engine stopped when the key was turned off
    System.out.println("Car engine stopped when the key was turned off.");
  }
}

// Motorcycle.java
// Define the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {
  // Override the startEngine method
  @Override
  public void startEngine() {
    // Print that the motorcycle engine started with a kick-start
    System.out.println("Motorcycle engine started with a kick-start.");
  }

  // Override the stopEngine method
  @Override
  public void stopEngine() {
    // Print that the motorcycle engine stopped when ignition was turned off
    System.out.println("Motorcycle engine stopped when ignition was turned off.");
  }
}

// Main.java
// Define the Main class
public class Main {
  // Main method, program entry point
  public static void main(String[] args) {
    // Create a Vehicle reference to a Car object
    Vehicle car = new Car();
    // Create a Vehicle reference to a Motorcycle object
    Vehicle motorcycle = new Motorcycle();

    // Start and stop the engine for the car
    startAndStopEngine(car);
    // Start and stop the engine for the motorcycle
    startAndStopEngine(motorcycle);
  }

  // Method to start and stop the engine of a given vehicle
  public static void startAndStopEngine(Vehicle vehicle) {
    // Start the engine of the vehicle
    vehicle.startEngine();
    // Stop the engine of the vehicle
    vehicle.stopEngine();
  }
}
