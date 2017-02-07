import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name,team,skill;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Player> list=new ArrayList<Player>();
		System.out.println("Enter the number of the players");
		int n= Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter details of player "+(i+1)+"\nEnter the player name:");
			name=br.readLine();
			System.out.println("Enter the team name:");
			team=br.readLine();
			System.out.println("Enter the skill:");
			skill=br.readLine();
			list.add(new Player(name, team, skill));
			FileUtility fl= new FileUtility();
			fl.writeDataToFile(list);
		}
	}

}
