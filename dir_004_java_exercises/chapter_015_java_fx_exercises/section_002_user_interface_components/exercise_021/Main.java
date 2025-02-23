//Main.java

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private ObservableList<String> messages;
    private ListView<String> messageListView;
    private TextArea messageTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chat Application");

        messages = FXCollections.observableArrayList();
        messageListView = new ListView<>(messages);
        messageTextArea = new TextArea();
        Button sendButton = new Button("Send");

        sendButton.setOnAction(event -> {
            String message = messageTextArea.getText();
            if (!message.isEmpty()) {
                messages.add("You: " + message);
                messageTextArea.clear();
            }
        });

        HBox inputBox = new HBox(10);
        inputBox.getChildren().addAll(messageTextArea, sendButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(messageListView, inputBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}