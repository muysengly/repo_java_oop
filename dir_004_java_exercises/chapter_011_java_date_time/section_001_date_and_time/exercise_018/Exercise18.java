import java.time.*;
import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("This year is Leap year");
        } else {
            System.out.println("This year is not a Leap year");
        }
    }
}
