import java.util.*;
public class Main {
	public static void main(String args[])
	{ 
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int c=a.nextInt();
		int flag;
		if(b==1)
		{
			b=b+1;
		}
		while(b<c)
		{
		 flag=0;
			for(int i=2;i<=b/2;++i)
			{
				if(b%i==0)
				{
					flag=1;
					break; 
				}
			}
			if(flag==0)
			{
				System.out.print(b+" ");
			}
			++b; 	
		}
		a.close();
	}
}
