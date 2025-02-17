
// Main.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Styled Form");

        // Creating text fields
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();

        // Labels for text fields
        Label label1 = new Label("Name:");
        Label label2 = new Label("Email:");
        Label label3 = new Label("Phone:");

        // Creating a VBox layout to hold the form elements
        VBox vbox = new VBox();
        vbox.getChildren().addAll(
                createFormField(label1, textField1),
                createFormField(label2, textField2),
                createFormField(label3, textField3));

        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Load CSS file to style the text fields
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the scene on the stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to create form fields with labels
    private VBox createFormField(Label label, TextField textField) {
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField);
        vBox.getStyleClass().add("form-field");
        return vBox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
