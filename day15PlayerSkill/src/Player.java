
public class Player {
	private String name,country;
	private Skill skill;

	

	public Player(String name, String country, Skill skill) {
		
		this.name = name;
		this.country = country;
		this.skill = skill;
	}



	public Player() {
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Skill getSkill() {
		return skill;
	}



	public void setSkill(Skill skill) {
		this.skill = skill;
	}



	public String toString() {
		String[] s= {getName(),getCountry(),getSkill().getSkillName()};
		String s1= String.format("%-15s %-15s %-15s", s);
		return s1;
	}
	

}
