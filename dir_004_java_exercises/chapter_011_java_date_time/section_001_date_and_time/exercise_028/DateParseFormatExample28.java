import java.time.*;

public class DateParseFormatExample28 {

    public static void main(String[] args) {

        // Before 7 houres and 30 minutes
        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 7 hours and 30 minutes: " + dateTime + "\n");
    }

}
