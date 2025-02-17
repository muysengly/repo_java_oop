
// Main.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Styled Labels");

        // Creating labels
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");

        // Setting IDs for labels to apply CSS styling
        label1.setId("custom-label");
        label2.setId("custom-label");
        label3.setId("custom-label");

        // Creating a VBox layout to hold the labels
        VBox vbox = new VBox(12, label1, label2, label3);
        vbox.getStyleClass().add("label-container");

        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Load CSS file to style the labels
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the scene on the stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
