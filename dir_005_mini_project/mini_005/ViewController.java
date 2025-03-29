import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

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
    private PasswordField passwordfield_date_of_birth;

    @FXML
    private RadioButton radiobutton_ams;

    @FXML
    private RadioButton radiobutton_eee;

    @FXML
    private RadioButton radiobutton_tn;

    @FXML
    private TextField textfield_name;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_save.setOnAction(event -> {

            // collect name from textfield
            String name = "Name: ";
            if (!textfield_name.getText().isEmpty()) {
                name = name + textfield_name.getText();
            } else {
                name = name + "N/A";
            }

            // collect date of birth from passwordfield
            String dob = "Date of Birth: ";
            if (!passwordfield_date_of_birth.getText().isEmpty()) {
                dob = dob + passwordfield_date_of_birth.getText();
            } else {
                dob = dob + "N/A";
            }

            // collect department from radiobutton
            String department = "Department: ";
            if (radiobutton_ams.isSelected()) {
                department = department + "Department of AMS";
            } else if (radiobutton_eee.isSelected()) {
                department = department + "Department of EEE";
            } else if (radiobutton_tn.isSelected()) {
                department = department + "Department of TN";
            } else {
                department = department + "N/A";
            }

            // collect courses from checkbox
            String courses = "Favourite Courses:";
            if (checkbox_object_oriented_programming.isSelected()) {
                courses = courses + "\n\t - Object Oriented Programming";
            } else if (checkbox_microcontroller_and_sensor.isSelected()) {
                courses = courses + "\n\t - Microcontroller and Sensor";
            } else if (checkbox_filter_design.isSelected()) {
                courses = courses + "\n\t - Filter Design";
            } else {
                courses = courses + "N/A";
            }

            // make content
            String content = name + "\n" + dob + "\n" + department + "\n" + courses;

            // make file name
            String file_name = textfield_name.getText()
                    + "_"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"))
                    + ".txt";

            // write content to file and save it
            try {
                FileWriter fileWriter = new FileWriter(file_name);
                fileWriter.write(content);
                fileWriter.close();
                label_status.setText("Saved.");
            } catch (IOException e) {
            }

        });
    }

}
