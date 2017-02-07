
public class UserMainCode {
	public static boolean validateTeam(String string)
	{
		int flag=0,flag1=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='@')
				flag++;
			if(string.charAt(i)=='*')
				flag1++;
		}
		if(flag!=1 && flag1!=2)
			return false;
		else
		{
			String[] teamName=string.split("@");
			String team=teamName[0];
			String venue_name=teamName[1];
			String[] loc=venue_name.split("*");
			String location=loc[0];
			String captain=loc[1];
			//String extra=loc[2];
			if(Character.isUpperCase(team.charAt(0)) && Character.isUpperCase(location.charAt(0)) && Character.isUpperCase(captain.charAt(0)))
				return true;
			else
				return false;
		}
	}
}
