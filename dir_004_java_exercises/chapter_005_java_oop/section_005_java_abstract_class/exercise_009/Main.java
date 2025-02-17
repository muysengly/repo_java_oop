//Main.java
// Define the Main class
public class Main {
  // The main method, the entry point of the program
  public static void main(String[] args) {
    // Create an instance of Glockenspiel as an Instrument
    Instrument glockenspiel = new Glockenspiel();
    // Create an instance of Violin as an Instrument
    Instrument violin = new Violin();

    // Call the play method on the glockenspiel object
    glockenspiel.play();
    // Call the tune method on the glockenspiel object
    glockenspiel.tune();

    // Call the play method on the violin object
    violin.play();
    // Call the tune method on the violin object
    violin.tune();
  }
}

// Violin.java
// Define a class named Violin that extends the Instrument class
class Violin extends Instrument {
  // Override the play method from the Instrument class
  @Override
  public void play() {
    // Print a message about playing the violin
    System.out.println("Violin: Playing the strings with a bow or fingers.");
  }

  // Override the tune method from the Instrument class
  @Override
  public void tune() {
    // Print a message about tuning the violin
    System.out.println("Violin: Tuning the strings to the correct pitch.");
  }
}

// Glockenspiel.java
// Define a class named Glockenspiel that extends the Instrument class
class Glockenspiel extends Instrument {
  // Override the play method from the Instrument class
  @Override
  public void play() {
    // Print a message about playing the glockenspiel
    System.out.println("Glockenspiel: Playing the notes on the metal bars.");
  }

  // Override the tune method from the Instrument class
  @Override
  public void tune() {
    // Print a message about tuning the glockenspiel
    System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
  }
}

// Instrument.java
// Define an abstract class named Instrument
abstract class Instrument {
  // Declare an abstract method play
  public abstract void play();

  // Declare an abstract method tune
  public abstract void tune();
}
