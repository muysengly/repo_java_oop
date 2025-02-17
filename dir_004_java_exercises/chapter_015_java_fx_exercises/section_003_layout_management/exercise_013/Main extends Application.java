//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text ScrollPane Example");

        // Create a TextArea to hold the long text document
        TextArea textArea = new TextArea();
        textArea.setWrapText(true); // Enable text wrapping

        // Add your long text here (or load it from a file)
        String longText = "In the exercise above, we create a 'TextArea' to hold the long text document. \n" +
            "We enable text wrapping and set the text content. A 'ScrollPane' is used to display the 'TextArea' with scrollbars.\n" +
            "The scroll policy is set to 'AS_NEEDED' for both horizontal and vertical scrollbars." +
			"Finally, the 'ScrollPane' is added to a 'StackPane', which is added to the 'Scene' and displayed in the 'Stage'."+
			"Note: Replace the 'longText' variable with your own long text or load it from a file.";

        textArea.setText(longText);

        // Create a ScrollPane to display the TextArea with scrollbars
        ScrollPane scrollPane = new ScrollPane(textArea);

        // Set scroll policy to ensure both horizontal and vertical scrollbars appear as needed
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        // Create a StackPane to hold the ScrollPane
        StackPane root = new StackPane();
        root.getChildren().add(scrollPane);

        // Create a scene and add it to the stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
