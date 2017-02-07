 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
	
	public static void displayDateTime(String a) throws Exception
	{
		Date d;
	SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	d=sd1.parse(a);
	SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy, H:mm:ss");
	System.out.println(sd.format(d)); 

}
} 
