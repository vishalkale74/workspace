public class UserMainCode {

	public static boolean validateTeam(String name,String lname)
	{
		
		int flag=0,count=0;
		char ch[]=name.toCharArray();
		char ch1[]=lname.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
				flag++;
		}
		for(int i=0;i<ch1.length;i++)
		{
			if(Character.isDigit(ch1[i]))
				count++;
		}
		//System.out.println(count);
		if(flag==0 && count==ch1.length)
		{
			System.out.println("Valid");
			return false;
		}
		else
		{
			System.out.println("Invalid");
			return true;
		}
	}
}  