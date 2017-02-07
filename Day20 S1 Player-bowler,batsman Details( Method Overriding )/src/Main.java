import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		String teamName;
		long noOfMatches;
		long noOfWickets;
		long noOfRuns;
		System.out.println("Enter player name");
		name=sc.nextLine();
		System.out.println("Enter team name");
		teamName=sc.nextLine();
		System.out.println("Enter number of matches");
		noOfMatches=sc.nextLong();
		System.out.println("Menu\n1.Bowler details\n2.Batsman details\nEnter choice");
		switch(sc.nextInt())
		{
			case 1:
					System.out.println("Enter number of wicktes taken");
					noOfWickets=sc.nextLong();
					Bowler bowler=new Bowler(name, teamName, noOfMatches, noOfWickets);
					bowler.displayDetails();
					
				break;
			case 2: 
					System.out.println("Enter number of runs scored");
					noOfRuns=sc.nextLong();
					Batsman batsman=new Batsman(name, teamName, noOfMatches, noOfRuns);
					batsman.displayDetails();
				break;
		}
		sc.close();
	}

}
