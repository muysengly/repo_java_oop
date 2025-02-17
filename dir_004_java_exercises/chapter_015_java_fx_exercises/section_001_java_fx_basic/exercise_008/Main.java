import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Styled JavaFX App");

        VBox root = new VBox(10);

        // Create a label and apply a CSS style.
        Label styledLabel = new Label("Styled Label");
        styledLabel.getStyleClass().add("styled-label");

        // Create a button and apply a different CSS style.
        Button styledButton = new Button("Styled Button");
        styledButton.getStyleClass().add("styled-button");

        root.getChildren().addAll(styledLabel, styledButton);

        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
