import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	number;
		String	battingTeam;
		long	runs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the innings number");
		number=sc.nextLine();
		System.out.println("Enter the BattingTeam");
		battingTeam=sc.nextLine();
		System.out.println("Enter the runs scored");
		runs=sc.nextLong();
		Innings I=new Innings();
		I.number=number;
		I.battingTeam=battingTeam;
		I.runs=runs;
		I.displayInningsDetails();
		sc.close();
	}
}
