import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {

	public static void displayDate(int c,int d) throws ParseException
	{
		String a=""+c;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		Date s1=sdf.parse(a);
		//SimpleDateFormat sdf1=new SimpleDateFormat("DD");
		//Date s2=sdf1.parse(b);
		Calendar cal = new GregorianCalendar();
		cal.setTime(s1);
		cal.add(Calendar.DAY_OF_MONTH, d-1);
		Date s2=cal.getTime();
		SimpleDateFormat sdf12=new SimpleDateFormat("yyyy-MM-dd");
		String s=sdf12.format(s2);
		System.out.println(d+"th day of "+c+" : "+s);
	}
}
