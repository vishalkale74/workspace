
public class Batsman extends CricketPlayer implements IPlayerStatistics{
	private long runs;
	

	public Batsman(String name, String teamName, long noOfMatches, long runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}
public Batsman() {
	// TODO Auto-generated constructor stub
}

	public void displayPlayerStatistics() 
	{
		System.out.println("Player name : "+getName());
		System.out.println("Team name : "+getTeamName());
		System.out.println("No of matches : "+getNoOfMatches());
		System.out.println("Runs scored : "+runs);
	}

}
