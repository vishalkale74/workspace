
public class AllRounder extends CricketPlayer implements IPlayerStatistics{
	private long runs,noOfWickets;

	public AllRounder(String name, String teamName, long noOfMatches,long runs, long noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}

	public void displayPlayerStatistics()
	{
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("Runs scored : "+runs);
		System.out.println("No of wickets taken : "+noOfWickets);
	}

}
