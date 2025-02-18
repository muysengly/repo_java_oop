import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class ViewController {

    @FXML
    private CheckBox checkBox_001;

    @FXML
    void checkbox_001_on_action(ActionEvent event) {
        System.out.println("Checkbox 001 is selected: " + checkBox_001.isSelected());
    }

}
