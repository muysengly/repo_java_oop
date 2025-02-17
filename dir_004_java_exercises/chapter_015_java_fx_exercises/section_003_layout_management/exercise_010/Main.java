//Main.java

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Spiral Layout Example");
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.WHITE);

        int numCircles = 100;
        double centerX = scene.getWidth() / 2;
        double centerY = scene.getHeight() / 2;
        double radius = 10;
        double angle = 0;
        double angleIncrement = 15;

        for (int i = 0; i < numCircles; i++) {
            double x = centerX + radius * Math.cos(Math.toRadians(angle));
            double y = centerY + radius * Math.sin(Math.toRadians(angle));

            Circle circle = new Circle(x, y, 5, Color.BLUE);
            root.getChildren().add(circle);

            radius += 10;
            angle += angleIncrement;
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
