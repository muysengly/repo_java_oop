//Main.java

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Button Click Event Example");

        // Create a button
        Button button = new Button("Click Me");

        // Add an event handler to the button
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Display a message when the button is clicked
                System.out.println("Button Clicked!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 250));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}