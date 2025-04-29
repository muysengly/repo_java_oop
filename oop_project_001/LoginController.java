import java.io.IOException;

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
    private Button button_goto_register;

    @FXML
    private Button button_login;

    @FXML
    private CheckBox checkbox_show_pw;

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
            Stage stage = (Stage) button_goto_register.getScene().getWindow();
            Scene scene = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void checkbox_show_pw_action(ActionEvent event) {
        if (checkbox_show_pw.isSelected()) {
            textfield_password.setText(passwordfield_password.getText());
            textfield_password.setVisible(true);
            passwordfield_password.setVisible(false);
        } else {
            passwordfield_password.setText(textfield_password.getText());
            passwordfield_password.setVisible(true);
            textfield_password.setVisible(false);
        }
    }

}
