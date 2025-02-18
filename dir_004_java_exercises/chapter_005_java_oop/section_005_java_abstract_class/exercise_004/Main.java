// Main.java
// Subclass Main

// Define public class Main
public class Main {
    // Define the main method
    public static void main(String[] args) {
        // Create a new Lion object
        Lion lion = new Lion();
        // Call the eat method on the Lion object
        lion.eat();
        // Call the sleep method on the Lion object
        lion.sleep();

        // Print an empty line for separation
        System.out.println();

        // Create a new Tiger object
        Tiger tiger = new Tiger();
        // Call the eat method on the Tiger object
        tiger.eat();
        // Call the sleep method on the Tiger object
        tiger.sleep();

        // Print an empty line for separation
        System.out.println();

        // Create a new Deer object
        Deer deer = new Deer();
        // Call the eat method on the Deer object
        deer.eat();
        // Call the sleep method on the Deer object
        deer.sleep();
    }
}
// Deer.java
// Subclass Deer

// Define class Deer that extends Animal
class Deer extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the deer eats
        System.out.println("Deer grazes on grass and leaves.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the deer sleeps
        System.out.println("Deer sleeps in open fields.");
    }
}
// Tiger.java
// Subclass Tiger

// Define class Tiger that extends Animal
class Tiger extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the tiger eats
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the tiger sleeps
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
// Lion.java
// Subclass Lion

// Define class Lion that extends Animal
class Lion extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the lion eats
        System.out.println("Lion eats meat.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the lion sleeps
        System.out.println("Lion sleeps on grassland.");
    }
}
// Animal.java
// Abstract class Animal

// Define abstract class Animal
abstract class Animal {
    // Declare abstract method eat
    public abstract void eat();

    // Declare abstract method sleep
    public abstract void sleep();
}
