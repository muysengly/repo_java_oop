import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View_Controller {

    @FXML
    private Button button_result;

    @FXML
    private Label label_result;

    @FXML
    private TextField textfied_b;

    @FXML
    private TextField textfield_a;

    @FXML
    void button_result_action(ActionEvent event) {

        int a = Integer.parseInt(textfield_a.getText());
        int b = Integer.parseInt(textfied_b.getText());
        int result = a + b;
        label_result.setText(String.valueOf(result));

    }

}
