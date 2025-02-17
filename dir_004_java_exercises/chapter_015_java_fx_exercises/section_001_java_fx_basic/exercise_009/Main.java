import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Changing Circle");

        Pane root = new Pane();

        // Create an Ellipse (circle).
        Ellipse circle = new Ellipse(150, 150, 100, 100);
        circle.setFill(Color.GREEN); // Initial color

        // Handle the click event to change the circle's color.
        circle.setOnMouseClicked(event -> {
            if (circle.getFill() == Color.GREEN) {
                circle.setFill(Color.RED);
            } else {
                circle.setFill(Color.GREEN);
            }
        });

        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
