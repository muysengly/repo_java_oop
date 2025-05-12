import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button button_login;

    @FXML
    private Button button_register;

    @FXML
    private CheckBox checkbox_show_password;

    @FXML
    private Label label_status;

    @FXML
    private PasswordField passwordfield_password;

    @FXML
    private TextField textfield_password;

    @FXML
    private TextField textfield_username;

    @FXML
    void button_login_action(ActionEvent event) {

    }

    @FXML
    void button_register_action(ActionEvent event) {

    }

    @FXML
    void checkbox_show_password_action(ActionEvent event) {

        if (checkbox_show_password.isSelected()) {
            String password = passwordfield_password.getText();
            textfield_password.setText(password);

            passwordfield_password.setVisible(false);
            textfield_password.setVisible(true);

        } else {
            String password = textfield_password.getText();
            passwordfield_password.setText(password);

            passwordfield_password.setVisible(true);
            textfield_password.setVisible(false);

        }

    }

}
