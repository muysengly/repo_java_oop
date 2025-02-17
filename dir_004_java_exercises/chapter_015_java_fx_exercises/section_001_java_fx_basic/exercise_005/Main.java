import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a label to display the selected color.
        Label colorLabel = new Label("Selected Color: ");

        // Create a ChoiceBox with a list of colors.
        ChoiceBox<String> colorChoiceBox = new ChoiceBox<>(
                FXCollections.observableArrayList(
                        "Red", "Green", "Blue", "Yellow", "Orange", "Purple"));

        // Set an action for the ChoiceBox.
        colorChoiceBox.setOnAction(event -> {
            String selectedColor = colorChoiceBox.getValue();
            colorLabel.setText("Selected Color: " + selectedColor);
        });

        // Create a layout for the ChoiceBox and label.
        VBox root = new VBox(10); // 10 is the spacing between elements.
        root.getChildren().addAll(colorChoiceBox, colorLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200); // Width and height of the window.
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Color Choice App");

        // Show the window.
        primaryStage.show();
    }
}
