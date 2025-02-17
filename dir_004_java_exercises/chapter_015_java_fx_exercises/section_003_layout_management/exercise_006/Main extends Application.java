//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HBox with Center Alignment");

        // Create an HBox layout with center alignment
        HBox hbox = new HBox();
        hbox.setSpacing(10); // Set spacing between children

        // Create buttons and add them to the HBox
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        hbox.getChildren().addAll(button1, button2, button3);

        // Set center alignment for the HBox
        hbox.setAlignment(javafx.geometry.Pos.CENTER);

        // Create the scene and set it in the stage
        Scene scene = new Scene(hbox, 300, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
