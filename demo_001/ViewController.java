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

        float num_1 = Float.parseFloat(textfield_1.getText());
        float num_2 = Float.parseFloat(textfield_2.getText());

        label_1.setText(Float.toString(num_1 + num_2));

    }

}
