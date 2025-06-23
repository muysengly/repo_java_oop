import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import my_class_aaa.MyDictionary;

public class ApplicationController implements Initializable {

    @FXML
    private Button button_logout;

    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_update;

    @FXML
    private ListView<String> listview_en_word;

    @FXML
    private TextArea textarea_kh_translate;

    @FXML
    private TextField textfield_add_word;

    @FXML
    private TextField textfield_search;

    @FXML
    void button_logout_action(ActionEvent event) {

        try {

            Stage stage = (Stage) button_logout.getScene().getWindow();

            Scene scene = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @FXML
    void button_add_action(ActionEvent event) {

        String word = textfield_add_word.getText().trim();

        if (!word.isEmpty()) {
            md.addWord(word, "អត់មាន");
        }

        listview_en_word.getItems().clear();
        for (String[] row : md.en_kh) {
            listview_en_word.getItems().add(row[0]);
        }

    }

    @FXML
    void button_delete_action(ActionEvent event) {

        String word = listview_en_word.getSelectionModel().getSelectedItem();

        int index = 0;

        if (word != null) {

            for (int i = 0; i < md.en_kh.length; i++) {
                if (md.en_kh[i][0].equals(word)) {
                    md.deleteWord(i);
                    index = i;
                    break;
                }
            }

            listview_en_word.getItems().remove(word);
            textarea_kh_translate.clear();
        }

    }

    @FXML
    void button_update_action(ActionEvent event) {

    }

    // MyDictionary md = new MyDictionary();

    MyDictionary md;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            FileInputStream fis = new FileInputStream("dictionary.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            md = (MyDictionary) ois.readObject();

            ois.close();
            fis.close();
        } catch (Exception e) {
        }

        String[][] en_kh = md.en_kh;
        for (String[] row : en_kh) {
            listview_en_word.getItems().add(row[0]);
        }

        textfield_search.textProperty().addListener((observable, oldValue, newValue) -> {

            listview_en_word.getItems().clear();

            String[][] result = md.searchWord(newValue);
            for (String[] row : result) {
                listview_en_word.getItems().add(row[0]);
            }

        });

        listview_en_word.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            for (String[] row : md.en_kh) {
                if (row[0].equals(newValue)) {
                    textarea_kh_translate.setText(row[1]);
                    break;
                }
            }
        });

        textarea_kh_translate.setWrapText(true);

        Platform.runLater(() -> {

            button_logout.getScene().getWindow().setOnCloseRequest(event -> {

                try {

                    FileOutputStream fos = new FileOutputStream("dictionary.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    oos.writeObject(md);

                    oos.close();
                    fos.close();

                } catch (Exception e) {
                }

            });

        });

    }

}
