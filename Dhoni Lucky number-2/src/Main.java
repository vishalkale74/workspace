import java.util.*;
 
public class Main
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
     // int num=0;
      for (int i=a;i<b;i++)
		{
			while(a<=b)
			{
				int k=a;
				int rem=0;
				int rev=0;
				while(k>0)
				{
					rem=k%10;
					k=k/10;
					rev=(rev*10)+rem;
				}
				if(a==rev)
				{
					System.out.print(a+" ");
				}
				a=a+1;
			}
		} 
      sc.close();
   }
}
