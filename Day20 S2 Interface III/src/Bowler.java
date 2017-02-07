
public class Bowler extends CricketPlayer implements IPlayerStatistics{

	private long noOfWickets;
	
	
	public Bowler(String name, String teamName, long noOfMatches,long noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}
	public Bowler() {
		// TODO Auto-generated constructor stub
	}

	public void displayPlayerStatistics()
	{
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("No of wickets taken : "+noOfWickets);
	}

}
