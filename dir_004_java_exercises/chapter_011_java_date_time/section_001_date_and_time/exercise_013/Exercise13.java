import java.util.*;
public class Exercise13 {
public static void main(String []args){
     // Create a default calendar
        Calendar cal = Calendar.getInstance();
    //Set your date: cal.setTime(yourDate);
	System.out.println();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek); 
	System.out.println();
    }
}
