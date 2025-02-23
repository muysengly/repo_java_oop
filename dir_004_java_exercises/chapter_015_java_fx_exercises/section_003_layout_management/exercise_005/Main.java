//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("VBox with Custom Spacing");

        // Create a VBox layout with custom spacing
        VBox vbox = new VBox(20); // Set the spacing between children to 20 pixels

        // Create labels and add them to the VBox
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");

        vbox.getChildren().addAll(label1, label2, label3);

        // Create the scene and set it in the stage
        Scene scene = new Scene(vbox, 300, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
