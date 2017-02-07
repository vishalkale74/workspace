import java.util.*;
class Main{
public static void main(String[] args)
{
	String pName,cName,sk;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the player name");
	pName=sc.nextLine();
	System.out.println("Enter the country name");
	cName=sc.nextLine();
	System.out.println("Enter the skill");
	sk=sc.nextLine();
	Player player=new Player();
	player.name=pName;
	player.country=cName;
	player.skill=sk;
	System.out.println("Player Details :");
	System.out.println("Player Name : "+player.name);
	System.out.println("Country Name : "+player.country);
	System.out.println("Skill : "+player.skill);
	sc.close();
	}
}