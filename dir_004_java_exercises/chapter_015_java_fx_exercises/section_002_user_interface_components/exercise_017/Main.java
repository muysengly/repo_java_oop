//Main.java

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Media Player");

        // Create a label to represent playback progress.
        Label progressLabel = new Label("Progress: 0%");

        // Create a slider to control playback progress.
        Slider progressSlider = new Slider(0, 100, 0);
        progressSlider.setShowTickLabels(true);
        progressSlider.setShowTickMarks(true);

        // Bind the label text to the slider value for progress.
        progressSlider.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                double value = progressSlider.getValue();
                progressLabel.setText("Progress: " + String.format("%.1f%%", value));
            }
        });

        // Create a layout (VBox) to arrange the components.
        VBox root = new VBox(10);
        root.getChildren().addAll(progressLabel, progressSlider);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }
}
