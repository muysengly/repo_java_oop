import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ApplicationController {

    @FXML
    private Button button_logout;

    @FXML
    void button_logout_action(ActionEvent event) {

        try {

            Stage stage = (Stage) button_logout.getScene().getWindow();

            Scene scene = FXMLLoader.load(getClass().getResource("./LoginView.fxml"));
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {

        }

    }

}
