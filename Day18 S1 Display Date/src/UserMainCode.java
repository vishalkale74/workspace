import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {

	public static void displayDate(String date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date(date)));
	}
}
