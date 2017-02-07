import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {

       public void displayDate(String a, String b) throws ParseException {
              SimpleDateFormat sdf = new SimpleDateFormat(a);
        Date d=new Date();
        d=sdf.parse(b);
        Calendar cal = new GregorianCalendar();
        cal.setTime(d); 
       int  day=cal.get(Calendar.DAY_OF_WEEK);
       int e;
       if(day>6)
         e=day+6;
       else
          e=6-day;
        cal.add(Calendar.DATE, e);
        Date nextYear = cal.getTime();
        Date lastYear = cal.getTime();
        System.out.println("Next Friday: "+sdf.format(cal.getTime()));
        
        cal.add(Calendar.DATE, -7);
        System.out.println("Previous Friday: "+sdf.format(cal.getTime()));
       }

}
