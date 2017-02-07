import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		String country;
		String skill;
		System.out.println("Enter the number of players");
		int n=Integer.parseInt(br.readLine());
		Player[] player=new Player[n+1];
		try 
		{			
			System.out.println("Do you know the details of the captain? Type Yes / No");
			String cap=br.readLine();
			if(cap.equals("Yes"))
			{
				System.out.println("Enter name of the captain");
				name=br.readLine();
				System.out.println("Enter country of the captain");
				country=br.readLine();
				System.out.println("Enter skillset of the captain");
				skill=br.readLine();
				player[0]=new Player(name,country,skill);
			}
				
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter name of player "+(i+1));
					name=br.readLine();
					System.out.println("Enter country of player "+(i+1));
					country=br.readLine();
					System.out.println("Enter skillset of player "+(i+1));
					skill=br.readLine();
					player[i+1]=new Player(name, country, skill);
				}
			
			System.out.println(player[0].getName()+", "+player[0].getCountry()+", "+player[0].getSkill());
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception Occured : "+e.getClass().getName());
			System.out.println("Captain details not available");
		} 
		
		finally
		{
			PlayerBO bo = new PlayerBO();
			
			bo.displayPlayerDetails(player);
			
		}
		
	}

}
