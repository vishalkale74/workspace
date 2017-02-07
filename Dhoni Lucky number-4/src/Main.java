import java.util.*;
public class Main {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int i,even=0,odd=0;
	int n,m;
	for(i=a;i<=b;i++)
	{
		n=i;
		even=0;
		odd=0;
		while(n>0)
		{
			m=n%10;
			if((m==2) || (m==4) || (m==6) || (m==8))
				even++;
			else if((m==1) || (m==3) || (m==5) || (m==7) || (m==9))
				odd++;
			n=n/10;
		}
		if(even==2 && odd==2)
			System.out.print(i+" ");
		}  
	sc.close();
	}
}