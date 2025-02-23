//Main.java

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text to ListView");

        // Create a TextArea for entering text.
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(30);
        textArea.setPrefRowCount(5);

        // Create a button for adding text to the ListView.
        Button addButton = new Button("Add to List");

        // Create a ListView to display entered text.
        ListView<String> listView = new ListView<>();

        addButton.setOnAction(event -> {
            String enteredText = textArea.getText();
            if (!enteredText.isEmpty()) {
                listView.getItems().add(enteredText);
                textArea.clear();
            }
        });

        // Create a layout to arrange the components.
        HBox inputBox = new HBox(10);
        inputBox.getChildren().addAll(textArea, addButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(inputBox, listView);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }
}