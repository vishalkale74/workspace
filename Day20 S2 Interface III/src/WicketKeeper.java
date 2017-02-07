
public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
	private
	long noOfCatches,noOfStumpings,runs,noOfDismissals;

	public WicketKeeper(String name, String teamName, long noOfMatches,	long noOfCatches, long noOfStumpings, long runs, long noOfDismissals) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}
	public WicketKeeper() {
		// TODO Auto-generated constructor stub
	}
	public void displayPlayerStatistics()
	{
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("No of catches taken : "+noOfCatches);
		System.out.println("No of stumpings : "+noOfStumpings);
		System.out.println("No of dismissals : "+noOfDismissals);
		System.out.println("Runs scored : "+runs);
	}

}
