import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button button_001;

    @FXML
    void button_001_action(ActionEvent event) {
        System.out.println("Button 001 clicked");
    }

}
