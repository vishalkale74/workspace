
public class PlayerBO {
	public void viewDetails(Player[] playerList)
	{String[] sx= {"Player","Country","Skill"};
	String s1= String.format("%-15s %-15s %-15s", sx);
	System.out.println(s1);
		for(int i=0;i<playerList.length;i++)
		{
			System.out.println(playerList[i].toString());
		}
	}
	
	public void printPlayerDetailsWithSkill(Player[] playerList, String skill)
	{
		String[] sx= {"Player","Country","Skill"};
		String s1= String.format("%-15s %-15s %-15s", sx);
		System.out.println(s1);
		int flag=0;
		for(int i=0;i<playerList.length;i++)
		{
			if(playerList[i].getSkill().getSkillName().equals(skill))
			{
				flag=1;
			System.out.println(playerList[i].toString());
			}
		}
		if(flag==0)
		{
			System.out.println("Skill not found");
		}
	}

}
