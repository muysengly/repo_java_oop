import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a label to display the "Hello, JavaFX!" message.
        Label helloLabel = new Label(" Hello, JavaFX!");

        // Create labels to display the Java and JavaFX versions.
        Label javaVersionLabel = new Label(" Java Version: " + System.getProperty("java.version"));
        Label javafxVersionLabel = new Label(" JavaFX Version: " + System.getProperty("javafx.version"));

        // Create a VBox layout to arrange the labels vertically.
        VBox root = new VBox(10); // 10 is the spacing between elements.
        root.getChildren().addAll(helloLabel, javaVersionLabel, javafxVersionLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 150); // Width and height of the window.
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Hello JavaFX App");

        // Show the window.
        primaryStage.show();
    }
}
