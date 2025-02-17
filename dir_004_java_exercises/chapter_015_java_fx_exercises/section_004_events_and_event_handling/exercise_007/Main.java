//Main.java

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private VBox cart;
    private int itemCount = 0;
    private Label cartLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shopping Cart");

        // Create a list to represent the shopping cart
        cart = new VBox();
        cart.setSpacing(10);
        cart.setPadding(new Insets(10));

        cartLabel = new Label("Shopping Cart:");
        HBox cartContainer = new HBox(cartLabel, cart);

        // Create item buttons
        Button addItemButton1 = createAddItemButton("Item 1", 10.0);
        Button addItemButton2 = createAddItemButton("Item 2", 20.0);
        Button addItemButton3 = createAddItemButton("Item 3", 30.0);

        // Create the layout
        VBox root = new VBox(cartContainer, addItemButton1, addItemButton2, addItemButton3);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createAddItemButton(String itemName, double itemPrice) {
        Button button = new Button("Add " + itemName + " to Cart");
        button.setOnAction(event -> addItemToCart(itemName, itemPrice));
        return button;
    }

    private void addItemToCart(String itemName, double itemPrice) {
        Label itemLabel = new Label(itemName + " - $" + itemPrice);
        cart.getChildren().add(itemLabel);
        itemCount++;
        updateCartLabel();
    }

    private void updateCartLabel() {
        cartLabel.setText("Shopping Cart (" + itemCount + " items):");
    }
}
