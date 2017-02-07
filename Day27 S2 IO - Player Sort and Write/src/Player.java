
public class Player implements Comparable<Player>{
  int	CapNumber,matchesPlayed;
  String playerName,skill,country;
public int getCapNumber() {
	return CapNumber;
}
public void setCapNumber(int capNumber) {
	CapNumber = capNumber;
}
public int getMatchesPlayed() {
	return matchesPlayed;
}
public void setMatchesPlayed(int matchesPlayed) {
	this.matchesPlayed = matchesPlayed;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Player(int capNumber, int matchesPlayed, String playerName,
		String skill, String country) {
	super();
	this.CapNumber = capNumber;
	this.matchesPlayed = matchesPlayed;
	this.playerName = playerName;
	this.skill = skill;
	this.country = country;
}
  public Player()
  {
	  
  }
  public int compareTo(Player p)
  {
	 if(this.CapNumber>p.CapNumber)
	 {
		 return 1;
	 }
	 else if(this.CapNumber<p.CapNumber)
	 {
		 return -1;
	 }
	 else
	 {
		 return 0;
	 }
  }
}
