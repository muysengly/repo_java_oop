
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;

public class Patient {
    private String name;
    private String surname;
    private int yearOfBirth;
    private Clinic clinic;
    private String room;
    private ArrayList<Measurement> pm;

    public Patient(String _name, String _surname, int _yearOfBirth, Clinic _clinic, String _room) {
        name = _name;
        surname = _surname;
        yearOfBirth = _yearOfBirth;
        clinic = _clinic;
        room = _room;
        pm = new ArrayList<>();
    }

    public Patient() {
        name = "N/A";
        surname = "N/A";
        yearOfBirth = 0;
        clinic = null;
        room = "N/A";
        pm = new ArrayList<>();
    }

    public void setClinic(Clinic _clinic) {
        clinic = _clinic;
    }

    public void insertMeasurement(Measurement m) {
        pm.add(m);
    }

    public void insertMeasurement(double _temp, LocalDateTime _date) {
        Measurement m = new Measurement(_temp, _date);
        pm.add(m);
    }

    public double maxTemp() {
        double maxt = 0.0;
        for (Measurement m : pm) {
            if (m.getTemp() > maxt)
                maxt = m.getTemp();
        }

        return maxt;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", clinic=" + clinic +
                ", room='" + room + '\'' +
                ", pm=" + pm +
                '}';
    }

    public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }

}
