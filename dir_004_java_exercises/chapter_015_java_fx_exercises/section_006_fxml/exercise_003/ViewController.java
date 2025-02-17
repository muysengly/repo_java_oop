import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class ViewController {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    void button1action(ActionEvent event) {
        text1.setText("Button 1 was clicked!");
    }

    @FXML
    void button2action(ActionEvent event) {
        text2.setText("Button 2 was clicked!");
    }

}
