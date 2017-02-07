 class PlayerBO {
    void viewDetails(Player[] playerList)
    	{
 		//fill your code
    	Player player=new Player();
    	for(int i=0;i<playerList.length;i++)
    	{
    			System.out.println(player.toString());
    	}
    	
   
   	 }
    void printPlayerDetailsWithSkill(Player[] playerList,Skill[] skillList,String skill)
	{
		//fill your code
    	Player player =new Player();
    	for(int i=0; i<playerList.length;i++)
    	{
    		if(playerList[i].getSkills().equals(skillList))
    		{
    			System.out.println(playerList[i]);
    		}
    	}
	}
}
