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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class RegisterController {

    @FXML
    private Button button_back_to_login;

    @FXML
    private Button button_register;

    @FXML
    private CheckBox checkbox_show_password;

    @FXML
    private Label label_status_password;

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void button_register_action(ActionEvent event) {

    }

    @FXML
    void checkbox_show_password_action(ActionEvent event) {
        if (checkbox_show_password.isSelected()) {
            textfield_password.setText(passwordfield_password.getText());
            textfield_password.setVisible(true);
            passwordfield_password.setVisible(false);
        } else {
            passwordfield_password.setText(textfield_password.getText());
            passwordfield_password.setVisible(true);
            textfield_password.setVisible(false);
        }
    }

    @FXML
    void passwordfield_password_action(KeyEvent event) {
        String password = passwordfield_password.getText();
        if (password.length() < 6) {
            label_status_password.setText("invalid password");
            label_status_password.setStyle("-fx-text-fill: red;");
        } else {
            label_status_password.setText("valid password");
            label_status_password.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    void passwordfield_verify_password_action(KeyEvent event) {
        String password = "";

        if (passwordfield_password.isVisible() == true) {
            password = passwordfield_password.getText();
        } else {
            password = textfield_password.getText();
        }

        String verify_password = passwordfield_verify_password.getText();

        if (!password.equals(verify_password)) {
            label_status_verify_password.setText("passwords do not match");
            label_status_verify_password.setStyle("-fx-text-fill: red;");
        } else {
            label_status_verify_password.setText("passwords match");
            label_status_verify_password.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    void textfield_password_action(KeyEvent event) {
        String password = textfield_password.getText();
        if (password.length() < 6) {
            label_status_password.setText("invalid password");
            label_status_password.setStyle("-fx-text-fill: red;");
        } else {
            label_status_password.setText("valid password");
            label_status_password.setStyle("-fx-text-fill: green;");
        }
    }

}
