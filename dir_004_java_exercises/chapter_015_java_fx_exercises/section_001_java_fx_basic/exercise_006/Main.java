import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Load an image from a file (make sure to provide the correct path to the
        // image).
        Image image = new Image("image.png");

        // Create an ImageView to display the image.
        ImageView imageView = new ImageView(image);

        // Create a layout (StackPane) to display the image.
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 800, 600); // Adjust width and height as needed.
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Image Display App");

        // Show the window.
        primaryStage.show();
    }
}
