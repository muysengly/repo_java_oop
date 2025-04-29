import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ShowPasswordDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create both PasswordField and TextField
        PasswordField passwordField = new PasswordField();
        TextField textField = new TextField();
        textField.setManaged(false);
        textField.setVisible(false);

        // Bind the text fields
        textField.textProperty().bindBidirectional(passwordField.textProperty());

        // Toggle button
        CheckBox showPassword = new CheckBox("Show Password");
        showPassword.setOnAction(e -> {
            if (showPassword.isSelected()) {
                textField.setText(passwordField.getText());
                textField.setVisible(true);
                textField.setManaged(true);

                passwordField.setVisible(false);
                passwordField.setManaged(false);
            } else {
                passwordField.setText(textField.getText());
                passwordField.setVisible(true);
                passwordField.setManaged(true);

                textField.setVisible(false);
                textField.setManaged(false);
            }
        });

        VBox root = new VBox(10, new Label("Password:"), passwordField, textField, showPassword);
        root.setStyle("-fx-padding: 20;");
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Password Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
