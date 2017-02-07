
public abstract class CricketPlayer implements IPlayerStatistics{

	private
	 	String name;
		String teamName;
		long noOfMatches;
		public CricketPlayer(String name, String teamName, long noOfMatches) {
			super();
			this.name = name;
			this.teamName = teamName;
			this.noOfMatches = noOfMatches;
		}
		public CricketPlayer() {
			// TODO Auto-generated constructor stub
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
		public long getNoOfMatches() {
			return noOfMatches;
		}
		public void setNoOfMatches(long noOfMatches) {
			this.noOfMatches = noOfMatches;
		}
		
}
