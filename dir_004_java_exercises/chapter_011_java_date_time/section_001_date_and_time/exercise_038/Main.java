
//MIT License: https://bit.ly/35gZLa3
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nBefore JDK 8:");

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2019, 0, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, 2, 1);

        System.out.println("\nDate/Calendar case: " + cal1.getTime() + " <-> " + cal2.getTime());

        long inMs = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
        long inDays = Math.abs(TimeUnit.DAYS.convert(inMs, TimeUnit.MILLISECONDS));

        System.out.println("Difference in milliseconds is: " + inMs);
        System.out.println("Difference in days is: " + inDays);

        System.out.println("\nStarting with JDK 8:");

        LocalDate ld1 = LocalDate.of(2019, 1, 1);
        LocalDate ld2 = LocalDate.of(2020, 3, 1);

        System.out.println("\nLocalDate case: " + ld1 + " <-> " + ld2);

        long between_In_Days = Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
        long between_In_Months = Math.abs(ChronoUnit.MONTHS.between(ld1, ld2));
        long between_In_Years = Math.abs(ChronoUnit.YEARS.between(ld1, ld2));
        long until_In_Days = Math.abs(ld1.until(ld2, ChronoUnit.DAYS));
        long until_In_Months = Math.abs(ld1.until(ld2, ChronoUnit.MONTHS));
        long until_In_Years = Math.abs(ld1.until(ld2, ChronoUnit.YEARS));
        Period period = ld1.until(ld2);
        System.out.println("Difference as Period: "
                + period.getYears() + "y" + period.getMonths() + "m" + period.getDays() + "d");
        System.out.println("Difference in days is via between(): " + between_In_Days);
        System.out.println("Difference in months is via between(): " + between_In_Months);
        System.out.println("Difference in years is via between(): " + between_In_Years);
        System.out.println("Difference in days is via until(): " + until_In_Days);
        System.out.println("Difference in months is via until(): " + until_In_Months);
        System.out.println("Difference in years is via until(): " + until_In_Years);

        LocalDateTime ldt1 = LocalDateTime.of(2019, 1, 1, 22, 15, 15);
        LocalDateTime ldt2 = LocalDateTime.of(2020, 1, 1, 23, 15, 15);

        System.out.println("\nLocalDateTime case: " + ldt1 + " <-> " + ldt2);

        long betweenInMinutesWithoutZone = Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
        long untilInMinutesWithoutZone = Math.abs(ldt1.until(ldt2, ChronoUnit.HOURS));
        System.out.println("Difference in minutes without zone: " + betweenInMinutesWithoutZone);
        System.out.println("Difference in hours without zone: " + untilInMinutesWithoutZone);

        System.out.println("\nZonedDateTime case:");

        ZonedDateTime zdt1 = ldt1.atZone(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Australia/Perth")).plusHours(1);
        ZonedDateTime zdt3 = ldt2.atZone(ZoneId.of("Australia/Perth"));

        long betweenInMinutesWithZone12 = Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt2));
        long untilInHoursWithZone12 = Math.abs(zdt1.until(zdt2, ChronoUnit.HOURS));
        long betweenInMinutesWithZone13 = Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt3));
        long untilInHoursWithZone13 = Math.abs(zdt1.until(zdt3, ChronoUnit.HOURS));

        System.out.println("Europe/Bucharest: " + zdt1 + " <-> Australia/Perth: " + zdt2);
        System.out.println("Difference in minutes with zone (same instant): " + betweenInMinutesWithZone12);
        System.out.println("Difference in hours with zone (same instant): " + untilInHoursWithZone12);

        System.out.println("\nEurope/Bucharest: " + zdt1 + " <-> Australia/Perth: " + zdt3);
        System.out.println("Difference in minutes with zone (not same instant): " + betweenInMinutesWithZone13);
        System.out.println("Difference in hours with zone: " + untilInHoursWithZone13);
    }
}
