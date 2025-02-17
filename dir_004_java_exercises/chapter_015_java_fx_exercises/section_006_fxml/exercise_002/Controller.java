import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Label messageLabel;

    @FXML
    private Button clickButton;

    @FXML
    private void handleButtonClick() {
        messageLabel.setText("Hello, JavaFX!");
    }
}
