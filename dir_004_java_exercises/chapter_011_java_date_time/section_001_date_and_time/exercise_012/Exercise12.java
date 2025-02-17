import java.util.*;
import java.time.*;
import java.text.*;

public class Exercise12 {

public static void main(String []args){

  // Localize in German
  
  DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
   // for the current Locale :
   //   DateFormatSymbols symbols = new DateFormatSymbols(); 
    String[] dayNames = symbols.getWeekdays();
    for (String s : dayNames) { 
    System.out.print(s + "\n");
	System.out.println();
    }
  }
}
