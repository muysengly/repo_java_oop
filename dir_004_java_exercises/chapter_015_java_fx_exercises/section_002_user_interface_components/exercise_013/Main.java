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
        primaryStage.setTitle("ToggleButton Radio App");

        // Create a label to indicate the selected button.
        Label selectionLabel = new Label("Selected Button: None");

        // Create a ToggleGroup for the ToggleButtons to make them act like radio
        // buttons.
        ToggleGroup toggleGroup = new ToggleGroup();

        // Create two ToggleButtons.
        ToggleButton button1 = new ToggleButton("Button 1");
        button1.setToggleGroup(toggleGroup);
        ToggleButton button2 = new ToggleButton("Button 2");
        button2.setToggleGroup(toggleGroup);

        // Handle the action when a ToggleButton is selected.
        button1.setOnAction(event -> updateSelectionLabel(selectionLabel, button1, button2));
        button2.setOnAction(event -> updateSelectionLabel(selectionLabel, button2, button1));

        // Create a layout (VBox) to arrange the ToggleButtons and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(button1, button2, selectionLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Update the label to indicate the selected button.
    private void updateSelectionLabel(Label label, ToggleButton selectedButton, ToggleButton deselectedButton) {
        label.setText("Selected Button: " + selectedButton.getText());
        // Deselect the other button.
        deselectedButton.setSelected(false);
    }
}
