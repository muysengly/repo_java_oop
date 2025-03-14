import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

    @FXML
    private Button button_1;

    @FXML
    private Label label_1;

    @FXML
    private TextField textfield_1;

    @FXML
    private TextField textfield_2;

    @FXML
    void button_1_action(ActionEvent event) {

        double num_1 = Double.parseDouble(textfield_1.getText());
        double num_2 = Double.parseDouble(textfield_2.getText());

        label_1.setText(Double.toString(num_1 + num_2));
    }

}
