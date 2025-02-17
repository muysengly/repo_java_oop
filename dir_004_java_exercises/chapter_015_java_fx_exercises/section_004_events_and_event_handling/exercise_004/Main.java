//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label; // Import Label
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Main extends Application {
    private StackPane root;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Key Combination Color Change");

        root = new StackPane();
        Scene scene = new Scene(root, 400, 300);

        // Initial background color
        root.setStyle("-fx-background-color: white;");

        // Label to display the message
        Label messageLabel = new Label("Press Ctrl+Alt+O to change the background to orange:");
        root.getChildren().add(messageLabel);

        // Listen for key presses
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.isControlDown() && event.isAltDown() && event.getCode() == KeyCode.O) {
                // Ctrl+Alt+O changes background to orange
                root.setStyle("-fx-background-color: orange;");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
