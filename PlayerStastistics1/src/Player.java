
public class Player implements IPlayerStatistics {
private String name,teamName;
private int noOfMatches;
private long totalRunsScored;
private int noOfWicketsTaken;


public void displayPlayerStatistics()
{
	System.out.println("Player Details\nPlayer name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nTotal runsscored : "+this.getTotalRunsScored()+"\nNo of wickets taken : "+this.getNoOfWicketsTaken());
}




public Player(String name, String teamName, int noOfMatches,
		long totalRunsScored, int noOfWicketsTaken) {
	super();
	this.name = name;
	this.teamName = teamName;
	this.noOfMatches = noOfMatches;
	this.totalRunsScored = totalRunsScored;
	this.noOfWicketsTaken = noOfWicketsTaken;
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




public int getNoOfMatches() {
	return noOfMatches;
}




public void setNoOfMatches(int noOfMatches) {
	this.noOfMatches = noOfMatches;
}




public long getTotalRunsScored() {
	return totalRunsScored;
}




public void setTotalRunsScored(long totalRunsScored) {
	this.totalRunsScored = totalRunsScored;
}




public int getNoOfWicketsTaken() {
	return noOfWicketsTaken;
}




public void setNoOfWicketsTaken(int noOfWicketsTaken) {
	this.noOfWicketsTaken = noOfWicketsTaken;
}




public Player() {
	// TODO Auto-generated constructor stub
}





}
