//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Food Order App");

        // Create a label to display the total cost.
        Label totalCostLabel = new Label("Total Cost: $0.00");

        // Create CheckBox options for food items.
        CheckBox burgerCheckBox = new CheckBox("Burger ($5.00)");
        CheckBox pizzaCheckBox = new CheckBox("Pizza ($8.00)");

        // Handle the action when a CheckBox is clicked.
        burgerCheckBox.setOnAction(event -> updateTotalCost(totalCostLabel, burgerCheckBox, pizzaCheckBox));
        pizzaCheckBox.setOnAction(event -> updateTotalCost(totalCostLabel, burgerCheckBox, pizzaCheckBox));

        // Create a layout (VBox) to arrange the CheckBox options and label.
        VBox root = new VBox(10);
        root.getChildren().addAll(burgerCheckBox, pizzaCheckBox, totalCostLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.show();
    }

    // Update the label to display the total cost based on selected items.
    private void updateTotalCost(Label label, CheckBox burgerCheckBox, CheckBox pizzaCheckBox) {
        double totalCost = 0.0;

        if (burgerCheckBox.isSelected()) {
            totalCost += 5.00;
        }
        if (pizzaCheckBox.isSelected()) {
            totalCost += 8.00;
        }

        label.setText("Total Cost: $" + String.format("%.2f", totalCost));
    }
}
