import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
	    String country; 
	    String skill; 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the player name");
	    name=sc.nextLine();
	    System.out.println("Enter the country name");
	    country=sc.nextLine();
	    System.out.println("Enter the skill");
	    skill=sc.nextLine();
	    Player player= new Player();
	    player.setName(name);
	    player.setCountry(country);
	    player.setSkill(skill);
	    
	    System.out.println("Player Details");
	    System.out.println(player.toString());
	    
	}

}
