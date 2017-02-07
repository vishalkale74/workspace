import java.util.Scanner;
public class Main {
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int n1=n+1;
			if(n1%3==0)
				System.out.println("Yes");
			else
				System.out.println("No");
			sc.close();
		}
}
