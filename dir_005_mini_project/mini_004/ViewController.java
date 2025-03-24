import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ViewController implements Initializable {

    @FXML
    private Button button_buy;

    @FXML
    private Label label_price;

    @FXML
    private Spinner<Integer> spinner_apple;

    @FXML
    private Spinner<Integer> spinner_banana;

    @FXML
    private Spinner<Integer> spinner_orange;

    @FXML
    void button_buy_action(ActionEvent event) {

        double apple_price = 1;
        double banana_price = 2;
        double orange_price = 3;

        int apple_qty = spinner_apple.getValue();
        int banana_qty = spinner_banana.getValue();
        int orange_qty = spinner_orange.getValue();

        double total_price = apple_price * apple_qty + banana_price * banana_qty + orange_price * orange_qty;

        label_price.setText(total_price + "$");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        spinner_apple.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        spinner_banana.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        spinner_orange.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
    }

}
