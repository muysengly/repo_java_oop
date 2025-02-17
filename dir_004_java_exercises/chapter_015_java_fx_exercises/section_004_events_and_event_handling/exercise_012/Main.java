//Main.java

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title for the drawing application window
        primaryStage.setTitle("Drawing Application");

        // Create a root pane
        Pane root = new Pane();

        // Create a rectangle for drawing
        Rectangle rectangle = createRectangle(100, 100, 100, 50, Color.BLUE);

        // Add an event filter to the rectangle to handle mouse events
        rectangle.addEventFilter(MouseEvent.MOUSE_PRESSED, event -> {
            // Handle mouse press event (e.g., start dragging)
            System.out.println("Mouse Pressed");
            event.consume();
        });

        rectangle.addEventFilter(MouseEvent.MOUSE_DRAGGED, event -> {
            // Handle mouse drag event (e.g., move or resize the rectangle)
            System.out.println("Mouse Dragged");
            event.consume();
        });

        rectangle.addEventFilter(MouseEvent.MOUSE_RELEASED, event -> {
            // Handle mouse release event (e.g., stop dragging)
            System.out.println("Mouse Released");
            event.consume();
        });

        // Add the rectangle to the root pane
        root.getChildren().add(rectangle);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);

        // Show the drawing application window
        primaryStage.show();
    }

    // Helper method to create a rectangle
    private Rectangle createRectangle(double x, double y, double width, double height, Color color) {
        Rectangle rect = new Rectangle(x, y, width, height);
        rect.setFill(color);
        return rect;
    }
}
