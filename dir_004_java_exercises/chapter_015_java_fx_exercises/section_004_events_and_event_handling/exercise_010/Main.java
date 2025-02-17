//Main.java

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title for the main application window
        primaryStage.setTitle("Tree-Like UI Example");

        // Create the root pane
        Pane root = createBranch("Root", 400, 400);

        // Create branches
        Pane branch1 = createBranch("Branch 1", 200, 200);
        Pane branch2 = createBranch("Branch 2", 200, 200);

        // Create leaves
        Label leaf1 = createLeaf("Leaf 1");
        Label leaf2 = createLeaf("Leaf 2");
        Label leaf3 = createLeaf("Leaf 3");
        Label leaf4 = createLeaf("Leaf 4");

        // Add branches and leaves to the root
        root.getChildren().addAll(branch1, branch2, leaf1, leaf2, leaf3, leaf4);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Show the main application window
        primaryStage.show();

        // Add event listeners for branches and leaves
        addEventListeners(branch1, "Branch 1");
        addEventListeners(branch2, "Branch 2");
        addEventListeners(leaf1, "Leaf 1");
        addEventListeners(leaf2, "Leaf 2");
        addEventListeners(leaf3, "Leaf 3");
        addEventListeners(leaf4, "Leaf 4");
    }

    // Helper method to create a branch
    private Pane createBranch(String name, double width, double height) {
        Pane branch = new Pane();
        branch.setPrefSize(width, height);
        branch.setStyle("-fx-border-color: black; -fx-background-color: lightgray;");
        branch.getChildren().add(new Label(name));
        return branch;
    }

    // Helper method to create a leaf
    private Label createLeaf(String name) {
        Label leaf = new Label(name);
        leaf.setStyle("-fx-border-color: black; -fx-background-color: lightgreen;");
        return leaf;
    }

    // Helper method to add event listeners for Pane elements
    private void addEventListeners(Pane pane, String nodeName) {
        // Add a mouse click event handler for Panes
        pane.setOnMouseClicked(event -> {
            logEvent(nodeName, "Mouse Clicked");
        });
    }

    // Helper method to add event listeners for Label elements
    private void addEventListeners(Label label, String nodeName) {
        // Add a mouse click event handler for Labels
        label.setOnMouseClicked(event -> {
            logEvent(nodeName, "Mouse Clicked");
        });
    }

    // Helper method to log events
    private void logEvent(String nodeName, String eventType) {
        System.out.println("Event Captured: " + nodeName + " (" + eventType + ")");
    }
}
