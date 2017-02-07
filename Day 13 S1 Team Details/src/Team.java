
public class Team {
	String name;
	String coach;
	String location; 
	String players;
	String captain;
public Team(String name,String coach,String location,String players,String captain)
{
	this.name=name;
	this.coach=coach;
	this.location=location;
	this.captain=captain;
	this.players=players;
	
	}
public Team()
{
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCoach() {
	return coach;
}
public void setCoach(String coach) {
	this.coach = coach;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getPlayers() {
	return players;
}
public void setPlayers(String players) {
	this.players = players;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}

}
