import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Wireless mode Selection");

        // Create a ToggleGroup for the ToggleButtons.
        ToggleGroup toggleGroup = new ToggleGroup();

        // Create ToggleButtons for Wireless mode Selection.
        ToggleButton bluetoothButton = createToggleButton("Bluetooth", toggleGroup);
        ToggleButton wifiButton = createToggleButton("WiFi", toggleGroup);
        ToggleButton hotspotButton = createToggleButton("Hotspot", toggleGroup);

        // Create a layout (HBox) to arrange the ToggleButtons.
        HBox root = new HBox(10);
        root.getChildren().addAll(bluetoothButton, wifiButton, hotspotButton);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 100);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Load CSS file
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Create a ToggleButton and add it to the ToggleGroup.
    private ToggleButton createToggleButton(String text, ToggleGroup toggleGroup) {
        ToggleButton button = new ToggleButton(text);
        button.setToggleGroup(toggleGroup);
        return button;
    }
}
