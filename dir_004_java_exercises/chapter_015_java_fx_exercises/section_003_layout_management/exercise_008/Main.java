//Main.java

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane with Custom Alignment");

        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        // Create labels for different cells
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");

        // Customize the alignment for specific cells
        GridPane.setHalignment(label1, HPos.CENTER);
        GridPane.setValignment(label1, VPos.TOP);

        GridPane.setHalignment(label2, HPos.CENTER);
        GridPane.setValignment(label2, VPos.CENTER);

        GridPane.setHalignment(label3, HPos.CENTER);
        GridPane.setValignment(label3, VPos.BOTTOM);

        // Add labels to the GridPane at specific positions
        gridPane.add(label1, 0, 0);
        gridPane.add(label2, 1, 1);
        gridPane.add(label3, 2, 2);

        // Create the scene and set it in the stage
        Scene scene = new Scene(gridPane, 300, 200); // Width and height of the window
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
