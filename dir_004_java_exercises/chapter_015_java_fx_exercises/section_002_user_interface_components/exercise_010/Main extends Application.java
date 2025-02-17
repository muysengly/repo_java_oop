//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CheckBox Selection App");

        // Create a label to display the selected options.
        Label selectionLabel = new Label("Selected Options: ");

        // Create CheckBox options.
        CheckBox redCheckBox = new CheckBox("Red");
        CheckBox greenCheckBox = new CheckBox("Green");
        CheckBox blueCheckBox = new CheckBox("Blue");
        CheckBox yellowCheckBox = new CheckBox("Yellow");

        // Handle the action when a CheckBox is clicked.
        redCheckBox.setOnAction(event -> updateSelectionLabel(selectionLabel, redCheckBox));
        greenCheckBox.setOnAction(event -> updateSelectionLabel(selectionLabel, greenCheckBox));
        blueCheckBox.setOnAction(event -> updateSelectionLabel(selectionLabel, blueCheckBox));
        yellowCheckBox.setOnAction(event -> updateSelectionLabel(selectionLabel, yellowCheckBox));

        // Create a layout (VBox) to arrange the CheckBox options and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(redCheckBox, greenCheckBox, blueCheckBox, yellowCheckBox, selectionLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Update the label to display the selected options.
    private void updateSelectionLabel(Label label, CheckBox checkBox) {
        StringBuilder selectedOptions = new StringBuilder("Selected Options: ");
        if (checkBox.isSelected()) {
            selectedOptions.append(checkBox.getText()).append(", ");
        }
        label.setText(selectedOptions.toString());
    }
}
