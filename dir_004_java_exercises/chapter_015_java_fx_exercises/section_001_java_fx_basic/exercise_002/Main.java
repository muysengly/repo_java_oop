import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a button.
        Button actionButton = new Button("Click Me");

        // Set an action when the button is clicked.
        actionButton.setOnAction(event -> {
            // You can choose to either display an alert:
            showAlert("Button Clicked", "You clicked the button!");

            // OR change the button text:
            // actionButton.setText("Clicked!");
        });

        // Create a layout for the button.
        VBox root = new VBox(10);
        root.getChildren().add(actionButton);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Button Action App");

        // Show the window.
        primaryStage.show();
    }

    // Helper method to show an alert dialog.
    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
