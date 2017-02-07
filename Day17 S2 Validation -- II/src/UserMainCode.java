
public class UserMainCode {
	public static boolean validateTeam(String string)
	{
		int flag=0,flag1=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='-')
				flag++;
		}
		if(flag!=1)
			return false;
		else
		{
			String[] teamName=string.split("-");
			String full_name=teamName[0];
			String short_name=teamName[1];
			int sl=short_name.length();
			String[] partsName=full_name.split(" ");
			String[] parts=new String[partsName.length];
			for(int i=0;i<partsName.length;i++)
			{
				parts[i]=partsName[i];			
			}
			if(sl==partsName.length)
			{
			for(int i=0;i<partsName.length;i++)
			{
				if(parts[i].charAt(0)==short_name.charAt(i))
					flag1=1;
			}
			}
			else
				return false;
			if(flag1==1)
					return true;
				else
					return false;
		}
	}
}
