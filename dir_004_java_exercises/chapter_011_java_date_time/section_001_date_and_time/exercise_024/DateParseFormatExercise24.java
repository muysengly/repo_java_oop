import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParseFormatExercise24 {

	public static void main(String[] args) {
		
		//Format examples
		LocalDate date = LocalDate.now();
		//default format
		System.out.println("\nDefault format of LocalDate="+date);
		//specific format
		System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

		LocalDateTime dateTime = LocalDateTime.now();
		//default format
		System.out.println("Default format of LocalDateTime="+dateTime);
		//specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
   		Instant timestamp = Instant.now();
		//default format
		System.out.println("Default format of Instant="+timestamp);
		
		//Parse examples
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = "+dt+"\n");
	}

}
