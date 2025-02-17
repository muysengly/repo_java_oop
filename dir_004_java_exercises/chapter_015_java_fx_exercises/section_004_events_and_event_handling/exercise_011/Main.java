//Main.java

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title for the game window
        primaryStage.setTitle("Event Propagation Game");

        // Create a root node
        StackPane root = new StackPane();

        // Create a button for the game
        Button button = new Button("Click Me!");

        // Add an event filter to the button to handle action events (button clicks)
        button.addEventFilter(ActionEvent.ACTION, event -> {
            System.out.println("Game Over: You clicked the button!");
            event.consume(); // Prevent further event propagation
        });

        // Add the button to the root node
        root.getChildren().add(button);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Show the game window
        primaryStage.show();
    }
}
