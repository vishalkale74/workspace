
public class Batsman extends Player
{
	private long noOfRuns;
	
	public Batsman(String name,String teamName,long noOfMatches,long noOfRuns)
	{
		this.name=name;
		this.teamName=teamName;
		this.noOfMatches=noOfMatches;
		this.noOfRuns=noOfRuns;
		
	}
	public Batsman(long noOfRuns)
	{
		this.noOfRuns=noOfRuns;
	}
	

	public long getNoOfRuns() {
		return noOfRuns;
	}



	public void setNoOfRuns(long noOfRuns) {
		this.noOfRuns = noOfRuns;
	}

	
	
	void displayDetails()
	{
		System.out.println("Bowler : "+this.getName());
		System.out.println("Team : "+this.getTeamName());
		System.out.println("Number of matches : "+this.getNoOfMatches());
		System.out.println("Number of runs scored : "+this.getNoOfRuns());
	}
}
