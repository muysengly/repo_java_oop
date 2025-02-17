//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Horizontal Images");

        // Create Image objects for your images (provide the correct image file paths)
        Image image1 = new Image("cpp-exercises.png");
        Image image2 = new Image("java-exercises.png");
        Image image3 = new Image("javafx-exercises.png");

        // Create ImageView objects to display the images
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);

        // Create an HBox layout to arrange the images horizontally
        HBox root = new HBox(10); // 10 is the spacing between images
        root.getChildren().addAll(imageView1, imageView2, imageView3);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 400, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
