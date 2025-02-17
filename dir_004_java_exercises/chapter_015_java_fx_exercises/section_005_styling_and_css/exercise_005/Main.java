// Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Styled JavaFX App");

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        // Add buttons to a VBox layout
        VBox vbox = new VBox(10, button1, button2);

        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Load external CSS file to style the components
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the scene on the stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
