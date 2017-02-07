import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class UserMainCode {

       public void displayDateDetails(String a,String b) throws ParseException {
              int day;
                SimpleDateFormat sdf = new SimpleDateFormat(a);
                Date d=new Date();
                d=sdf.parse(b);
                Calendar cal = new GregorianCalendar();
                cal.setTime(d); 
               // day=cal.get(Calendar.YEAR);
                cal.add(Calendar.YEAR, 1);
                Date nextYear = cal.getTime();
                Date lastYear = cal.getTime();
                System.out.println(sdf.format(cal.getTime()));
                cal.add(Calendar.YEAR, -2);
                System.out.println(sdf.format(cal.getTime()));
               
       }

}
