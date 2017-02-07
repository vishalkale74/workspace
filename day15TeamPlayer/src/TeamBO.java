  public class TeamBO {
    public  Team createTeam(String data)
	{
		String[] x= data.split(",");
		Team team= new Team(x[0], x[1]);
		return team;
	}
	
	
	

}


