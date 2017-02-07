
public class ExtraEvent {

	private String	extraType;
	private long	points;
	private String	scoringTeam;
	
	public ExtraEvent(String	extraType,long	points,String	scoringTeam)
	{
		this.extraType=extraType;
		this.points=points;
		this.scoringTeam=scoringTeam;
	}
	public ExtraEvent()
	{
		
	}
	
	
	
	public String getExtraType() {
		return extraType;
	}
	public void setExtraType(String extraType) {
		this.extraType = extraType;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public String getScoringTeam() {
		return scoringTeam;
	}
	public void setScoringTeam(String scoringTeam) {
		this.scoringTeam = scoringTeam;
	}
	public String toString() {
		String a= getExtraType() + " -- " +getPoints()+ " -- " + getScoringTeam() ;
		return a;
	}
	
	
	
}
