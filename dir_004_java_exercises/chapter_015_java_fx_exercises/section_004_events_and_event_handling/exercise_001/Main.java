//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mouse Coordinates Application");

        Label coordinatesLabel = new Label(" Mouse Coordinates: ");
        Label currentCoordinatesLabel = new Label();

        // Create a VBox to arrange the labels
        VBox vbox = new VBox(coordinatesLabel, currentCoordinatesLabel);

        // Create a scene
        Scene scene = new Scene(vbox, 400, 300);

        // Register a mouse moved event handler
        scene.setOnMouseMoved(event -> {
            double x = event.getSceneX();
            double y = event.getSceneY();
            currentCoordinatesLabel.setText(" X: " + x + ",  Y: " + y);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
