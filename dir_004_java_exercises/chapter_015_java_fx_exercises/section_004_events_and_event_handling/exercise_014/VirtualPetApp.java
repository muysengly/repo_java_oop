//VirtualPetApp.java

// Import required JavaFX classes
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Define the main class for the Virtual Pet application
public class VirtualPetApp extends Application {
    // The entry point for the Java application
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the application window
        primaryStage.setTitle("Virtual Pet App");

        // Create a VirtualPet instance with the name "Buddy"
        VirtualPet virtualPet = new VirtualPet("Buddy");

        // Create buttons for actions (feed, play, pet)
        Button feedButton = new Button("Feed");
        Button playButton = new Button("Play");
        Button petButton = new Button("Pet");

        // Create event handlers for the buttons
        EventHandler<ActionEvent> feedHandler = event -> {
            virtualPet.feed();
            // Print a message indicating that you fed the virtual pet
            System.out.println("You fed " + virtualPet.getName() + ". Hunger: " + virtualPet.getHunger());
        };
        EventHandler<ActionEvent> playHandler = event -> {
            virtualPet.play();
            // Print a message indicating that you played with the virtual pet
            System.out.println("You played with " + virtualPet.getName() + ". Happiness: " + virtualPet.getHappiness());
        };
        EventHandler<ActionEvent> petHandler = event -> {
            virtualPet.pet();
            // Print a message indicating that you petted the virtual pet
            System.out.println("You petted " + virtualPet.getName() + ". Happiness: " + virtualPet.getHappiness());
        };

        // Set event handlers for the buttons
        feedButton.setOnAction(feedHandler);
        playButton.setOnAction(playHandler);
        petButton.setOnAction(petHandler);

        // Create a layout for the buttons using VBox
        VBox vbox = new VBox(feedButton, playButton, petButton);

        // Create a scene for the application
        Scene scene = new Scene(vbox, 300, 200);

        // Set the scene for the primary stage (window) and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// VirtualPet.java

// Define a VirtualPet class to represent the virtual pet and its attributes.
class VirtualPet {
    private String name;
    private int hunger;
    private int happiness;

    // Constructor for initializing the virtual pet
    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 60;
        this.happiness = 60;
    }

    // Getter method for getting the name of the virtual pet
    public String getName() {
        return name;
    }

    // Getter method for getting the hunger level of the virtual pet
    public int getHunger() {
        return hunger;
    }

    // Getter method for getting the happiness level of the virtual pet
    public int getHappiness() {
        return happiness;
    }

    // Method to simulate feeding the virtual pet
    public void feed() {
        hunger -= 10;
    }

    // Method to simulate playing with the virtual pet
    public void play() {
        happiness += 10;
    }

    // Method to simulate petting the virtual pet
    public void pet() {
        happiness += 5;
    }
}
