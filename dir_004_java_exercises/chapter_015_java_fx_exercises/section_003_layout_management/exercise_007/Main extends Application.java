//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane with Different Alignments");

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Create labels for top, center, and bottom regions
        Label topLabel = new Label("Top");
        Label centerLabel = new Label("Center");
        Label bottomLabel = new Label("Bottom");

        // Set different alignments for the regions
        BorderPane.setAlignment(topLabel, javafx.geometry.Pos.CENTER);
        BorderPane.setAlignment(centerLabel, javafx.geometry.Pos.CENTER_LEFT);
        BorderPane.setAlignment(bottomLabel, javafx.geometry.Pos.CENTER_RIGHT);

        // Add labels to the BorderPane
        borderPane.setTop(topLabel);
        borderPane.setCenter(centerLabel);
        borderPane.setBottom(bottomLabel);

        // Create the scene and set it in the stage
        Scene scene = new Scene(borderPane, 300, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
