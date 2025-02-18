// Main.java
// Main class
public class Main { // Declare the Main class
    public static void main(String[] args) { // Define the main method
        Sports sports = new Sports(); // Create an instance of the Sports class
        Football football = new Football(); // Create an instance of the Football class
        Basketball basketball = new Basketball(); // Create an instance of the Basketball class
        Rugby rugby = new Rugby(); // Create an instance of the Rugby class

        sports.play(); // Call the play method on the Sports instance
        football.play(); // Call the play method on the Football instance
        basketball.play(); // Call the play method on the Basketball instance
        rugby.play(); // Call the play method on the Rugby instance
    }
}
// Rugby.java
// Subclass Rugby

class Rugby extends Sports { // Declare a subclass Rugby that extends the Sports class
    @Override // Override the play method from the Sports class
    public void play() { // Define the play method
        System.out.println("Playing rugby..."); // Print "Playing rugby..." to the console
    }
}

// Basketball.java
// Subclass Basketball
class Basketball extends Sports { // Declare a subclass Basketball that extends the Sports class
    @Override // Override the play method from the Sports class
    public void play() { // Define the play method
        System.out.println("Playing basketball..."); // Print "Playing basketball..." to the console
    }
}
// Football.java
// Subclass Football

// Define the Football class as a subclass of Sports
class Football extends Sports {

    // Override the play method from the Sports class
    @Override
    public void play() {
        // Print "Playing football..." to the console
        System.out.println("Playing football...");
    }
}
// Sports.java
// Base class Sports

// Define the Sports class
class Sports {

    // Public method play that prints a message to the console
    public void play() {
        // Print "Playing a sport..." followed by a new line
        System.out.println("Playing a sport...\n");
    }
}
