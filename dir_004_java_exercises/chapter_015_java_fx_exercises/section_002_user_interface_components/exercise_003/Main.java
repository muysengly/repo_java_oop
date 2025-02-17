import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random Number App");

        // Create an empty label.
        Label label = new Label();

        // Create a button labeled "Generate Random Number."
        Button button = new Button("Generate Random Number");

        // Set an action for the button to generate and display a random number.
        button.setOnAction(event -> {
            int randomNumber = generateRandomNumber(1, 10);
            label.setText("Random Number: " + randomNumber);
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

    private int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
