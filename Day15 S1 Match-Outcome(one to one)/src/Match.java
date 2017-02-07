
public class Match {
	
	private String date,teamOne,teamTwo,venue;
	private Outcome outcome;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Outcome getOutcome() {
		return outcome;
	}
	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}
	public Match(String date, String teamOne, String teamTwo, String venue,
			Outcome outcome) {
		
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.outcome = outcome;
	}
	public Match() {
		
	}
	public String toString() {
		
		String[] s={getDate(),getTeamOne(),getTeamTwo(),getVenue(),getOutcome().toString()};
		String s1= String.format("%-15s %-15s %-15s %-15s %-30s", s);
		return s1;
	}
	
	

}
