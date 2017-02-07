import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String coach;
		String location; 
		String players;
		String captain;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team details");
		name=sc.nextLine();
		String name1[]=name.split("#");
		name=name1[0];
		coach=name1[1];
		location=name1[2];
		players=name1[3];
		captain=name1[4];
		Team team=new Team();
		team.setName(name);
		team.setCoach(coach);
		team.setLocation(location);
		team.setPlayers(players);
		team.setCaptain(captain);
		System.out.println("Team : "+team.getName());
		System.out.println("Coach : "+team.getCoach());
		System.out.println("Location : "+team.getLocation());
		System.out.println("Players : "+team.getPlayers());
		System.out.println("Captain : "+team.getCaptain());
	}

}
