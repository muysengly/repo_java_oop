import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ViewController implements Initializable {

    @FXML
    private Button button_submit;

    @FXML
    private ChoiceBox<String> choicebox_1;

    @FXML
    private ChoiceBox<String> choicebox_2;

    @FXML
    private Label label_result;

    @FXML
    private Label label_time;

    @FXML
    void button_submit_action(ActionEvent event) {

        String asnwer_1 = choicebox_1.getValue();
        String asnwer_2 = choicebox_2.getValue();

        int score = 0;

        if (asnwer_1 == "String[]") {
            score++;
        }

        if (asnwer_2 == "System") {
            score++;
        }

        label_result.setText(Integer.toString(score));

        button_submit.setDisable(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choicebox_1.setValue("Answer");
        choicebox_2.setValue("Answer");

        String[] string_1 = { "static", "String[]", "public" };
        String[] string_2 = { "System", "System.in", "default" };

        choicebox_1.getItems().addAll(string_1);
        choicebox_2.getItems().addAll(string_2);
    }

}
