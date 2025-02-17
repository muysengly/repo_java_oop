
//Main.java
import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title for the main application window
        primaryStage.setTitle("Event Flow Capture App");

        // Create the root pane
        Pane root = new Pane();
        root.setPrefSize(400, 400);

        // Create child panes
        Pane pane1 = createPane("Pane 1", 0, 0, 200, 200);
        Pane pane2 = createPane("Pane 2", 200, 0, 200, 200);
        Pane pane3 = createPane("Pane 3", 0, 200, 200, 200);
        Pane pane4 = createPane("Pane 4", 200, 200, 200, 200);

        // Add event filters to the panes
        addEventFilter(pane1, "Pane 1");
        addEventFilter(pane2, "Pane 2");
        addEventFilter(pane3, "Pane 3");
        addEventFilter(pane4, "Pane 4");

        // Create a button
        Button button = new Button("Click Me");
        button.setLayoutX(150);
        button.setLayoutY(350);

        // Add an event listener to the button
        button.setOnAction(event -> {
            logEvent("Button", "Button Clicked");
        });

        // Add nodes to the root pane
        root.getChildren().addAll(pane1, pane2, pane3, pane4, button);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Show the main application window
        primaryStage.show();
    }

    // Helper method to create a sub-pane
    private Pane createPane(String title, double x, double y, double width, double height) {
        Pane pane = new Pane();
        pane.setLayoutX(x);
        pane.setLayoutY(y);
        pane.setPrefSize(width, height);
        pane.setStyle("-fx-border-color: black; -fx-background-color: lightgray;");
        return pane;
    }

    // Helper method to add event filters
    private void addEventFilter(Pane node, String nodeName) {
        // Add an event filter for all types of events on the given node
        node.addEventFilter(Event.ANY, event -> {
            // Log the captured event
            logEvent(nodeName, event.getEventType().getName());
        });
    }

    // Helper method to log events
    private void logEvent(String nodeName, String eventType) {
        // Print a message indicating the captured event
        System.out.println("Event Captured: " + nodeName + " (" + eventType + ")");
    }
}
