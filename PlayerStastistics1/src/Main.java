import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player name");
		String name= br.readLine();
		System.out.println("Enter team name");
		String team= br.readLine();
		System.out.println("Enter number of matches played");
		int matches= Integer.parseInt(br.readLine());
		System.out.println("Enter total runs scored");
		long raid= Long.parseLong(br.readLine());
		System.out.println("Enter number of wickets taken");
		int def=Integer.parseInt(br.readLine());
		Player player = new Player(name, team, matches, raid, def);
		
		player.displayPlayerStatistics();
		
	}

}
