// Class Car
public class Car {

  // Method startEngine
  public void startEngine() {
    // Local class Engine inside startEngine method
    class Engine {
      // Method run in local class Engine
      public void run() {
        // Print statement indicating the engine is running
        System.out.println("Engine is running");
      }
    }

    // Creating an instance of the local class Engine
    Engine engine = new Engine();
    // Calling the run method of the local class Engine
    engine.run();
  }

  // Main method to demonstrate the local class
  public static void main(String[] args) {
    // Creating an instance of Car
    Car myCar = new Car();
    // Calling the startEngine method
    myCar.startEngine();
  }
}
