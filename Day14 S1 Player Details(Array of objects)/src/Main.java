import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String	name;
		String	country;
		String	skill;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		Player[] player=new Player[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the player name");
			name=sc.nextLine();		
			System.out.println("Enter the country name");
			country=sc.nextLine();
			System.out.println("Enter the skill");
			skill=sc.nextLine();
			player[i]=new Player(name,country,skill);	
		}

		PlayerBO playerBO=new PlayerBO();
		playerBO.displayAllPlayerDetails(player);

	}

}
