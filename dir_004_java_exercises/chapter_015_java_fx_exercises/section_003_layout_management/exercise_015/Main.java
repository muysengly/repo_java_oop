//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;

public class Main extends Application {
    private double zoomFactor = 1.0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Custom Zoom ScrollBars Example");

        // Load an image (provide the correct path to your image)
        Image image = new Image("file:java-exercises.PNG"); // Replace with the actual path
        ImageView imageView = new ImageView(image);

        // Create ScrollBars for zoom control
        ScrollBar horizontalScrollBar = new ScrollBar();
        ScrollBar verticalScrollBar = new ScrollBar();

        // Set initial zoom level
        double initialZoom = 1.0;
        imageView.setFitWidth(image.getWidth() * initialZoom);
        imageView.setFitHeight(image.getHeight() * initialZoom);

        // Bind ScrollBars to ImageView for zooming
        ChangeListener<Number> scrollListener = (observable, oldValue, newValue) -> {
            double scale = 2.0; // Adjust the scale factor for zooming
            double offsetX = (horizontalScrollBar.getValue() / horizontalScrollBar.getMax())
                    * (imageView.getImage().getWidth() - imageView.getFitWidth());
            double offsetY = (verticalScrollBar.getValue() / verticalScrollBar.getMax())
                    * (imageView.getImage().getHeight() - imageView.getFitHeight());

            imageView.setViewport(new javafx.geometry.Rectangle2D(offsetX, offsetY, imageView.getFitWidth() / scale,
                    imageView.getFitHeight() / scale));
        };

        horizontalScrollBar.valueProperty().addListener(scrollListener);
        verticalScrollBar.valueProperty().addListener(scrollListener);

        // Set the scroll bars' parameters
        horizontalScrollBar.setMin(0);
        verticalScrollBar.setMin(0);
        horizontalScrollBar.setMax(1);
        verticalScrollBar.setMax(1);

        // Implement zooming
        imageView.setOnScroll(event -> {
            double delta = 1.05;
            if (event.getDeltaY() < 0) {
                zoomFactor /= delta;
            } else {
                zoomFactor *= delta;
            }
            imageView.setFitWidth(image.getWidth() * zoomFactor);
            imageView.setFitHeight(image.getHeight() * zoomFactor);
        });

        // Create a BorderPane layout to arrange components
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(imageView);
        borderPane.setBottom(horizontalScrollBar);
        borderPane.setRight(verticalScrollBar);

        // Create a scene and add it to the stage
        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
