import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int x=sc.nextInt();
		int r=x-d;
		if(r>=(s1+s2+s3))
			System.out.println("3");
		else if(r>=(s1+s2) || r>=(s1+s3) || r>=(s2+s3))
			System.out.println("2");
		else if(r>=s1 || r>=s2 || r>s3)
			System.out.println("1");
		else 
			System.out.println("0");
		sc.close();
	}

}
