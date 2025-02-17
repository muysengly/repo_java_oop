import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        // Create a default calendar
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println("\nCurrent Date and Time:" + cal.getTime());
        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);

        System.out.println("Actual Maximum Year: " + actualMaxYear);
        System.out.println("Actual Maximum Month: " + actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: " + actualMaxWeek);
        System.out.println("Actual Maximum Date: " + actualMaxDate + "\n");
        System.out.println();

    }
}
