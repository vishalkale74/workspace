
public class HockeyPlayer extends Player{

	
	private
	String Position;
	long noOfGoals;
	
	public HockeyPlayer(String name, String teamName, long noOfMatches,String position, long noOfGoals) {
		super(name, teamName, noOfMatches);
		Position = position;
		this.noOfGoals = noOfGoals;
	}

	public void displayPlayerStatistics()
	{
		System.out.println("Player Details");
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("Position : "+Position);
		System.out.println("No of goals taken : "+noOfGoals);
	}

}
