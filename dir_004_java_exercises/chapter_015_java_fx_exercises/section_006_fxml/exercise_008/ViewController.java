import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;

public class ViewController {

    @FXML
    private ColorPicker colorpicker_001;

    @FXML
    private void initialize() {
        colorpicker_001.setOnAction((e) -> {
            System.out.println("Selected color: " + colorpicker_001.getValue());
        });
    }

}
