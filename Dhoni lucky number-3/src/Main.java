import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i,j,sum=0;
		for(i=a;i<=b;i++)
		{
			sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum<i)
			{
				System.out.print(i+" ");
			}
		}  
		sc.close();
	}
}
