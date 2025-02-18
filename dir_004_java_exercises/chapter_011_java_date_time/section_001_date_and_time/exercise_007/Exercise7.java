import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        // Gets a calendar using the default time zone and locale.
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
    }
}
