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
    public void start(Stage primary_stage) {
        primary_stage.setTitle("Horizontal Images");

        // Create Image objects for your images (provide the correct image file paths)
        Image image_1 = new Image("cpp.png");
        Image image_2 = new Image("java.png");
        Image image_3 = new Image("javafx.png");

        // Create ImageView objects to display the images
        ImageView image_view_1 = new ImageView(image_1);
        ImageView image_view_2 = new ImageView(image_2);
        ImageView image_view_3 = new ImageView(image_3);

        // Set the fit width and height for each ImageView
        double fit_width = 100; // Set the desired width
        double fit_height = 100; // Set the desired height
        image_view_1.setFitWidth(fit_width);
        image_view_1.setFitHeight(fit_height);
        image_view_2.setFitWidth(fit_width);
        image_view_2.setFitHeight(fit_height);
        image_view_3.setFitWidth(fit_width);
        image_view_3.setFitHeight(fit_height);

        // Create an HBox layout to arrange the images horizontally
        HBox root = new HBox(10); // 10 is the spacing between images
        root.getChildren().addAll(image_view_1, image_view_2, image_view_3);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 400, 200); // Width and height of the window
        primary_stage.setScene(scene);

        // Show the window
        primary_stage.show();
    }
}