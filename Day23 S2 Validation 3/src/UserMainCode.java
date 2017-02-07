public class UserMainCode {

	public static boolean validateTeam(String name)
	{
		int even=0,odd=0;
		for(int i=0;i<name.length();i++)
		{
			if(i%2!=0)
			{
				if((name.charAt(i) == 'a')||(name.charAt(i) == 'e')||(name.charAt(i) == 'i')||(name.charAt(i) == 'o')||(name.charAt(i) == 'u')) 
					even++;
			}
			else
			{
				if((name.charAt(i) == 'a')||(name.charAt(i) == 'e')||(name.charAt(i) == 'i')||(name.charAt(i) == 'o')||(name.charAt(i) == 'u')) 
					odd++;
			}
        }
		if(even>odd)
		{
			System.out.println("Lucky");
			return true;
		}
		else
		{
			System.out.println("Unlucky");
			return false;
		}
	}
}  