//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Password Match Checker");

        // Create labels for password fields.
        Label passwordLabel1 = new Label("Enter Password:");
        Label passwordLabel2 = new Label("Confirm Password:");

        // Create password input fields.
        PasswordField passwordField1 = new PasswordField();
        PasswordField passwordField2 = new PasswordField();

        // Create a label to display the result.
        Label resultLabel = new Label();

        // Create a "Check Password" button.
        Button checkButton = new Button("Check Password");

        // Set an action for the button to check if passwords match.
        checkButton.setOnAction(event -> {
            String password1 = passwordField1.getText();
            String password2 = passwordField2.getText();

            if (password1.equals(password2)) {
                resultLabel.setText("Passwords match!");
            } else {
                resultLabel.setText("Passwords do not match. Please check.");
            }
        });

        // Create a layout (VBox) to arrange the elements.
        VBox root = new VBox(10);
        root.getChildren().addAll(passwordLabel1, passwordField1, passwordLabel2, passwordField2, checkButton,
                resultLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Password Match Checker App");

        // Show the window.
        primaryStage.show();
    }
}
