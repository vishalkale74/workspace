import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String name;
		int n,n1;
		String skill = null;
		ArrayList<Player> al=new ArrayList<Player>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide the number of players to be registered");
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter player name");
			name=br.readLine();
			System.out.println("Please select the skill of the player\n1.All Rounder\n2.Batsman\n3.Bowler");
			n1=Integer.parseInt(br.readLine());
			if(n1==1)
				skill="All Rounder";
			if(n1==2)
				skill="Batsman";
			if(n1==3)
				skill="Bowler";
			al.add(new Player(name,skill)); 
		}
		PlayerComparator tc=new PlayerComparator();
		Collections.sort(al, tc);
		System.out.println("Player Details");
		for(Player p:al)
		{
			System.out.println("Player : "+p.getName()+" Skill  : "+p.getSkill());
		}
	}

}
