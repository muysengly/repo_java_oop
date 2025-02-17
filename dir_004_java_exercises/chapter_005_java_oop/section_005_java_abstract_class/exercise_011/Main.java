// Main.java
// Define a public class named Main
public class Main {
  // Define the main method, which is the entry point of the program
  public static void main(String[] args) {
    // Create an instance of Eagle and assign it to a Bird reference
    Bird eagle = new Eagle();
    // Create an instance of Hawk and assign it to a Bird reference
    Bird hawk = new Hawk();

    // Call the fly method on the eagle object
    eagle.fly();
    // Call the makeSound method on the eagle object
    eagle.makeSound();

    // Call the fly method on the hawk object
    hawk.fly();
    // Call the makeSound method on the hawk object
    hawk.makeSound();
  }
}

// Hawk.java
// Define a class named Hawk that extends Bird
class Hawk extends Bird {

  // Override the fly method from Bird
  @Override
  // Implementation of the fly method that prints a message
  public void fly() {
    System.out.println("Hawk: Soaring through the air.");
  }

  // Override the makeSound method from Bird
  @Override
  // Implementation of the makeSound method that prints a message
  public void makeSound() {
    System.out.println("Hawk: Caw! Caw!");
  }
}

// Eagle.java
// Define a class named Eagle that extends Bird
class Eagle extends Bird {

  // Override the fly method from Bird
  @Override
  // Implementation of the fly method that prints a message
  public void fly() {
    System.out.println("Eagle: Flying high in the sky.");
  }

  // Override the makeSound method from Bird
  @Override
  // Implementation of the makeSound method that prints a message
  public void makeSound() {
    System.out.println("Eagle: Screech! Screech!");
  }
}

// Bird.java
// Define an abstract class named Bird
abstract class Bird {
  // Declare an abstract method named fly
  public abstract void fly();

  // Declare an abstract method named makeSound
  public abstract void makeSound();
}
