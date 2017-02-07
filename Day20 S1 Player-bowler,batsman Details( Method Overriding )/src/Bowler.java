
public class Bowler extends Player
{
	private
	long	noOfWickets;
	
	 
	public Bowler(String name,String teamName,long noOfMatches,long noOfWickets)
	{
		this.name=name;
		this.teamName=teamName;
		this.noOfMatches=noOfMatches;
		this.noOfWickets=noOfWickets;
		
	}
	public Bowler(long noOfWickets)
	{
		this.noOfWickets=noOfWickets;
	}
	public long getNoOfWickets() {
		return noOfWickets;
	}


	public void setNoOfWickets(long noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	void displayDetails()
	{
		System.out.println("Bowler : "+this.getName());
		System.out.println("Team : "+this.getTeamName());
		System.out.println("Number of matches : "+this.getNoOfMatches());
		System.out.println("Number of wickets taken : "+this.getNoOfWickets());
	}
}
