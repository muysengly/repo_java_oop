// Main.java
// Main class

// Define the Main class
public class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        // Call the move method on the Animal instance
        animal.move();

        // Create an instance of Cheetah
        Cheetah cheetah = new Cheetah();
        // Call the move method on the Cheetah instance
        cheetah.move();
    }
}

// Animal.java
// Parent class Animal

// Define the Animal class
class Animal {
    // Method to print a message indicating the animal moves
    public void move() {
        System.out.println("Animal moves");
    }
}
// Cheetah.java
// Child class Cheetah

// Define the Cheetah class, inheriting from Animal
class Cheetah extends Animal {
    // Override the move method to print a cheetah-specific message
    @Override
    public void move() {
        System.out.println("This cheetah is running!");
    }
}
