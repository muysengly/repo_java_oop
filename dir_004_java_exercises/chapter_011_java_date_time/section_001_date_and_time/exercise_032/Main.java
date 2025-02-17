//MIT License: https://bit.ly/35gZLa3
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LocalDate start_Local_date = LocalDate.of(1985, 06, 4);
        LocalDate end_Local_date = LocalDate.now();

        long years = ChronoUnit.YEARS.between(start_Local_date, end_Local_date);
        System.out.println("Age in years: "+years + "y ");

        Period period_Between = Period.between(start_Local_date, end_Local_date);
        System.out.println("Age in years/months/dates: "+period_Between.getYears() + "y "
                + period_Between.getMonths() + "m "
                + period_Between.getDays() + "d");
    }
}

