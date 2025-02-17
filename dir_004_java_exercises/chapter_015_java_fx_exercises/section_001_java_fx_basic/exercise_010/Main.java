import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shape Animation");

        Pane root = new Pane();

        // Create a circle to animate.
        Circle circle = new Circle(50, Color.RED);
        circle.setCenterX(50);
        circle.setCenterY(100);

        // Create a button to start the animation.
        Button startButton = new Button("Start Animation");
        startButton.setLayoutX(150);
        startButton.setLayoutY(250);

        // Create a TranslateTransition for the circle.
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), circle);

        // Set the target location for the animation.
        translateTransition.setToX(250);
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);

        // Handle the button click to start the animation.
        startButton.setOnAction(event -> {
            if (!translateTransition.getStatus().equals(TranslateTransition.Status.RUNNING)) {
                translateTransition.play();
            }
        });

        root.getChildren().addAll(circle, startButton);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
