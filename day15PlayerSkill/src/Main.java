import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Players");
		int n= Integer.parseInt(br.readLine());
		
		Player playerList[]= new Player[n];
		Skill[] skill= new Skill[n];
		String name,country,skill1;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter player "+(i+1)+" details:");
			System.out.println("Enter player name");
			name = br.readLine();
			System.out.println("Enter country name");
			country = br.readLine();
			System.out.println("Enter skill");
			skill1= br.readLine();
			skill[i]= new Skill(skill1);
			playerList[i]= new Player(name, country, skill[i]);
		}
		
		PlayerBO bo= new PlayerBO();
		int choice=0;
		do{
		
		System.out.println("Menu:\n1.View details\n2.Filter players with skill\n3.Exit");
		choice=Integer.parseInt(br.readLine());
		
		switch (choice) {
		case 1:
			bo.viewDetails(playerList);
			
			break;
		case 2:
			System.out.println("Enter skill");
			String skillx=br.readLine();
			bo.printPlayerDetailsWithSkill(playerList, skillx);
			break;
		case 3:
			System.exit(0);
		default:
			break;
		}
		}while(choice!=3);
	}

}
