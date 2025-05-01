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
import my_objects.Register_v2;

public class RegisterController {

    Register_v2 register_v2 = new Register_v2("credentials.csv");

    @FXML
    private Button button_back_to_login;

    @FXML
    private Button button_register;

    @FXML
    private CheckBox checkbox_show_password;

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void button_register_action(ActionEvent event) {

        String username = textfield_username.getText();
        String password = "";

        if (passwordfield_password.isVisible() == true) {
            password = passwordfield_password.getText();
        } else {
            password = textfield_password.getText();
        }

        if (register_v2.validateUsername(username) && register_v2.validatePassword(password)) {
            register_v2.register(username, password);
            System.out.println("User registered successfully");
        } else {
            System.out.println("Invalid username or password");

        }

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
    void textfield_password_action(KeyEvent event) {

        String password = textfield_password.getText();

        if (register_v2.validatePassword(password)) {
            label_status_password.setText("valid password");
            label_status_password.setStyle("-fx-text-fill: green;");
        } else {
            label_status_password.setText("invalid password");
            label_status_password.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    void passwordfield_password_action(KeyEvent event) {
        String password = passwordfield_password.getText();
        if (register_v2.validatePassword(password)) {
            label_status_password.setText("valid password");
            label_status_password.setStyle("-fx-text-fill: green;");
        } else {
            label_status_password.setText("invalid password");
            label_status_password.setStyle("-fx-text-fill: red;");
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

        if (register_v2.validateTwoPasswords(password, verify_password)) {
            label_status_verify_password.setText("passwords match");
            label_status_verify_password.setStyle("-fx-text-fill: green;");
        } else {
            label_status_verify_password.setText("passwords do not match");
            label_status_verify_password.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    void textfield_username_(KeyEvent event) {
        String username = textfield_username.getText();

        if (register_v2.validateUsername(username)) {
            label_status_username.setText("valid username");
            label_status_username.setStyle("-fx-text-fill: green;");
        } else {
            label_status_username.setText("invalid username");
            label_status_username.setStyle("-fx-text-fill: red;");
        }

    }

}
