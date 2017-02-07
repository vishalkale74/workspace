import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String bowlerName = null;
		String wicket;
		String name;
		int wicketCount = 0;
		String ans,ans1;
		Player p=new Player(bowlerName, wicketCount);
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Enter the player name");
		bowlerName=br.readLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		wicket=br.readLine();
		String[] arr=wicket.split("\\|");
		wicketCount=arr.length;
		System.out.println("Do you want to add another player (yes/no)");
		ans=br.readLine();
		hmap.put(bowlerName, wicketCount);
		}
		while(ans.equalsIgnoreCase("yes"));
		do
		{
		System.out.println("Enter the player name to search");
		name=br.readLine();
		if(hmap.containsKey(name))
		{
			System.out.println("Player name : "+name);
			System.out.println("Wicket Count : "+hmap.getOrDefault(name, wicketCount));
		}
		else
			System.out.println("No player found with the name "+name);
		System.out.println("Do you want to search another player (yes/no)");
		ans1=br.readLine();
		}
		while(ans1.equalsIgnoreCase("yes"));
	}

}
