//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Circle Radius Control");

        // Create a slider to control the radius.
        Slider radiusSlider = new Slider(10, 100, 50); // Min: 10, Max: 100, Initial: 50
        radiusSlider.setShowTickMarks(true);
        radiusSlider.setShowTickLabels(true);

        // Create a label to display the current radius value.
        Label radiusLabel = new Label("Radius: " + radiusSlider.getValue());

        // Create a circle with an initial radius.
        Circle circle = new Circle(150, 150, radiusSlider.getValue());
        circle.setFill(Color.LIGHTBLUE);

        // Bind the circle's radius to the slider value.
        circle.radiusProperty().bind(radiusSlider.valueProperty());

        // Update the label text when the slider value changes.
        radiusSlider.valueProperty()
                .addListener((observable, oldValue, newValue) -> radiusLabel.setText("Radius: " + newValue.intValue()));

        // Create a layout (VBox) to arrange the components.
        VBox root = new VBox(10);
        root.getChildren().addAll(radiusSlider, radiusLabel, circle);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }
}
