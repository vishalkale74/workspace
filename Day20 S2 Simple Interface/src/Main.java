import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String teamName ;
		int noOfMatches; 
		long totalRunsScored;
		int noOfWicketsTaken;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player name");
		name=sc.nextLine();
		System.out.println("Enter team name");
		teamName=sc.nextLine();
		System.out.println("Enter number of matches played");
		noOfMatches=sc.nextInt();
		System.out.println("Enter total runs scored");
		totalRunsScored=sc.nextLong();
		System.out.println("Enter number of wickets taken");
		noOfWicketsTaken=sc.nextInt();
		Player player=new Player(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
		player.displayPlayerStatistics();
		sc.close();
	}

}
