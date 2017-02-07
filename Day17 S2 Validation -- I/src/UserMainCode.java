
public class UserMainCode {
	public static boolean validateDate(String string)
	{
		int flag=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='-')
				flag++;
		}
		if(flag!=2)
			return false;
		else
		{
			String[] news=string.split("-");
			int days=Integer.parseInt(news[0]);
			int months=Integer.parseInt(news[1]);
			if(days<=31 && months<=12)
				return true;
			else
				return false;
		}
	}
}
