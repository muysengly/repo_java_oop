import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    private Button button_submit;

    @FXML
    private CheckBox checkbox_analog;

    @FXML
    private CheckBox checkbox_micro_con;

    @FXML
    private CheckBox checkbox_programm;

    @FXML
    private DatePicker datepicker_dob;

    @FXML
    private ToggleGroup group_dpt;

    @FXML
    private Label label_status;

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

            boolean is_valid_name = !textfield_name.getText().isEmpty();
            boolean is_valid_dob = datepicker_dob.getValue() != null;
            boolean is_valid_dpt = radiobutton_gtr.isSelected() ||
                    radiobutton_gic.isSelected() ||
                    radiobutton_gee.isSelected();
            boolean is_valid_course = checkbox_analog.isSelected() ||
                    checkbox_micro_con.isSelected() ||
                    checkbox_programm.isSelected();

            if (is_valid_name && is_valid_dob && is_valid_dpt && is_valid_course) {

                String str_name = textfield_name.getText();
                String str_dob = datepicker_dob.getValue().toString();

                String str_dpt = "";
                if (radiobutton_gtr.isSelected()) {
                    str_dpt = "Department of GTR";
                } else if (radiobutton_gic.isSelected()) {
                    str_dpt = "Department of GIC";
                } else if (radiobutton_gee.isSelected()) {
                    str_dpt = "Department of GEE";
                }

                String str_course = "";
                if (checkbox_analog.isSelected()) {
                    str_course += "Analog\n";
                }
                if (checkbox_micro_con.isSelected()) {
                    str_course += "Microcontroller\n";
                }
                if (checkbox_programm.isSelected()) {
                    str_course += "Programming\n";
                }

                String content = "Name: " + str_name + "\n" +
                        "Date of Birth: " + str_dob + "\n" +
                        str_dpt + "\n" +
                        "Courses: \n" + str_course;

                try {
                    String str = "result.txt";
                    FileWriter writer = new FileWriter(str);
                    writer.write(content);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                label_status.setText("Thank you!!!");
            } else {
                label_status.setText("Please input!!!");
            }

        });

    }

}
