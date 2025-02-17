
import java.time.LocalDateTime;

public class Measurement {
    private double temp;
    private LocalDateTime date;

    public Measurement(double _temp, LocalDateTime _date) {
        temp = _temp;
        date = _date;
    }

    public Measurement() {
        temp = 0;
        date = LocalDateTime.now();
    }

    public double getTemp() {
        return temp;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "temp=" + temp +
                ", date=" + date +
                '}';
    }
}
