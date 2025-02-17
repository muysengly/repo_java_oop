//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Two Buttons App");

        // Create a label with the initial text.
        Label label = new Label("No button clicked.");

        // Create the first button.
        Button button1 = new Button("Button 1");

        // Create the second button.
        Button button2 = new Button("Button 2");

        // Set actions for the buttons to change the label text.
        button1.setOnAction(event -> {
            label.setText("Button-1 clicked.");
        });

        button2.setOnAction(event -> {
            label.setText("Button-2 clicked.");
        });

        // Create a layout (VBox) to arrange the label and buttons.
        VBox root = new VBox(10);
        root.getChildren().addAll(label, button1, button2);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Show the window.
        primaryStage.show();
    }
}
