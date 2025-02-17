// Define a public class named Main
public class Main {
  // Define the main method
  public static void main(String[] args) {
    // Create an instance of Animal
    Animal animal = new Animal();
    // Create an instance of Cat
    Cat cat = new Cat();
    // Call the makeSound method on the animal instance
    animal.makeSound();
    // Call the makeSound method on the cat instance
    cat.makeSound();
  }
}

// Define a public class named Animal
class Animal {
  // Define a public method named makeSound
  public void makeSound() {
    // Print "The animal makes a sound." to the console
    System.out.println("The animal makes a sound.");
  }
}

// Define a public class named Cat that extends Animal
class Cat extends Animal {
  // Use the @Override annotation to indicate that this method overrides a method
  // in the superclass
  @Override
  // Define the makeSound method
  public void makeSound() {
    // Print "The cat quarrels." to the console
    System.out.println("The cat quarrels.");
  }
}