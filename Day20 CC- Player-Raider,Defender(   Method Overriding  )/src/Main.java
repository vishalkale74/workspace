import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		String teamName;
		String noOfMatches;
		String noOfRaids;
		String noOfRaidPoints;
		String  noOfDefencePoints;
		System.out.println("Enter player name");
		name=sc.nextLine();
		System.out.println("Enter team name");
		teamName=sc.nextLine();
		System.out.println("Enter number of matches");
		noOfMatches=sc.nextLine();
		System.out.println("Menu\n1.Raider details\n2.Defender details\nEnter choice");
		switch(sc.nextInt())
		{
			case 1:
					System.out.println("Enter number of raids");
					noOfRaids=sc.nextLine();
					System.out.println("Enter number of raid points");
					noOfRaidPoints=sc.nextLine();
					Raider r=new Raider(name,teamName,noOfMatches,noOfRaids,noOfRaidPoints);
					r.displayDetails();
					
				break;
			case 2: 
					System.out.println("Enter number of defence points");
					noOfDefencePoints=sc.nextLine();
					Defender d=new Defender(name,teamName,noOfMatches,noOfDefencePoints);
					d.displayDetails();
				break;
		}
		sc.close();
	}

}
