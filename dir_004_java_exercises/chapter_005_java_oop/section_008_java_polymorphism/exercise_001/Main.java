// Main.java
// Main class

// Declare the Main class
public class Main {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        // Create an instance of Bird
        Bird bird = new Bird();
        // Create an instance of Cat
        Cat cat = new Cat();

        // Call the makeSound method on the Animal instance
        animal.makeSound(); // Output: The animal makes a sound
        // Call the makeSound method on the Bird instance
        bird.makeSound(); // Output: The bird chirps
        // Call the makeSound method on the Cat instance
        cat.makeSound(); // Output: The cat meows
    }
}
// Cat.java
// Subclass Cat

// Declare the Cat class that extends the Animal class
class Cat extends Animal {
    // Override the makeSound method to provide a specific implementation for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
// Bird.java
// Subclass Bird

// Declare the Bird class that extends the Animal class
class Bird extends Animal {
    // Override the makeSound method to provide a specific implementation for Bird
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}
// Animal.java
// Base class Animal

// Declare the Animal class
class Animal {
    // Method to print the sound the animal makes
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
