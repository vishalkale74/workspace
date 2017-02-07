import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		String[] name=new String[n];
		String a=null;
		System.out.println("Enter the player name");
		for(int i=0;i<n;i++)
		{
			name[i]=sc.nextLine();
		}
		System.out.println("Player name starting with 'M' or Ending with 'a'");
		for(int i=0;i<n;i++)
		{
			if(name[i].startsWith("M") || name[i].endsWith("a"))
			{
				a=name[i];
				System.out.println(a);
			}
		}
	}
}
