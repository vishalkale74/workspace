import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String	battingTeam;
		long	runs;
		Scanner sc=new Scanner(System.in);
		Innings[] innings=new Innings[2];
		System.out.println("Enter the values for FirstInnings");
		System.out.println("Enter the BattingTeam");
		battingTeam=sc.nextLine();
		System.out.println("Enter the runs scored");
		runs=sc.nextLong();
		innings[0]=new Innings(battingTeam, runs);
		sc.nextLine();
		System.out.println("Enter the values for SecondInnings");
		System.out.println("Enter the BattingTeam");
		battingTeam=sc.nextLine();
		System.out.println("Enter the runs scored");
		runs=sc.nextLong();
		innings[1]=new Innings(battingTeam, runs);
		InningsBO inningsBO=new InningsBO();
		inningsBO.displayAllInningsDetails(innings);

	}

}
