import java.util.*;
public class Exercise34 {
   public static void main(String[] args)
    {
      Calendar cal = new GregorianCalendar();
      cal.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
      cal.set(Calendar.MINUTE, 0);
      cal.set(Calendar.SECOND, 0);
      System.out.println("\n"+cal.getTime()+"\n");
    
    }
}
