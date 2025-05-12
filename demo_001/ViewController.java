
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
    private TextField textfild_input_data;

    @FXML
    void button_add_action(ActionEvent event) {
        String input = textfild_input_data.getText();
        listview_data.getItems().add(input);
    }

    @FXML
    void button_delete_action(ActionEvent event) {
        String selected = listview_data.getSelectionModel().getSelectedItem();
        listview_data.getItems().remove(selected);
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
        String update = textfild_input_data.getText();
        int index = listview_data.getSelectionModel().getSelectedIndex();
        listview_data.getItems().set(index, update);
    }

    @FXML
    void listview_data_click(MouseEvent event) {

        if (event.getClickCount() == 2) {
            String selected = listview_data.getSelectionModel().getSelectedItem();
            textfild_input_data.setText(selected);
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
