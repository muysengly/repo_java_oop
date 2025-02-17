import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class ViewController {

    @FXML
    private void initialize() {

        label.setText("Hello, JavaFX!");

        // set text to choicebox
        String[] items = { "Item 1", "Item 2", "Item 3" };
        choicebox.getItems().addAll(items);
        choicebox.setValue("Item 1");

        String[] items2 = { "Item 4", "Item 5", "Item 6" };
        combobox.getItems().addAll(items2);

    }

    @FXML
    private Button button;

    @FXML
    private CheckBox checkbok;

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private ColorPicker colorpick;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private DatePicker datepick;

    @FXML
    private ScrollBar hscroll;

    @FXML
    private Separator hsep;

    @FXML
    private Slider hslider;

    @FXML
    private Label label;

    @FXML
    private MenuBar menubar;

    @FXML
    private MenuButton menubutton;

    @FXML
    private PasswordField password;

    @FXML
    private ProgressBar progress;

    @FXML
    private ProgressIndicator proindicate;

    @FXML
    private RadioButton radio;

    @FXML
    private Spinner<?> spinner;

    @FXML
    private SplitMenuButton splitmenu;

    @FXML
    private TextArea textarea;

    @FXML
    private TextField textfield;

    @FXML
    private ToggleButton togglebutton;

    @FXML
    private ScrollBar vscroll;

    @FXML
    private Separator vsep;

    @FXML
    private Slider vslider;

}
