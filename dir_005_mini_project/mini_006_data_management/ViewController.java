import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private Label label_status;

    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_save;

    @FXML
    private Button button_update;

    @FXML
    private ListView<String> listview_dataview;

    @FXML
    private TextField textfield_input;

    @FXML
    void button_add_(ActionEvent event) {

        String inputText = textfield_input.getText();

        if (!inputText.isEmpty()) {
            listview_dataview.getItems().add(inputText);
            textfield_input.clear();
        }

        label_status.setText("Data Added");

    }

    @FXML
    void button_delete_(ActionEvent event) {

        String selectedItem = listview_dataview.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            listview_dataview.getItems().remove(selectedItem);
            textfield_input.clear();
        }

        button_add.setDisable(false);
        button_update.setDisable(true);
        button_delete.setDisable(true);
        listview_dataview.setDisable(false);

        label_status.setText("Data Deleted");

    }

    @FXML
    void button_save_(ActionEvent event) {

        try {
            List<String> lines = listview_dataview.getItems();
            Files.write(Paths.get("data.csv"), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        label_status.setText("Data Saved");
    }

    @FXML
    void button_update_(ActionEvent event) {

        String selectedItem = listview_dataview.getSelectionModel().getSelectedItem();
        String inputText = textfield_input.getText();

        if (selectedItem != null && !inputText.isEmpty()) {
            int index = listview_dataview.getItems().indexOf(selectedItem);
            listview_dataview.getItems().set(index, inputText);
            textfield_input.clear();
        }

        button_add.setDisable(false);
        button_update.setDisable(true);
        button_delete.setDisable(true);
        listview_dataview.setDisable(false);

        label_status.setText("Data Updated");

    }

    @FXML
    void listview_dataview_(MouseEvent event) {

        if (event.getClickCount() == 2) {

            String selectedItem = listview_dataview.getSelectionModel().getSelectedItem();

            if (selectedItem != null) {
                textfield_input.setText(selectedItem);
            }

            button_add.setDisable(true);
            button_update.setDisable(false);
            button_delete.setDisable(false);

            listview_dataview.setDisable(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        button_update.setDisable(true);
        button_delete.setDisable(true);

        try {
            List<String> lines = Files.readAllLines(Paths.get("data.csv"));
            ObservableList<String> items = FXCollections.observableArrayList(lines);
            listview_dataview.setItems(items);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
