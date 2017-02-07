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
                int year = cal.get(Calendar.DAY_OF_WEEK);
                String ans=null;
                switch(year){
                case 1:
                       ans="Sunday";
                       break;
                case 2:
                       ans="Monday";
                       break;
                case 3:
                       ans="Tuesday";
                       break;
                case 4:
                       ans="Wednesday";
                       break;
                case 5:
                       ans="Thursay";
                       break;
                case 6:
                       ans="Friday";
                       break;
                case 7:
                       ans="Saturday";
                       break;
                       
                }
                System.out.println(ans);

       }

}
