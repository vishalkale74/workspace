
public class Match {

	String teamOne,teamTwo,venue,matchDate;

	public Match(String teamOne, String teamTwo, String venue, String matchDate) {
		super();
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.matchDate = matchDate;
	}

	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public void displayMatch(Match m, int k) 
	{
		System.out.println("Match "+k);
		System.out.println("TeamOne : "+m.getTeamOne());
		System.out.println("TeamTwo : "+m.getTeamTwo());
		System.out.println("Venue : "+m.getVenue());
		System.out.println("MatchDate : "+m.getMatchDate());
		
	}
	
}
