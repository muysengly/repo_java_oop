//MIT License: https://bit.ly/35gZLa3

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

        System.out.println("\nConvert String to LocalDate:");
        LocalDate localDate = LocalDate.parse("2020-06-01");
        System.out.println("Convert LocalDate to String:");
        String localDateAsDefaultString = localDate.toString();
        System.out.println("LocalDate: " + localDateAsDefaultString + "( year: " + localDate.getYear()
                + ", month: " + localDate.getMonthValue() + ", day: " + localDate.getDayOfMonth() + " )");

        LocalTime localTime = LocalTime.parse("12:23:44");
        System.out.println("\nConvert LocalTime to String:");
        String localTimeAsDefaultString = localTime.toString();
        System.out.println("LocalTime: " + localTimeAsDefaultString + "( hour: " + localTime.getHour()
                + ", minute: " + localTime.getMinute() + ", second: " + localTime.getSecond() + " )");

        System.out.println("Convert String to LocalDateTime:");
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        System.out.println("Convert LocalDateTime to String:");
        String localDateTimeAsDefaultString = localDateTime.toString();
        System.out.println("LocalDateTime: " + localDateTimeAsDefaultString + "( year: " + localDateTime.getYear()
                + ", month: " + localDateTime.getMonthValue() + ", day: " + localDateTime.getDayOfMonth()
                + ", hour: " + localDateTime.getHour() + ", minute: " + localDateTime.getMinute()
                + ", second: " + localDateTime.getSecond() + " )");

        System.out.println("Convert String to OffsetDateTime:");
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        System.out.println("Convert OffsetDateTime to String:");
        String offsetDateTimeAsDefaultString = offsetDateTime.toString();
        System.out.println("OffsetDateTime: " + offsetDateTimeAsDefaultString + "( year: " + offsetDateTime.getYear()
                + ", month: " + offsetDateTime.getMonthValue() + ", day: " + offsetDateTime.getDayOfMonth()
                + ", hour: " + offsetDateTime.getHour() + ", minute: " + offsetDateTime.getMinute()
                + ", second: " + offsetDateTime.getSecond() + ", offset: " + offsetDateTime.getOffset() + " )");

        System.out.println("Convert String to OffsetTime:");
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        System.out.println("Convert OffsetTime to String:");
        String offsetTimeAsDefaultString = offsetTime.toString();
        System.out.println("OffsetTime: " + offsetTimeAsDefaultString
                + "( hour: " + offsetTime.getHour() + ", minute: " + offsetTime.getMinute()
                + ", second: " + offsetTime.getSecond() + ", offset: " + offsetTime.getOffset() + " )");

        System.out.println("Convert String to ZonedDateTime:");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");
        System.out.println("Convert ZonedDateTime to String:");
        String zonedDateTimeAsDefaultString = zonedDateTime.toString();
        System.out.println("ZonedDateTime: " + zonedDateTimeAsDefaultString + "( year: " + zonedDateTime.getYear()
                + ", month: " + zonedDateTime.getMonthValue() + ", day: " + zonedDateTime.getDayOfMonth()
                + ", hour: " + zonedDateTime.getHour() + ", minute: " + zonedDateTime.getMinute()
                + ", second: " + zonedDateTime.getSecond() + ", offset: " + zonedDateTime.getOffset()
                + ", zone: " + zonedDateTime.getZone() + " )");

        System.out.println("\nJava 8, convert with formatter:");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Convert String to LocalDate:");
        LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
        System.out.println("Convert LocalDate to String:");
        String localDateAsFormattedString = dateFormatter.format(localDateFormatted);
        System.out.println("Date: " + localDateAsFormattedString + "( year: " + localDateFormatted.getYear()
                + ", month: " + localDateFormatted.getMonthValue() + ", day: " + localDateFormatted.getDayOfMonth()
                + " )");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        System.out.println("Convert String to LocalTime:");
        LocalTime localTimeFormatted = LocalTime.parse("12|23|44", timeFormatter);
        System.out.println("Convert LocalTime to String:");
        String localTimeAsFormattedString = timeFormatter.format(localTimeFormatted);
        System.out.println("Time: " + localTimeAsFormattedString + "( hour: " + localTimeFormatted.getHour()
                + ", minute: " + localTimeFormatted.getMinute() + ", second: " + localTimeFormatted.getSecond() + " )");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        System.out.println("Convert String to LocalDateTime:");
        LocalDateTime localDateTimeFormatted = LocalDateTime.parse("01.06.2020, 11:20:15", dateTimeFormatter);
        System.out.println("Convert LocalDateTime to String:");
        String localDateTimeAsFormattedString = dateTimeFormatter.format(localDateTimeFormatted);
        System.out.println("DateTime: " + localDateTimeAsFormattedString + "( year: " + localDateTimeFormatted.getYear()
                + ", month: " + localDateTimeFormatted.getMonthValue() + ", day: "
                + localDateTimeFormatted.getDayOfMonth()
                + ", hour: " + localDateTimeFormatted.getHour() + ", minute: " + localDateTimeFormatted.getMinute()
                + ", second: " + localDateTimeFormatted.getSecond() + " )");

        DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss, XXXXX");
        System.out.println("Convert String to OffsetDateTime:");
        OffsetDateTime offsetDateTimeFormatted = OffsetDateTime.parse("2007.12.03, 10:15:30, +01:00",
                offsetDateTimeFormatter);
        System.out.println("Convert OffsetDateTime to String:");
        String offsetDateTimeAsFormattedString = offsetDateTimeFormatter.format(offsetDateTimeFormatted);
        System.out.println("OffsetDateTime: " + offsetDateTimeAsFormattedString + "( year: "
                + offsetDateTimeFormatted.getYear()
                + ", month: " + offsetDateTimeFormatted.getMonthValue() + ", day: "
                + offsetDateTimeFormatted.getDayOfMonth()
                + ", hour: " + offsetDateTimeFormatted.getHour() + ", minute: " + offsetDateTimeFormatted.getMinute()
                + ", second: " + offsetDateTimeFormatted.getSecond() + ", offset: "
                + offsetDateTimeFormatted.getOffset() + " )");

        DateTimeFormatter offsetTimeFormatter = DateTimeFormatter.ofPattern("HH mm ss XXXXX");
        System.out.println("Convert String to OffsetTime:");
        OffsetTime offsetTimeFormatted = OffsetTime.parse("10 15 30 +01:00", offsetTimeFormatter);
        System.out.println("Convert OffsetTime to String:");
        String offsetTimeAsFormattedString = offsetTimeFormatter.format(offsetTimeFormatted);
        System.out.println("OffsetTime: " + offsetTimeAsFormattedString
                + "( hour: " + offsetTimeFormatted.getHour() + ", minute: " + offsetTimeFormatted.getMinute()
                + ", second: " + offsetTimeFormatted.getSecond() + ", offset: " + offsetTimeFormatted.getOffset()
                + " )");

        DateTimeFormatter zonedDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'");
        // DateTimeFormatter zonedDateTimeFormatter
        // = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX
        // '['VV']'").withZone(ZoneId.of("Europe/Paris"));
        System.out.println("Convert String to ZonedDateTime:");
        ZonedDateTime zonedDateTimeFormatted = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]",
                zonedDateTimeFormatter);
        System.out.println("Convert ZonedDateTime to String:");
        String zonedDateTimeAsFormattedString = zonedDateTimeFormatted.format(zonedDateTimeFormatter);
        System.out.println("ZonedDateTime: " + zonedDateTimeAsFormattedString + "( year: "
                + zonedDateTimeFormatted.getYear()
                + ", month: " + zonedDateTimeFormatted.getMonthValue() + ", day: "
                + zonedDateTimeFormatted.getDayOfMonth()
                + ", hour: " + zonedDateTimeFormatted.getHour() + ", minute: " + zonedDateTimeFormatted.getMinute()
                + ", second: " + zonedDateTimeFormatted.getSecond() + ", offset: " + zonedDateTimeFormatted.getOffset()
                + ", zone: " + zonedDateTimeFormatted.getZone() + " )");
    }
}
