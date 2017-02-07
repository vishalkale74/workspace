import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;
		int n=sc.nextInt();
		sc.nextLine();
		String a=sc.nextLine();
		char[] b=a.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)=='D')
			{
				y=y-1;
			}
			else if(a.charAt(i)=='U')
			{
				y=y+1;
			}
			else if(a.charAt(i)=='L')
			{
				x=x-1;
			}
			else if(a.charAt(i)=='R')
			{
				x=x+1;
			}
		}
		System.out.println(x+" "+y);
	}

}
