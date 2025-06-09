import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import my_class_bbb.Register;
import my_class_bbb._Register;

public class RegisterController {

    Register register = new Register();

    @FXML
    private Button button_back_to_login;

    @FXML
    private Button button_register;

    @FXML
    private CheckBox checkbox_show_password;

    @FXML
    private Label label_status;

    @FXML
    private Label label_status_password;

    @FXML
    private Label label_status_username;

    @FXML
    private Label label_status_verify_password;

    @FXML
    private PasswordField passwordfield_password;

    @FXML
    private PasswordField passwordfield_verify_password;

    @FXML
    private TextField textfield_password;

    @FXML
    private TextField textfield_username;

    @FXML
    void button_back_to_login_action(ActionEvent event) {

        try {

            Stage stage = (Stage) button_back_to_login.getScene().getWindow();

            Scene scene = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @FXML
    void checkbox_show_password(ActionEvent event) {

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

    @FXML
    void button_register_action(ActionEvent event) {

        String username = textfield_username.getText();

        String password;
        if (checkbox_show_password.isSelected()) {
            password = textfield_password.getText();
        } else {
            password = passwordfield_password.getText();
        }

        String verify_password = passwordfield_verify_password.getText();

        if (verify_password.equals(password)) {
            boolean success = register.isRegisterSuccess(username, password);
            if (success) {
                label_status.setText("Register Success!");
                label_status.setStyle("-fx-text-fill: green");
            } else {
                label_status.setText("Register Fail!");
                label_status.setStyle("-fx-text-fill: red");
            }
        } else {
            label_status.setText("Register Fail!");
            label_status.setStyle("-fx-text-fill: red");
        }

    }

    @FXML
    void passwordfield_password_action(KeyEvent event) {
        if (!checkbox_show_password.isSelected()) {
            String password = passwordfield_password.getText();

            if (register.isPasswordValid(password)) {
                label_status_password.setText("Password is valid!");
                label_status_password.setStyle("-fx-text-fill: green");
            } else {
                label_status_password.setText("Password invalid!");
                label_status_password.setStyle("-fx-text-fill: red");
            }

        }
    }

    @FXML
    void textfield_password_action(KeyEvent event) {
        if (checkbox_show_password.isSelected()) {
            String password = textfield_password.getText();

            if (register.isPasswordValid(password)) {
                label_status_password.setText("Password is valid!");
                label_status_password.setStyle("-fx-text-fill: green");
            } else {
                label_status_password.setText("Password invalid!");
                label_status_password.setStyle("-fx-text-fill: red");
            }

        }
    }

    @FXML
    void passwordfield_verify_password_action(KeyEvent event) {

        String password;
        if (checkbox_show_password.isSelected()) {
            password = textfield_password.getText();
        } else {
            password = passwordfield_password.getText();
        }

        String verify_password = passwordfield_verify_password.getText();

        if (verify_password.equals(password)) {
            label_status_verify_password.setText("Password the same!");
            label_status_verify_password.setStyle("-fx-text-fill: green");
        } else {
            label_status_verify_password.setText("Password isn't the same!");
            label_status_verify_password.setStyle("-fx-text-fill: red");
        }

    }

    @FXML
    void textfield_username_action(KeyEvent event) {

        String username = textfield_username.getText();

        if (register.isUserNameValid(username)) {
            label_status_username.setText("Username is valid!");
            label_status_username.setStyle("-fx-text-fill: green");
        } else {
            label_status_username.setText("Username invalid!");
            label_status_username.setStyle("-fx-text-fill: red");
        }

    }

}
