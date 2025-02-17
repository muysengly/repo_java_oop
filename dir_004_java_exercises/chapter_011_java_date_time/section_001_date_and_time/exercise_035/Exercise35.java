import java.util.*;
import java.text.*;

public class Exercise35 {
  public static void main(String[] args)
   {
    try {    
      String originalString = "2016-07-14 09:00:02";
      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
      String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
       System.out.println("\n"+newstr+"\n");
      } 
    catch (ParseException e) {
    //Handle exception here
     e.printStackTrace();
     }
    }
}
