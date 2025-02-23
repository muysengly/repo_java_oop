//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane Example");

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Create a label at the top
        Label topLabel = new Label("Top Label");
        borderPane.setTop(topLabel);

        // Create a button in the center
        Button centerButton = new Button("Center Button");
        borderPane.setCenter(centerButton);

        // Create a ListView at the bottom
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1", "Item 2", "Item 3", "Item 4");
        borderPane.setBottom(listView);

        // Create the scene and set it in the stage
        Scene scene = new Scene(borderPane, 400, 300); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
