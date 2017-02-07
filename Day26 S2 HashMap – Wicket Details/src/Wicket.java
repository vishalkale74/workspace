
public class Wicket {
	String playerName;

	public Wicket(String playerName) {
		super();
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	Bowler bo=new Bowler(playerName);
}
