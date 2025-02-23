//Main.java

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Month Days App");

        // Create a label to display the number of days.
        Label daysLabel = new Label("Number of Days: ");

        // Create a ComboBox with a list of months.
        ComboBox<String> monthComboBox = new ComboBox<>(FXCollections.observableArrayList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"));

        // Create a map to store the number of days for each month.
        Map<String, Integer> monthDaysMap = new HashMap<>();
        monthDaysMap.put("January", 31);
        monthDaysMap.put("February", 28);
        monthDaysMap.put("March", 31);
        monthDaysMap.put("April", 30);
        monthDaysMap.put("May", 31);
        monthDaysMap.put("June", 30);
        monthDaysMap.put("July", 31);
        monthDaysMap.put("August", 31);
        monthDaysMap.put("September", 30);
        monthDaysMap.put("October", 31);
        monthDaysMap.put("November", 30);
        monthDaysMap.put("December", 31);

        // Handle the action when a month is selected from the ComboBox.
        monthComboBox.setOnAction(event -> {
            String selectedMonth = monthComboBox.getValue();
            int days = monthDaysMap.get(selectedMonth);
            daysLabel.setText("Number of Days in " + selectedMonth + ": " + days);
        });

        // Create a layout (VBox) to arrange the ComboBox and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(monthComboBox, daysLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Show the window.
        primaryStage.show();
    }
}