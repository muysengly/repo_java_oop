import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class ViewController {

    @FXML
    private ComboBox<String> combobox_001;

    @FXML
    private void initialize() {
        combobox_001.getItems().addAll("Option 1", "Option 2", "Option 3");

        combobox_001.setOnAction((e) -> {
            System.out.println("Selected option: " + combobox_001.getValue());
        });
    }

}
