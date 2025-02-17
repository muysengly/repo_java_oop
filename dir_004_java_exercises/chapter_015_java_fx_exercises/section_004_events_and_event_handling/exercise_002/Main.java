//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mouse Click App");

        Label clickLabel = new Label("Mouse Click: ");

        // Create a VBox to arrange the labels
        VBox vbox = new VBox(clickLabel);

        // Create a scene
        Scene scene = new Scene(vbox, 400, 300);

        // Register a mouse clicked event handler
        scene.setOnMouseClicked(event -> {
            if (event.isPrimaryButtonDown()) {
                // System.out.println("Hello\nAlexandra Abramov!");
                clickLabel.setText("Mouse Click: Left button clicked");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
