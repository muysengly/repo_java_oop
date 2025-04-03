import java.io.FileWriter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ViewController {

    @FXML
    private ToggleGroup abc;

    @FXML
    private Button button_submit;

    @FXML
    private CheckBox checkbox_ana_cir;

    @FXML
    private CheckBox checkbox_mic_con;

    @FXML
    private CheckBox checkbox_prog;

    @FXML
    private DatePicker datepicker_dob;

    @FXML
    private Label label_staus;

    @FXML
    private RadioButton radiobutton_gee;

    @FXML
    private RadioButton radiobutton_gic;

    @FXML
    private RadioButton radiobutton_gtr;

    @FXML
    private TextField textfield_name;

    public void initialize() {
        button_submit.setOnAction(e -> {

            // validation

            boolean is_valid_name = !textfield_name.getText().isEmpty();
            boolean is_valid_dob = datepicker_dob.getValue() != null;
            boolean is_valid_dpt = radiobutton_gee.isSelected() ||
                    radiobutton_gic.isSelected() ||
                    radiobutton_gtr.isSelected();

            if (is_valid_name && is_valid_dob && is_valid_dpt) {
                label_staus.setText("Thank!");

                String name;
                String dob;
                String dpt = "";
                String favorite = "";

                name = textfield_name.getText();
                dob = datepicker_dob.getValue().toString();

                if (radiobutton_gee.isSelected()) {
                    dpt = "GEE";
                } else if (radiobutton_gic.isSelected()) {
                    dpt = "GIC";
                } else if (radiobutton_gtr.isSelected()) {
                    dpt = "GTR";
                }

                if (checkbox_ana_cir.isSelected()) {
                    favorite = favorite + " - Analog Circuit \n";
                }
                if (checkbox_mic_con.isSelected()) {
                    favorite = favorite + " - Microcontroller \n";
                }
                if (checkbox_prog.isSelected()) {
                    favorite = favorite + " - Programming \n";
                }

                String content = "Name: " + name + "\n" +
                        "Date of Birth: " + dob + "\n" +
                        "Department: " + dpt + "\n" +
                        "Favorite: \n" + favorite;

                try {
                    FileWriter file_writer = new FileWriter("data.txt");
                    file_writer.write(content);
                    file_writer.close();
                } catch (Exception ex) {
                }

            } else {
                label_staus.setText("Please fill!");
            }

        });
    }
}
