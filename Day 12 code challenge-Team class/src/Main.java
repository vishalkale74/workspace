import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team details");
		String details=sc.nextLine();
		String details1[]=details.split("#");
		String	name=details1[0];
		String	coach=details1[1];
		String	home=details1[2];
		String	captain=details1[3];
		String	players=details1[4];
		Team team=new Team();
		team.setName(name);
		team.setCoach(coach);
		team.setHome(home);
		team.setPlayers(players);
		team.setCaptain(captain);
		System.out.println("Team Detail");
		System.out.println("Team : "+team.getName());
		System.out.println("Coach : "+team.getCoach());
		System.out.println("Home : "+team.getHome());
		System.out.println("Players : "+team.getPlayers());
		System.out.println("Captain : "+team.getCaptain());
	}

}
