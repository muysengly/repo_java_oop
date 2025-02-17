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
        primaryStage.setTitle("Button Label App");

        // Create a label with the initial text.
        Label label = new Label("JavaFX!");

        // Create a button.
        Button button = new Button("Click Me");

        // Set an action for the button to change the label text.
        button.setOnAction(event -> {
            label.setText("Button Clicked!");
        });

        // Create a layout (VBox) to arrange the label and button.
        VBox root = new VBox(10);
        root.getChildren().addAll(label, button);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Show the window.
        primaryStage.show();
    }
}
