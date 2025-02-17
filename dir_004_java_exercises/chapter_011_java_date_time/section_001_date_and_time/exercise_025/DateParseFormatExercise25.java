import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParseFormatExercise25 {

	public static void main(String[] args) {
	
	 //Current year	
	 Year yr = Year.now();
     //given year
     //Year yr = Year.of(2001);
     System.out.println("\nCurrent Year: " + yr);  
     boolean isLeap = yr.isLeap(); // false
     System.out.println("Is current year leap year? " + isLeap);  
     int length = yr.length(); // 365
     System.out.println("Length of the year: " + length+" days\n"); 
	}
}
