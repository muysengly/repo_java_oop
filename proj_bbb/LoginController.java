import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

        try {
            Stage stage = (Stage) button_register.getScene().getWindow();
            Scene scene = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }

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
