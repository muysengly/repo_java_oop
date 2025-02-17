// TrafficLightApp.java

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TrafficLightApp extends Application {
    private enum TrafficLightState {
        RED, YELLOW, GREEN
    }

    private TrafficLightState currentState = TrafficLightState.RED;

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title for the traffic light application
        primaryStage.setTitle("Traffic Light");

        // Create a root node
        StackPane root = new StackPane();

        // Create a button for changing traffic light signals
        Button button = new Button("Change Light");

        // Create an event handler to toggle between traffic light states
        EventHandler<ActionEvent> eventHandler = event -> {
            toggleTrafficLightState();
        };

        // Register the event handler for the button
        button.setOnAction(eventHandler);

        // Add the button to the root node
        root.getChildren().add(button);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 200, 200);
        primaryStage.setScene(scene);

        // Show the traffic light application window
        primaryStage.show();
    }

    // Toggle between traffic light states
    private void toggleTrafficLightState() {
        switch (currentState) {
            case RED:
                System.out.println("Traffic Light: RED");
                currentState = TrafficLightState.YELLOW;
                break;
            case YELLOW:
                System.out.println("Traffic Light: YELLOW");
                currentState = TrafficLightState.GREEN;
                break;
            case GREEN:
                System.out.println("Traffic Light: GREEN");
                currentState = TrafficLightState.RED;
                break;
        }
    }
}