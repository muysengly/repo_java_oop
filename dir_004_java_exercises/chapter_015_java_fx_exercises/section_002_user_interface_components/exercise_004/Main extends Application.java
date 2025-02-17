//Main.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Field Button App");

        // Create a label to display the entered text.
        Label resultLabel = new Label("Result will be shown here.");

        // Create a text input field and a button.
        TextField inputField = new TextField();
        Button displayButton = new Button("Show Text");

        // Set an action for the button to display the entered text.
        displayButton.setOnAction(event -> {
            String enteredText = inputField.getText();
            resultLabel.setText("Input Text: " + enteredText);
        });

        // Create a layout for the input field, button, and result label.
        VBox root = new VBox(10);
        root.getChildren().addAll(inputField, displayButton, resultLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Text Input App");

        // Show the window.
        primaryStage.show();
    }
}
