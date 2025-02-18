// Main.java

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}
// Basketball.java

// Declare the Basketball class, which implements the Playable interface
class Basketball implements Playable {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that basketball is being played
        System.out.println("Playing basketball");
        // Additional code to play basketball can be added here
    }
}
// Volleyball.java

// Declare the Volleyball class, which implements the Playable interface
class Volleyball implements Playable {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that volleyball is being played
        System.out.println("Playing volleyball");
        // Additional code to play volleyball can be added here
    }
}

// Football.java
class Football implements Playable {
    public void play() {
        System.out.println("Playing football");
        // Add code to play football
    }
}

// Playable.java
// Declare the Playable interface
interface Playable {
    // Declare the abstract method "play" that classes implementing this interface
    // must provide
    void play();
}
