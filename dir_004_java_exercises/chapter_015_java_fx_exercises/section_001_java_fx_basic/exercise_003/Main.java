import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create labels, text fields, and buttons.
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        // Create a VBox layout to arrange the components vertically.
        VBox root = new VBox(10); // 10 is the spacing between elements.
        root.getChildren().addAll(nameLabel, nameField, ageLabel, ageField, submitButton, clearButton);

        // Set action for the "Submit" button.
        submitButton.setOnAction(event -> {
            String name = nameField.getText();
            String age = ageField.getText();
            // You can perform an action with the input values, e.g., display them in an
            // alert.
            displayInfo("Information", "Name: " + name + "\nAge: " + age);
        });

        // Set action for the "Clear" button.
        clearButton.setOnAction(event -> {
            nameField.clear();
            ageField.clear();
        });

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200); // Width and height of the window.
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("VBox Layout App");

        // Show the window.
        primaryStage.show();
    }

    // Helper method to display information in an alert.
    private void displayInfo(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
