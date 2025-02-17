import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Set the title for the primary stage
        primaryStage.setTitle("Styled Buttons");

        // Create Button 1 with specified styles
        Button button1 = new Button("Button 1");
        button1.setStyle("-fx-font-size: 14; -fx-background-color: #FF6347; -fx-text-fill: white;");

        // Create Button 2 with specified styles
        Button button2 = new Button("Button 2");
        button2.setStyle(
                "-fx-font-size: 16; -fx-background-color: #1E90FF; -fx-text-fill: white; -fx-border-color: black;");

        // Create Button 3 with specified styles
        Button button3 = new Button("Button 3");
        button3.setStyle(
                "-fx-font-size: 18; -fx-background-color: #32CD32; -fx-text-fill: white; -fx-border-radius: 5;");

        // Create a VBox layout to hold the buttons with spacing
        VBox vbox = new VBox(10, button1, button2, button3);
        vbox.setSpacing(10);

        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Set the scene on the primary stage
        primaryStage.setScene(scene);

        // Display the primary stage
        primaryStage.show();
    }

    // Launch the application
    public static void main(String[] args) {
        launch(args);
    }
}
