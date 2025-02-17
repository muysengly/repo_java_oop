import java.util.*;
public class Exercise11 {
public static void main(String []args){
      Calendar cal = Calendar.getInstance();
      int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	   System.out.println();
       System.out.println("Number of days of the current month : " + days); 
	   System.out.println(); 
    }
}
