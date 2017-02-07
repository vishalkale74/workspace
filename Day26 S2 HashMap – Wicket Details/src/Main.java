import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String playerName = null;
		String name;
		String sName;
		String ans,ans1;
		//Wicket wk=new Wicket(playerName);
		HashMap<String, String> hmap=new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Enter the player name");
		name=br.readLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol");
		playerName=br.readLine();
		System.out.println("Do you want to add another player (yes/no)");
		ans=br.readLine();
		hmap.put(name,playerName);
		}
		while(ans.equalsIgnoreCase("yes"));
		do
		{
		System.out.println("Enter the player name to search");
		sName=br.readLine();
		if(hmap.containsKey(sName))
		{
			
			System.out.println("Player Name : "+sName);
			String a=hmap.getOrDefault(sName, playerName);
			String[] arr=a.split("\\|");
			System.out.println("Wickets :");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}
		else
			System.out.println("No player found with the name "+sName);
		System.out.println("Do you want to search another player (yes/no)");
		ans1=br.readLine();
		}
		while(ans1.equalsIgnoreCase("yes"));
	}

}
