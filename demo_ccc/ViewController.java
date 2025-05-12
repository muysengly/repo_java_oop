import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ViewController implements Initializable {

    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_save;

    @FXML
    private Button button_update;

    @FXML
    private Label label_status;

    @FXML
    private ListView<String> listview_data;

    @FXML
    private TextField textfield_input;

    @FXML
    void button_add_action(ActionEvent event) {

        String input = textfield_input.getText();
        listview_data.getItems().add(input);

    }

    @FXML
    void button_delete_action(ActionEvent event) {

        int index = listview_data.getSelectionModel().getSelectedIndex();
        listview_data.getItems().remove(index);

    }

    @FXML
    void button_save_action(ActionEvent event) {

        List<String> data = listview_data.getItems();

        try {

            Files.write(Paths.get("data.csv"), data);

        } catch (Exception e) {
        }

    }

    @FXML
    void button_update_action(ActionEvent event) {

        String input = textfield_input.getText();
        int index = listview_data.getSelectionModel().getSelectedIndex();
        listview_data.getItems().set(index, input);

    }

    @FXML
    void listview_data_click(MouseEvent event) {

        if (event.getClickCount() == 2) {

            String data = listview_data.getSelectionModel().getSelectedItem();
            textfield_input.setText(data);

        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {

            List<String> data = Files.readAllLines(Paths.get("data.csv"));
            listview_data.getItems().addAll(data);

        } catch (Exception e) {
        }
    }

}
