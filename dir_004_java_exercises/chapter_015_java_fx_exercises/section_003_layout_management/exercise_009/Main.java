//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Circular Layout Example");

        CustomCircularLayout layout = new CustomCircularLayout();

        // Add items (Circles and Text) to the custom layout
        Circle circle1 = new Circle(50, 50, 30);
        circle1.setFill(Color.RED);

        Circle circle2 = new Circle(50, 50, 30);
        circle2.setFill(Color.GREEN);

        Circle circle3 = new Circle(50, 50, 30);
        circle3.setFill(Color.BLUE);

        Text text1 = new Text("Item 1");
        Text text2 = new Text("Item 2");
        Text text3 = new Text("Item 3");

        layout.getChildren().addAll(circle1, circle2, circle3, text1, text2, text3);

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Custom layout class that arranges children in a circular pattern
    class CustomCircularLayout extends Pane {
        @Override
        protected void layoutChildren() {
            double centerX = getWidth() / 2;
            double centerY = getHeight() / 2;
            double radius = Math.min(centerX, centerY);

            double angle = 0;
            int itemIndex = 0;

            for (javafx.scene.Node node : getChildren()) {
                if (node instanceof Circle) {
                    double x = centerX + radius * Math.cos(Math.toRadians(angle));
                    double y = centerY + radius * Math.sin(Math.toRadians(angle));
                    ((Circle) node).setCenterX(x);
                    ((Circle) node).setCenterY(y);
                    angle += 120;
                } else if (node instanceof Text) {
                    double x = centerX + radius * 0.8 * Math.cos(Math.toRadians(angle));
                    double y = centerY + radius * 0.8 * Math.sin(Math.toRadians(angle));
                    ((Text) node).setX(x);
                    ((Text) node).setY(y);
                    angle += 120;
                }
                itemIndex++;
            }
        }
    }
}
