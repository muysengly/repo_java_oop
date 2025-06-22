import java.io.File;
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
import javafx.stage.WindowEvent;

import my_class.MyDictionary;

public class ApplicationController implements Initializable {

    @FXML
    private Button button_logout;

    @FXML
    private ListView<String> listview_word;

    @FXML
    private TextArea textarea_translate;

    @FXML
    private TextField textfield_search;

    @FXML
    private Button button_add;

    @FXML
    private TextField textfield_add;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_update;

    @FXML
    void button_logout_action(ActionEvent event) {

        try {
            Stage stage = (Stage) button_logout.getScene().getWindow();
            Scene scene = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
        }

    }

    // MyDictionary md = new MyDictionary();
    MyDictionary md;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        textarea_translate.setWrapText(true);

        // Load dictionary from dictionary.ser if exists, otherwise create new
        try {
            File file = new File("dictionary.ser");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                md = (MyDictionary) ois.readObject();
                ois.close();
                fis.close();
            } else {
                md = new MyDictionary();
            }
        } catch (Exception e) {
            md = new MyDictionary();
        }

        // Populate ListView with words from the dictionary
        String[][] en_kh = md.en_kh;
        for (int i = 0; i < en_kh.length; i++) {
            listview_word.getItems().add(en_kh[i][0]);
        }

        // Set up listeners for ListView and TextField
        listview_word.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        for (String[] pair : md.en_kh) {
                            if (pair[0].equals(newValue)) {
                                textarea_translate.setText(pair[1]);
                                break;
                            }
                        }
                    } else {
                        textarea_translate.setText("");
                    }
                });

        // Search functionality for TextField
        textfield_search.textProperty().addListener((observable, oldValue, newValue) -> {
            listview_word.getItems().clear();
            if (newValue.isEmpty()) {
                for (String[] pair : md.en_kh) {
                    listview_word.getItems().add(pair[0]);
                }
            } else {
                String[][] results = md.searchWords(newValue);
                for (String[] pair : results) {
                    listview_word.getItems().add(pair[0]);
                }
            }
        });

        Platform.runLater(() -> {

            // Save dictionary when the close button is clicked
            button_logout.getScene().getWindow().addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, event -> {
                try {
                    FileOutputStream fos = new FileOutputStream("dictionary.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(md);
                    oos.close();
                    fos.close();
                } catch (Exception e) {
                    throw new RuntimeException("Error saving dictionary: " + e.getMessage());
                }

                System.out.println("Saved dictionary on window closed.");

            });

            // Save dictionary when the logout button is clicked
            button_logout.getScene().getWindow().sceneProperty().addListener((obs, oldScene, newScene) -> {
                try {
                    FileOutputStream fos = new FileOutputStream("dictionary.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(md);
                    oos.close();
                    fos.close();
                } catch (Exception e) {
                    throw new RuntimeException("Error saving dictionary: " + e.getMessage());
                }
                System.out.println("Saved dictionary on logout button clicked.");
            });
        });

    }

    @FXML
    void button_add_action(ActionEvent event) {

        // Validate the input from the textfield_add
        String newWord = textfield_add.getText().trim();
        if (newWord.isEmpty()) {
            throw new IllegalArgumentException("Word must not be empty");
        }

        // Check if the word already exists in the dictionary
        try {
            md.addData(newWord, "សូមបញ្ចូលពាក្យ"); // Add the new word with an empty translation
            listview_word.getItems().add(0, newWord); // Add the new word at the top of the ListView
            textfield_add.clear(); // Clear the input field
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Word already exists in the dictionary");
        }

    }

    @FXML
    void button_delete_action(ActionEvent event) {

        // Validate that a word is selected in the ListView
        String selectedWord = listview_word.getSelectionModel().getSelectedItem();
        if (selectedWord == null || selectedWord.isEmpty()) {
            throw new IllegalArgumentException("No word selected for deletion");
        }

        // Attempt to delete the selected word from the dictionary
        try {
            md.deleteData(selectedWord);
            listview_word.getItems().remove(selectedWord); // Update the ListView
            textarea_translate.clear(); // Clear the translation area
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error deleting word: " + e.getMessage());
        }

    }

    @FXML
    void button_update_action(ActionEvent event) {

        // Validate that a word is selected and a new translation is provided
        String selectedWord = listview_word.getSelectionModel().getSelectedItem();
        String newTranslation = textarea_translate.getText().trim();

        // Check if a word is selected and the new translation is not empty
        if (selectedWord == null || selectedWord.isEmpty()) {
            throw new IllegalArgumentException("No word selected for update");
        }

        // Check if the new translation is empty
        if (newTranslation.isEmpty()) {
            throw new IllegalArgumentException("Translation must not be empty");
        }

        // Attempt to update the translation in the dictionary
        try {
            md.updateTranslation(selectedWord, newTranslation);
            // Update the translation in the ListView
            for (String[] pair : md.en_kh) {
                if (pair[0].equals(selectedWord)) {
                    pair[1] = newTranslation;
                    break;
                }
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error updating translation: " + e.getMessage());
        }

    }

}
