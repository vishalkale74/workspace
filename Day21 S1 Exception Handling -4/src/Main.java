import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String name;
		String country;
		String skill;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Class vishal=Class.forName("Player");
			Player player=(Player)vishal.newInstance();
		}
		catch(Exception e)
		{
			System.out.println("Trying to invoke a no-argument constructor (that is not available) using newInstance method");
			System.out.println("Exception Occured : "+e.getClass().getName());
			
		}
		System.out.println("Enter name of the player");
		name=br.readLine();
		System.out.println("Enter country of the player");
		country=br.readLine();
		System.out.println("Enter skillset of the player");
		skill=br.readLine();
		System.out.println(name+", "+country+", "+skill);
	}

}
