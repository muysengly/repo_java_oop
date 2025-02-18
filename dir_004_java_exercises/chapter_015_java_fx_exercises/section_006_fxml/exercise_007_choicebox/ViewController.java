import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class ViewController {

    @FXML
    private ChoiceBox<String> choicebox_001;

    @FXML
    private void initialize() {
        choicebox_001.getItems().addAll("Option 1", "Option 2", "Option 3");
        choicebox_001.getSelectionModel().selectFirst();

        choicebox_001.setOnAction((e) -> {
            System.out.println("Selected option: " + choicebox_001.getValue());
        });
    }

}
