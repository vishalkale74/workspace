
public class PlayerBO {

	public void displayPlayerDetails(Player[] player)
	{
		System.out.println("Player Details");
		for(int i=1;i<player.length;i++)
		{
			System.out.println(player[i].getName()+", "+player[i].getCountry()+", "+player[i].getSkill());
		}
	}
}
