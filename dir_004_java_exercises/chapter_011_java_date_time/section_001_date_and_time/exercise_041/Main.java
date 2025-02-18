import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate local_Dt = LocalDate.now();
        String localDateAsString = local_Dt
                .format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
        System.out.println("Local Date: " + localDateAsString);
        LocalTime local_Time = LocalTime.now();
        String localTimeAsString = local_Time
                .format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println("Local Time: " + localTimeAsString);
        LocalDateTime localDateTime = LocalDateTime.of(local_Dt, local_Time);
        String localDateTimeAsString = localDateTime
                .format(DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss a"));
        System.out.println("\nCombine local Date Time: " + localDateTimeAsString);
    }
}
