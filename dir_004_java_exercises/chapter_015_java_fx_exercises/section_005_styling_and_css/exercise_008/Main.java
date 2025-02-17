// Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSS Animation Example");

        // Create a button
        Button button = new Button("Hover over me!");

        // Set ID for the button (for CSS styling)
        button.setId("animated-button");

        // Add button to VBox layout
        VBox vbox = new VBox(button);

        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Load external CSS file
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the scene on the stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
