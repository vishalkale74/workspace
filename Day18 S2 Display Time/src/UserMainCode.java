import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class UserMainCode {

       public static void displayTime(String a,String b) throws ParseException 
       {
              
                SimpleDateFormat sdf = new SimpleDateFormat(a);
                Date d;
                d=sdf.parse(b);
                Calendar cal = Calendar.getInstance();
                cal.setTime(d); 
                cal.add(Calendar.HOUR_OF_DAY, 2);
                System.out.println(sdf.format(cal.getTime()));
             }

}
