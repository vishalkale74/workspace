import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class UserMainCode {

       public void displayDay(String a,String b) throws ParseException {
             	int day;
                SimpleDateFormat sdf = new SimpleDateFormat(a);
                Date d=new Date();
                d=sdf.parse(b);
                Calendar cal = new GregorianCalendar();
                cal.setTime(d); 
                int year = cal.get(Calendar.YEAR);
                System.out.println("Day of year : "+cal.get(Calendar.DAY_OF_YEAR));
       }

}
