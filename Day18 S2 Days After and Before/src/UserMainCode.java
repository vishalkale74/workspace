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
               // day=cal.get(Calendar.YEAR);
                cal.add(Calendar.DAY_OF_WEEK, -10);
                int year = cal.get(Calendar.DAY_OF_WEEK);
                SimpleDateFormat sd=new SimpleDateFormat("EEEE");
                System.out.println(sdf.format(cal.getTime()));
               System.out.println(sd.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_WEEK, 20);
                int year1 = cal.get(Calendar.DAY_OF_WEEK);
               System.out.println(sdf.format(cal.getTime()));
               System.out.println(sd.format(cal.getTime()));
               
       }

}
