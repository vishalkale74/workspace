public class UserMainCode {

	public static boolean validatePlayer(String name,String lname)
	{
		
		int flag=0,count=0;
		char ch[]=name.toCharArray();
		char ch1[]=lname.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
	 if(i%2!=0)
	 {
		 if(ch[i]=='*')
		 {
			 flag++;
		 }
			 
	 }
 }
	
for(int i=0;i<ch1.length;i++)

{
if(i%2!=0)
{
	 if(ch1[i]=='#')
	 {
		 count++;
	 }
		 
}
}
if(flag==(ch.length/2) && count==(ch1.length/2))
{
	System.out.println("Valid");
	return true;
}

	else
		{System.out.println("Invalid");
		return false;}
}
}  