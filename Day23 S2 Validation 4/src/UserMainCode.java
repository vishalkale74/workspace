public class UserMainCode {

	public static boolean validatePlayer(String name,String name1)
	{
		int flag=0;
		if(name.length()==name.length())
		{
			for(int i=0;i<name.length();i++)
			{
				int value=Character.getNumericValue(name.charAt(i));
				int value1=Character.getNumericValue(name1.charAt(i));
				if(value1==(value+1))
					flag++;
			}
		}
		if(flag==name.length())
		{
			System.out.println("Valid");
			return true;
		}
		else
		{
			System.out.println("Invalid");
			return false;
		}
	}
}  