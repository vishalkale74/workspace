
public class CricketPlayer extends Player{

	private
	long totalRunsScored;
	long noOfWicketsTaken;
	
	public CricketPlayer(String name, String teamName, long noOfMatches,long totalRunsScored, long noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}

	public void displayPlayerStatistics()
	{
		System.out.println("Player Details");
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("Total runsscored : "+totalRunsScored);
		System.out.println("No of wickets taken : "+noOfWicketsTaken);
	}
}
