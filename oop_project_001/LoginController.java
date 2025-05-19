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
import my_class.Login_v1;

public class LoginController {

    Login_v1 login_v1 = new Login_v1("credentials.csv");

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

        String username = textfield_username.getText();

        String password;
        if (passwordfield_password.isVisible()) {
            password = passwordfield_password.getText();
        } else {
            password = textfield_password.getText();
        }

        if (login_v1.login(username, password)) {

            try {
                Stage stage = (Stage) button_login.getScene().getWindow();
                Scene scene = FXMLLoader.load(getClass().getResource("ApplicationView.fxml"));
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            label_status.setText("Invalid username or password");
            label_status.setStyle("-fx-text-fill: red;");
        }

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

            String password = passwordfield_password.getText();
            textfield_password.setText(password);

            textfield_password.setVisible(true);
            passwordfield_password.setVisible(false);
        } else {

            String password = textfield_password.getText();
            passwordfield_password.setText(password);

            passwordfield_password.setVisible(true);
            textfield_password.setVisible(false);
        }
    }

}
