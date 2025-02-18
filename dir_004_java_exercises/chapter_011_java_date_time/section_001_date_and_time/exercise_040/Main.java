import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate l_date = LocalDate.now();
        System.out.println("Current date: " + l_date);

        LocalTime l_time = LocalTime.now();
        System.out.println("Current time: " + l_time);
    }
}
