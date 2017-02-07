
public class Player 
{
	protected
	String	name;
	String	teamName;
	String noOfMatches;
	
	public Player(String name,String teamName,String noOfMatches)
	{
		this.name=name;
		this.teamName=teamName;
		this.noOfMatches=noOfMatches;
	}
	public Player ()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(String noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	void displayDetails() 
	{
		
	}
}
