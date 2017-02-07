import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
String b=a.nextLine();
char []c=b.toCharArray();
int count=0,count1=0,count2=0;
for(int i=0;i<2;i++)
{
	if( (c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z'))
	{
		count1++;
	}
}
for(int i=2;i<c.length-2;i++)
{
	if(c[i]=='*')
	{
		count++;
	}
}
for(int i=c.length-2;i<c.length;i++)
{
	if( (c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z'))
	{
		count2++;
	}
}
int g=c.length-4;
if(count1==2 && count2==2)
{
	if(count==g)
	{
		System.out.println("Valid");
	}
}
else{
	System.out.println("Invalid");
}
	
	}

}
