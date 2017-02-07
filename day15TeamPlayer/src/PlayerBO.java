  public class PlayerBO {
    public Player createPlayer(String data, Team[] teamList)
	{
		String[] x=data.split(",");
		Player player= null;
		for(int i=0;i<teamList.length;i++)
		{
			if(teamList[i].getName().equals(x[1])){
				player = new Player(x[0], teamList[i]);
			}
		}
		return player;
            
		 
		
		
	}
	
	public String findTeamName(Player[] playerList, String playername)
	{
		String y="";
		for(int i=0;i<playerList.length;i++)
		{
			if(playerList[i].getName().equals(playername))
			y=playerList[i].getTeam().getName();
		}
		return y;
		
	}
	
	public boolean findWhetherPlayersAreInSameTeam (Player[] playerList, String playername1, String playername2)
	{
		String team1="",team2="";
		 for(int i=0;i<playerList.length;i++)
		 {
			 if(playerList[i].getName().equals(playername1))
			 {
				 team1=playerList[i].getTeam().getName();
			 }
			 if(playerList[i].getName().equals(playername2))
			 {
				 team2=playerList[i].getTeam().getName();
			 }
		 }
		 if(team1.equals(team2))
			 return true;
		 else
			 return false;
		
		
	}

}




