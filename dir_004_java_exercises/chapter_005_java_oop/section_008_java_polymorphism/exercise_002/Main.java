// Main.java
// Main class

// Declare the Main class
public class Main {
  // Main method which is the entry point of the program
  public static void main(String[] args) {
      // Create an instance of the Car class
      Car car = new Car();
      // Create an instance of the Motorcycle class
      Motorcycle motorcycle = new Motorcycle();

      // Print the initial speed of the car
      System.out.println("Car initial speed: " + car.getSpeed());
      // Print the initial speed of the motorcycle
      System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());

      // Speed up the car
      car.speedUp();
      // Speed up the motorcycle
      motorcycle.speedUp();

      // Print the speed of the car after speeding up
      System.out.println("\nCar speed after speeding up: " + car.getSpeed());
      // Print the speed of the motorcycle after speeding up
      System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
  }
} 
// Motorcycle.java
// Subclass Motorcycle

// Declare the Motorcycle class that extends the Vehicle class
class Motorcycle extends Vehicle {
  // Override the speedUp method from the Vehicle class
  @Override
  public void speedUp() {
      // Call the speedUp method of the parent class (Vehicle)
      super.speedUp();
      // Print a message indicating that the motorcycle's speed has increased
      System.out.println("Motorcycle speed increased by 12 units");
  }
} 
// Car.java
// Subclass Car

// Declare the Car class that extends the Vehicle class
class Car extends Vehicle {
  // Override the speedUp method from the Vehicle class
  @Override
  public void speedUp() {
      // Call the speedUp method of the parent class (Vehicle)
      super.speedUp();
      // Print a message indicating that the car's speed has increased
      System.out.println("\nCar speed increased by 22 units.");
  }
} 
// Vehicle.java
// Base class Vehicle

// Declare the Vehicle class
class Vehicle {
  // Private field to store the speed of the vehicle
  private int speed;

  // Method to increase the speed of the vehicle by 10
  public void speedUp() {
      speed += 10;
  }

  // Method to get the current speed of the vehicle
  public int getSpeed() {
      return speed;
  }
} 
