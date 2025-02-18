public class Main {
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and
        // Helicopter
        Flyable[] flyingObjects = { new Spacecraft(), new Airplane(), new Helicopter() };

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}

// Flyable.java
// Interface Flyable

// Declare the Flyable interface
interface Flyable {
    // Declare the abstract method "fly_obj" that classes implementing this
    // interface must provide
    void fly_obj();
}
// Spacecraft.java
// Class Spacecraft

// Declare the Spacecraft class, which implements the Flyable interface
class Spacecraft implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Spacecraft is flying
        System.out.println("Spacecraft is flying");
    }
}
// Airplane.java
// Class Airplane

// Declare the Airplane class, which implements the Flyable interface
class Airplane implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Airplane is flying
        System.out.println("Airplane is flying");
    }
}
// Helicopter.java
// Class Helicopter

// Declare the Helicopter class, which implements the Flyable interface
class Helicopter implements Flyable {
    // Implement the "fly_obj" method required by the Flyable interface
    @Override
    public void fly_obj() {
        // Print a message indicating that the Helicopter is flying
        System.out.println("Helicopter is flying");
    }
}
// Main.java
// Class Main

// Declare the Main class
