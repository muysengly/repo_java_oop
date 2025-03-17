import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
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
    private ChoiceBox<String> choicebox_3;

    @FXML
    private Label label_time;

    @FXML
    private Label label_result;

    @FXML
    void button_submit_action(ActionEvent event) {

        String answer_1 = choicebox_1.getValue();
        String answer_2 = choicebox_2.getValue();
        String answer_3 = choicebox_3.getValue();

        float score = 0;

        if (answer_1.equals("static")) {
            score += 1;
        }

        if (answer_2.equals("String[]")) {
            score += 1;
        }

        if (answer_3.equals("System")) {
            score += 1;
        }

        label_result.setText("Score: " + score + "/3.0");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Start 2mn countdown
        startCountdown(2 * 60);

        // set placeholder for choicebox
        choicebox_1.setValue("Answer");
        choicebox_2.setValue("Answer");
        choicebox_3.setValue("Answer");

        // set choices for choicebox
        String[] choice_1 = { "int", "static", "void", "class" };
        String[] choice_2 = { "public", "private", "String[]", "default" };
        String[] choice_3 = { "System", "next", "String", "static" };

        // add choices to choicebox
        choicebox_1.getItems().addAll(choice_1);
        choicebox_2.getItems().addAll(choice_2);
        choicebox_3.getItems().addAll(choice_3);

    }

    // Countdown timer
    private void startCountdown(int seconds) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = seconds; i >= 0; i--) {
                    int currentSecond = i;
                    // Update UI with the new value
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            label_time.setText(String.valueOf(currentSecond / 60) + "mn"
                                    + String.valueOf(currentSecond % 60) + "s");
                        }
                    });
                    try {
                        Thread.sleep(1000); // Pause for 1 second
                    } catch (InterruptedException e) {
                    }
                }
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        label_time.setText("Time's up!");
                        button_submit_action(null);
                        button_submit.setDisable(true);
                    }
                });
            }
        });

        // Allow thread to stop when the app closes
        thread.setDaemon(true);
        thread.start();
    }

}
