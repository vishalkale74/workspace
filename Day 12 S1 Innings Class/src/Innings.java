
public class Innings {

	String	number;
	String	battingTeam;
	long	runs;
	
	public void displayInningsDetails()
	{
		System.out.println("Innings Details :");
		System.out.println("Innings number : "+this.number);
		System.out.println("BattingTeam : "+this.battingTeam);
		System.out.println("Runs scored :"+this.runs);
	}
}
