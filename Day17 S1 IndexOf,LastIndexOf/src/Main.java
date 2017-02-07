import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		String a = null;
		System.out.println("Enter the number of players");
		n=sc.nextInt();
		sc.nextLine();
		String[] name=new String[n];
		for(int i=0;i<n;i++)
		{
		
			name[i]=sc.nextLine();
			if(name[i].indexOf('a')==name[i].lastIndexOf('a'))
			{
				a=name[i];
				
			}
		}
		System.out.println("Player of the Match:");
		System.out.println(a);
		/*for(int i=0;i<n;i++)
		{
			if(name[i].indexOf('a')==name[i].lastIndexOf('a'))
			{
				System.out.println("Player of the Match:");
				System.out.println(name[i]);
			}
		}*/
	}

}
