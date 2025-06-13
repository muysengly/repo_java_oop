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
import my_class_aaa.LogIn;

public class LoginController {

    @FXML
    private Button button_goto_register;

    @FXML
    private Button button_login;

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
    void button_goto_register_action(ActionEvent event) {

        try {

            Stage stage = (Stage) button_goto_register.getScene().getWindow();

            Scene scene = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    LogIn lg = new LogIn();

    @FXML
    void button_login_action(ActionEvent event) {

        String username = textfield_username.getText();
        String password;
        if (checkbox_show_password.isSelected()) {
            password = textfield_password.getText();
        } else {
            password = passwordfield_password.getText();
        }

        if (lg.isLogInSuccess(username, password)) {

            try {

                Stage stage = (Stage) button_login.getScene().getWindow();
                Scene scene = FXMLLoader.load(getClass().getResource("ApplicationView.fxml"));

                stage.setScene(scene);
                stage.show();

            } catch (Exception e) {
                // TODO: handle exception
            }

        } else {

            label_status.setText("Login Fail!");
            label_status.setStyle("-fx-text-fill: red");

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

            textfield_password.setVisible(false);
            passwordfield_password.setVisible(true);

        }

    }

}
