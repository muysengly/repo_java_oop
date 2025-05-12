import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

public class ViewController implements Initializable {

    @FXML
    private Button button_save;

    @FXML
    private CheckBox checkbox_filter_design;

    @FXML
    private CheckBox checkbox_microcontroller_and_sensor;

    @FXML
    private CheckBox checkbox_object_oriented_programming;

    @FXML
    private Label label_status;

    @FXML
    private RadioButton radiobutton_ams;

    @FXML
    private RadioButton radiobutton_eee;

    @FXML
    private RadioButton radiobutton_tn;

    @FXML
    private TextField textfield_name;

    @FXML
    private DatePicker datepicker_dob;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_save.setOnAction(event -> {

            if (!textfield_name.getText().isEmpty() &&
                    !datepicker_dob.getEditor().getText().isEmpty() &&
                    (radiobutton_ams.isSelected() ||
                            radiobutton_eee.isSelected() ||
                            radiobutton_tn.isSelected())
                    &&
                    (checkbox_object_oriented_programming.isSelected() ||
                            checkbox_microcontroller_and_sensor.isSelected() ||
                            checkbox_filter_design.isSelected())) {

                String name = "Name: " + textfield_name.getText();
                String dob = "Date of Birth: " + datepicker_dob.getEditor().getText();
                String department = "Department: ";
                if (radiobutton_ams.isSelected()) {
                    department = department + "Department of AMS";
                } else if (radiobutton_eee.isSelected()) {
                    department = department + "Department of EEE";
                } else if (radiobutton_tn.isSelected()) {
                    department = department + "Department of TN";
                }
                String courses = "Favourite Courses: ";
                if (checkbox_object_oriented_programming.isSelected()) {
                    courses = courses + "\n\t - Object Oriented Programming";
                }
                if (checkbox_microcontroller_and_sensor.isSelected()) {
                    courses = courses + "\n\t - Microcontroller and Sensor";
                }
                if (checkbox_filter_design.isSelected()) {
                    courses = courses + "\n\t - Filter Design";
                }
                String content = name + "\n" + dob + "\n" + department + "\n" + courses;
                String file_name = textfield_name.getText()
                        + "_"
                        + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"))
                        + ".txt";
                try {
                    FileWriter fileWriter = new FileWriter(file_name);
                    fileWriter.write(content);
                    fileWriter.close();
                    label_status.setText("Saved.");
                } catch (IOException e) {
                    label_status.setText("Error: " + e.getMessage());
                }

                label_status.setText("Thank you! 🙏");
                label_status.setStyle("-fx-text-fill: green;");

            }

            else {
                label_status.setText("Please fill the blanks. 🚫");
                label_status.setStyle("-fx-text-fill: red;");
            }

        });
    }

}
