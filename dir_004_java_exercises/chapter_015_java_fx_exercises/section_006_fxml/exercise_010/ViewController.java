import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class ViewController {

    @FXML
    private DatePicker datepicker_001;

    @FXML
    private void initialize() {
        datepicker_001.setOnAction((e) -> {
            System.out.println("Selected date: " + datepicker_001.getValue());
        });
    }

}
