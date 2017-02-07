
import java.util.*;
import java.text.*;
import java.time.*;
public class UserMainCode 
{
	public void displayDate(String a,String b) throws Exception
	{
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sd.parse(a);
		Date d2=sd.parse(b);
   
		LocalDate date1 = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		LocalDate date2 = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		Period p = Period.between(date1,date2);

		System.out.println("I am  "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old.");
	
	}

}
