//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
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
        primaryStage.setTitle("Image ScrollPane Example");

        // Load a large image
        Image image = new Image("large_image.png"); // Replace with your image file path

        // Create an ImageView to display the image
        ImageView imageView = new ImageView(image);

        // Create a ScrollPane to display the image with scrollbars
        ScrollPane scrollPane = new ScrollPane(imageView);

        // Set scroll policy to ensure both horizontal and vertical scrollbars appear as needed
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        // Create a StackPane to hold the ScrollPane
        StackPane root = new StackPane();
        root.getChildren().add(scrollPane);

        // Create a scene and add it to the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
