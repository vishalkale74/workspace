import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
       
       public static void   displayDateDetails(String s1,String s2) throws Exception {
              
              SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
              Date date1= sd.parse(s1);
              Date date2= sd.parse(s2);
              
              Calendar startCalendar = new GregorianCalendar();
              startCalendar.setTime(date1);
              Calendar endCalendar = new GregorianCalendar();
              endCalendar.setTime(date2);

              int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
              int diffMonth =endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
              int diffDay= endCalendar.get(Calendar.DAY_OF_MONTH)-startCalendar.get(Calendar.DAY_OF_MONTH);
              
              if(diffDay<0)
              {
                     diffMonth-=1;
              }
              
              if(diffYear<0)
              {
                     diffYear*=-1;
              }
              if(diffMonth<0)
              {
                     diffMonth*=-1;
              }
              System.out.println("Difference between "+s1+" and "+s2+": "+diffYear+" Years and "+diffMonth+" Months");

       }

}
