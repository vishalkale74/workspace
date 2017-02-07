import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {

	public static void displayDate(String a) throws Exception
	{
	        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
	        Date dt=sd.parse(a);
	        Calendar cal= Calendar.getInstance();
	        cal.setTime(dt);
	        cal.add(Calendar.MONTH, 20);
	        Date d=(cal.getTime());
	    System.out.println("20 months after "+a+" will be "+sd.format(d));
	} 
}
