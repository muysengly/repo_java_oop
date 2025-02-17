//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Preference Form");

        // Create a label to display the chosen color.
        Label colorLabel = new Label("Chosen Color: None");

        // Create a ToggleGroup for the ToggleButtons to allow only one selection.
        ToggleGroup toggleGroup = new ToggleGroup();

        // Create ToggleButtons for color options.
        ToggleButton redButton = new ToggleButton("Red");
        redButton.setToggleGroup(toggleGroup);
        ToggleButton greenButton = new ToggleButton("Green");
        greenButton.setToggleGroup(toggleGroup);

        // Handle the action when a ToggleButton is selected.
        redButton.setOnAction(event -> updateColorLabel(colorLabel, "Red"));
        greenButton.setOnAction(event -> updateColorLabel(colorLabel, "Green"));

        // Create a layout (VBox) to arrange the ToggleButtons and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(redButton, greenButton, colorLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Update the label to display the chosen color.
    private void updateColorLabel(Label label, String chosenColor) {
        label.setText("Chosen Color: " + chosenColor);
    }
}
