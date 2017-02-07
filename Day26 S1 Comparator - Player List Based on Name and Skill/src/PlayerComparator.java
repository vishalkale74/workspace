import java.util.Comparator;


public class PlayerComparator implements Comparator<Player>
{
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		int pl1=0,pl2=0;
		if(p1.getSkill().equals("All Rounder"))
			pl1=1;
		else if(p1.getSkill().equals("Batsman"))
			pl1=2;
		else
			pl1=3;
		if(p2.getSkill().equals("All Rounder"))
			pl2=1;
		else if(p2.getSkill().equals("Batsman"))
			pl2=2;
		else
			pl2=3;
		if(pl1==pl2)
			return -1;
		else if(pl1>pl2)
			return 1;
		else
		return -1; 
	}
}