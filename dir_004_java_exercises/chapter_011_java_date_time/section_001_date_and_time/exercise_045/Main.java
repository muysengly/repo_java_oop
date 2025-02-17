import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Main {
public static void main(String[] args) {
              String result;
       //yyyy-MM-dd   
       LocalDate localDate = LocalDate.now();
       DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       result = formatterLocalDate.format(localDate);
       System.out.println("\nyyyy-MM-dd: " + result);       
       // HH:mm:ss
       LocalTime localTime = LocalTime.now();
       DateTimeFormatter formatterLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
       result = formatterLocalTime.format(localTime);
                       System.out.println("\nHH:mm:ss: " + result);
       // yyyy-MM-dd HH:mm:ss
       LocalDateTime localDateTime = LocalDateTime.now();
       DateTimeFormatter formatterLocalDateTime =
               DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       result = formatterLocalDateTime.format(localDateTime);
                       System.out.println("\nyyyy-MM-dd HH:mm:ss: " + result);
       // E MMM yyyy HH:mm:ss.SSSZ
       ZonedDateTime zonedDateTime = ZonedDateTime.now();
       DateTimeFormatter formatterZonedDateTime =
               DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
       result = formatterZonedDateTime.format(zonedDateTime);
                       System.out.println("\nE MMM yyyy HH:mm:ss.SSSZ: " + result);
       // HH:mm:ss,Z
       OffsetTime offsetTime = OffsetTime.now();
       DateTimeFormatter formatterOffsetTime =
               DateTimeFormatter.ofPattern("HH:mm:ss,Z");
       result = formatterOffsetTime.format(offsetTime);
                       System.out.println("\nHH:mm:ss,Z: " + result);       
      }
}
