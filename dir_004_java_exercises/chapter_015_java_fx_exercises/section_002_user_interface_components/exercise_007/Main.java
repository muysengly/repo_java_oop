//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Choice App");

        // Create a label to display the selected color.
        Label colorLabel = new Label("Selected Color: ");

        // Create a ChoiceBox with a list of colors.
        ChoiceBox<String> colorChoiceBox = new ChoiceBox<>();
        colorChoiceBox.getItems().addAll("Red", "Green", "Blue", "Yellow", "Orange", "Purple");

        // Create a rectangle with an initial color.
        Rectangle colorRectangle = new Rectangle(100, 100, Color.WHITE);

        // Handle the action when a color is selected from the ChoiceBox.
        colorChoiceBox.setOnAction(event -> {
            String selectedColor = colorChoiceBox.getValue();
            Color selectedFillColor = Color.BLACK; // Default color if not found
            switch (selectedColor) {
                case "Red":
                    selectedFillColor = Color.RED;
                    break;
                case "Green":
                    selectedFillColor = Color.GREEN;
                    break;
                case "Blue":
                    selectedFillColor = Color.BLUE;
                    break;
                case "Yellow":
                    selectedFillColor = Color.YELLOW;
                    break;
                case "Orange":
                    selectedFillColor = Color.ORANGE;
                    break;
                case "Purple":
                    selectedFillColor = Color.PURPLE;
                    break;
            }
            colorLabel.setText("Selected Color: " + selectedColor);
            colorRectangle.setFill(selectedFillColor);
        });

        // Create a layout (HBox) to arrange the ChoiceBox, label, and rectangle.
        HBox root = new HBox(10);
        root.getChildren().addAll(colorChoiceBox, colorLabel);

        // Create a StackPane to contain the rectangle.
        StackPane rectangleContainer = new StackPane();
        rectangleContainer.getChildren().add(colorRectangle);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(new HBox(root, rectangleContainer), 400, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }
}
