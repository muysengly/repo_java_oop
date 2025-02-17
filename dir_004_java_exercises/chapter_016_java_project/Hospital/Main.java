
import java.time.LocalDateTime;

public class Main {
    public static void main(String args[]) {
        Clinic c1 = new Clinic("Surgery", "A. Dobbs");
        Clinic c2 = new Clinic("Cardiology", "B. Smith");
        Clinic c3 = new Clinic("Orthopedics", "C. Stubbs");

        Patient p1 = new Patient("John", "Doe", 1970, c1, "303");
        Patient p2 = new Patient("Jane", "Doe", 1985, c2, "306");
        Patient p3 = new Patient("Jimmy", "Doe", 1956, c2, "306");

        p1.insertMeasurement(new Measurement(37.5,
                LocalDateTime.of(2023, 1, 1, 0, 0, 0)));
        p1.insertMeasurement(new Measurement(38.1,
                LocalDateTime.of(2023, 1, 1, 6, 0, 0)));
        p1.insertMeasurement(new Measurement(37.9,
                LocalDateTime.of(2023, 1, 1, 9, 0, 0)));

        p2.insertMeasurement(new Measurement(36.5,
                LocalDateTime.of(2023, 1, 1, 0, 0, 0)));
        p2.insertMeasurement(new Measurement(38.0,
                LocalDateTime.of(2023, 1, 1, 6, 0, 0)));

        p3.insertMeasurement(new Measurement(39.5,
                LocalDateTime.of(2023, 1, 1, 0, 0, 0)));
        p3.insertMeasurement(new Measurement(39.1,
                LocalDateTime.of(2023, 1, 1, 6, 0, 0)));

        p3.setClinic(c3);
        c1.setDirector("D. Jones");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
