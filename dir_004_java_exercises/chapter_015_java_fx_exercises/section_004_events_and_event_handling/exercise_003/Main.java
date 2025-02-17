//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Key Press Example");

        Label label = new Label("Press a key");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);

        scene.setOnKeyPressed(event -> {
            String keyText = event.getText();
            label.setText("Key pressed: " + keyText);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
