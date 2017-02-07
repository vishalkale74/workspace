class Player {
    private String name;
    private String country;
    Skill skill;
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
    public Skill getSkills() {
        return skill;
    }
    public void setSkills(Skill skill) {
        this.skill = skill;
    }
    public Player(String name, String country,Skill skill) {
        super();
        this.name = name;
        this.country = country;
        this.skill = skill;
    }
    public Player()
    {
    	
    }
    public String toString()
    {
    	Object[] a={getName(),getCountry(),getSkills()};
        return String.format("%-15s %-15s %s",a);
    }

}

