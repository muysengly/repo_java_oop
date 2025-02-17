//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
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
        primaryStage.setTitle("Preference Form App");

        // Create a label to display the selected Value.
        Label themeLabel = new Label("Selected Value: ");

        // Create a ToggleGroup for the RadioButton options.
        ToggleGroup toggleGroup = new ToggleGroup();

        // Create RadioButton options for "True" and "False."
        RadioButton trueRadioButton = new RadioButton("True");
        trueRadioButton.setToggleGroup(toggleGroup);
        RadioButton falseRadioButton = new RadioButton("False");
        falseRadioButton.setToggleGroup(toggleGroup);

        // Handle the action when a RadioButton is selected.
        trueRadioButton.setOnAction(event -> updateThemeLabel(themeLabel, true));
        falseRadioButton.setOnAction(event -> updateThemeLabel(themeLabel, false));

        // Create a layout (VBox) to arrange the RadioButton options and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(trueRadioButton, falseRadioButton, themeLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Update the label to display the selected Value.
    private void updateThemeLabel(Label label, boolean isTrue) {
        String selectedTheme = isTrue ? "True" : "False";
        label.setText("Selected Value: " + selectedTheme);
    }
}
