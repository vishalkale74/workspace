import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of players");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player names");
		String[] name=new String[n];
		for(int i=0;i<n;i++)
		{
			name[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			if(name[i].contains("Sharma"))
				System.out.println(name[i]);
		}
	}

}
