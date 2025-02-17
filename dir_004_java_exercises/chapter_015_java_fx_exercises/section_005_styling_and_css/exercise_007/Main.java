// Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pseudo-Class Example");

        // Create buttons
        Button button1 = new Button("Hover over me!");
        Button button2 = new Button("Click me!");

        // Set IDs for buttons (for CSS styling)
        button1.setId("hover-button");
        button2.setId("focused-button");

        // Add buttons to VBox layout
        VBox vbox = new VBox(button1, button2);

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
