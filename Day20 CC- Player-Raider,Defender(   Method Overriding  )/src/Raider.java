
public class Raider extends Player{

	private
	String noOfRaids;
	String noOfRaidPoints;
	/*public Raider(String name, String teamName,String noOfMatches,String noOfRaids,String noOfRaidPoints)
	{
		super(name,teamName,noOfMatches);
		this.noOfRaids=noOfRaids;
	}*/
	public Raider(String name, String teamName, String noOfMatches,	String noOfRaids, String noOfRaidPoints) {
		super(name, teamName, noOfMatches);
		this.noOfRaids = noOfRaids;
		this.noOfRaidPoints = noOfRaidPoints;
	}
	public Raider() {
		// TODO Auto-generated constructor stub
	}
	void displayDetails() 
	{
		System.out.println("Player Name : "+getName());
		System.out.println("Team Name : "+getTeamName());
		System.out.println("No. of Matches : "+getNoOfMatches());
		System.out.println("No. of Raids : "+noOfRaids);
		System.out.println("No. of Raid Points : "+noOfRaidPoints);
	}
	
}
