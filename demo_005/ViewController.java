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
        String choice_1 = choicebox_1.getValue();
        String choice_2 = choicebox_2.getValue();

        int score = 0;

        if (choice_1 == "1") {
            score++;
        }

        if (choice_2 == "a") {
            score++;
        }

        label_result.setText(Integer.toString(score));

        button_submit.setDisable(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] choice_1 = { "1", "2", "3" };
        String[] choice_2 = { "a", "b", "c" };

        choicebox_1.getItems().addAll(choice_1);
        choicebox_2.getItems().addAll(choice_2);
    }

}
