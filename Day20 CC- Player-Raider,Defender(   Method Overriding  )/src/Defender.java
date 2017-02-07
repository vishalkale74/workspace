
public class Defender extends Player {

	private
	String  noOfDefencePoints;

	public Defender(String name, String teamName, String noOfMatches,String noOfDefencePoints) {
		super(name, teamName, noOfMatches);
		this.noOfDefencePoints = noOfDefencePoints;
	}
	public Defender() {
		// TODO Auto-generated constructor stub
	}
	void displayDetails() 
	{
		System.out.println("Player Name : "+getName());
		System.out.println("Team Name : "+getTeamName());
		System.out.println("No. of Matches : "+getNoOfMatches());
		System.out.println("No. of Defence Points : "+noOfDefencePoints);
	}
}
