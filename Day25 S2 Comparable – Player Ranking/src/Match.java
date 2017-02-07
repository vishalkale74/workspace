import java.util.Date;


public class Match implements Comparable<Match>
{
	Date matchDate;
	String teamOne,teamTwo;
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public Match(Date matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public int compareTo(Match m) 
	{
		 if (matchDate.compareTo(m.matchDate) > 0) 
		 {
	           return -1; 	        
	           } 
		 else if (matchDate.compareTo(m.matchDate) < 0) 
		 {
	            return 1;
	        } 
		 else
		 {
	            return 0;
	        } 
		
	}
	
}
