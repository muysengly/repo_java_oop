// Main class to demonstrate anonymous class
public class Main {
  // Main method
  public static void main(String[] args) {
    // Creating an anonymous class that extends Animal and overrides makeSound
    // method
    Animal cat = new Animal() {
      // Overriding the makeSound method
      @Override
      void makeSound() {
        System.out.println("Meow");
      }
    };

    // Calling the makeSound method
    cat.makeSound();
  }
}

// Abstract class Animal with an abstract method makeSound
abstract class Animal {
  // Abstract method makeSound
  abstract void makeSound();
}
