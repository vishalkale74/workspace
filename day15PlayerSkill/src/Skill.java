
public class Skill {
	private String skillName;

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skill(String skillName) {
		
		this.skillName = skillName;
	}

	public Skill() {
		
	}

	public String toString() {
		String[] s1={getSkillName()};
		String s= String.format("%-15s", s1);
		return s;
	}
	

}
