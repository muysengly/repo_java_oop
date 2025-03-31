import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View_Controller {

    @FXML
    private Button button_result;

    @FXML
    private Label label_result_1;

    @FXML
    private Label label_result_2;

    @FXML
    private TextField textfield_a;

    @FXML
    private TextField textfield_b;

    @FXML
    private TextField textfield_c;

    @FXML
    void button_action_result(ActionEvent event) {

        double a = Double.parseDouble(textfield_a.getText());
        double b = Double.parseDouble(textfield_b.getText());
        double c = Double.parseDouble(textfield_c.getText());

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            label_result_1.setText("No real roots");
            label_result_2.setText("");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            label_result_1.setText(String.format("%.4f", x));
            label_result_2.setText("None");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            label_result_1.setText(String.format("%.4f", x1));
            label_result_2.setText(String.format("%.4f", x2));
        }

    }

}
