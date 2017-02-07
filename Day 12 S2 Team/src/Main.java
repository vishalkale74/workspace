import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team name");
		String name=sc.nextLine();
		System.out.println("Enter the coach name");
		String coach=sc.nextLine();
		System.out.println("Enter the location name");
		String location=sc.nextLine();
		System.out.println("Enter the players name");
		String players=sc.nextLine();
		System.out.println("Enter the captain name");
		String captain=sc.nextLine();
		Team team=new Team();
		team.setName(name);
		team.setCoach(coach);
		team.setLocation(location);
		team.setPlayers(players);
		team.setCaptain(captain);
		team.displayTeamDetails();
	}

}
