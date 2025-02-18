// Animal.java
// Define the Animal class
class Animal {
    // Method for animal to eat
    public void eat() {
        // Print that the animal eats
        System.out.println("Animal eats.");
    }

    // Method for animal to make a sound
    public void sound() {
        // Print that the animal makes a sound
        System.out.println("Animal makes a sound.");
    }
}

// Lion.java
// Define the Lion class that extends Animal
class Lion extends Animal {
    // Override the eat method
    @Override
    public void eat() {
        // Print that the lion eats meat
        System.out.println("Lion eats meat.");
    }

    // Override the sound method
    @Override
    public void sound() {
        // Print that the lion roars
        System.out.println("Lion roars.");
    }
}

// Tiger.java
// Define the Tiger class that extends Animal
class Tiger extends Animal {
    // Override the eat method
    @Override
    public void eat() {
        // Print that the tiger eats meat and sometimes fish
        System.out.println("Tiger eats meat and sometimes fish.");
    }

    // Override the sound method
    @Override
    public void sound() {
        // Print that the tiger growls
        System.out.println("Tiger growls.");
    }
}

// Panther.java
// Define the Panther class that extends Animal
class Panther extends Animal {
    // Override the eat method
    @Override
    public void eat() {
        // Print that the panther eats meat and small mammals
        System.out.println("Panther eats meat and small mammals.");
    }

    // Override the sound method
    @Override
    public void sound() {
        // Print that the panther purrs and sometimes hisses
        System.out.println("Panther purrs and sometimes hisses.");
    }
}

// Main.java
// Define the Main class
public class Main {
    // Main method, program entry point
    public static void main(String[] args) {
        // Create an Animal reference to a Lion object
        Animal lion = new Lion();
        // Create an Animal reference to a Tiger object
        Animal tiger = new Tiger();
        // Create an Animal reference to a Panther object
        Animal panther = new Panther();

        // Call the eat method on the lion object
        lion.eat();
        // Call the sound method on the lion object
        lion.sound();

        // Call the eat method on the tiger object
        tiger.eat();
        // Call the sound method on the tiger object
        tiger.sound();

        // Call the eat method on the panther object
        panther.eat();
        // Call the sound method on the panther object
        panther.sound();
    }
}
