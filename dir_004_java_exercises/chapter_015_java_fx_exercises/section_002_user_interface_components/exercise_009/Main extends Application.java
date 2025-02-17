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
        primaryStage.setTitle("Country Selection App");

        // Create a label to display the selected country's capital.
        Label capitalLabel = new Label("Capital: ");

        // Create a ComboBox with a list of countries.
        ComboBox<string> countryComboBox = new ComboBox<>(FXCollections.observableArrayList(
                "United States", "Canada", "United Kingdom", "Germany", "France", "Japan", "Australia"
        ));

        // Create a map to store the capitals of the countries.
        Map<string, string=""> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("Australia", "Canberra");
		countryCapitalMap.put("Canada", "Ottawa");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Germany", "Berlin");
		countryCapitalMap.put("India", "New Delhi");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("United Kingdom", "London");
		countryCapitalMap.put("United States", "Washington, D.C.");		

        // Handle the action when a country is selected from the ComboBox.
        countryComboBox.setOnAction(event -> {
            String selectedCountry = countryComboBox.getValue();
            String capital = countryCapitalMap.get(selectedCountry);
            capitalLabel.setText("Capital: " + capital);
        });

        // Create a layout (VBox) to arrange the ComboBox and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(countryComboBox, capitalLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }
}
</string,></string>