//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Vertical Buttons");

        // Create three buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Create a VBox layout to arrange the buttons vertically
        VBox root = new VBox(10); // 10 is the spacing between buttons
        root.getChildren().addAll(button1, button2, button3);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 200, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
