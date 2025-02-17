// Animal.java
class Animal { // Declare the Animal class
  public void move() { // Define the move method
    System.out.println("Animal moves"); // Print "Animal moves" to the console
  }

  public void makeSound() { // Define the makeSound method
    System.out.println("Animal makes a sound"); // Print "Animal makes a sound" to the console
  }
}

// Bird.java
class Bird extends Animal { // Declare the Bird class that extends the Animal class
  @Override // Override the move method from the Animal class
  public void move() { // Define the move method
    System.out.println("Bird flies"); // Print "Bird flies" to the console
  }

  @Override // Override the makeSound method from the Animal class
  public void makeSound() { // Define the makeSound method
    System.out.println("Bird chirps"); // Print "Bird chirps" to the console
  }
}

// Panthera.java
// Define a class named Panthera that extends Animal
class Panthera extends Animal {

  // Override the move method from the Animal class
  @Override
  public void move() {
    // Print "Panthera walks" to the console
    System.out.println("Panthera walks");
  }

  // Override the makeSound method from the Animal class
  @Override
  public void makeSound() {
    // Print "Panthera roars" to the console
    System.out.println("Panthera roars");
  }
}

// Main.java
// Define the Main class
public class Main {

  // Define the main method, the entry point of the program
  public static void main(String[] args) {
    // Create an instance of Bird and assign it to the variable bird of type Animal
    Animal bird = new Bird();
    // Create an instance of Panthera and assign it to the variable panthera of type
    // Animal
    Animal panthera = new Panthera();

    // Call the performAction method with bird as the argument
    performAction(bird);
    // Call the performAction method with panthera as the argument
    performAction(panthera);
  }

  // Define the performAction method that takes an Animal object as a parameter
  public static void performAction(Animal animal) {
    // Call the move method on the animal object
    animal.move();
    // Call the makeSound method on the animal object
    animal.makeSound();
  }
}
