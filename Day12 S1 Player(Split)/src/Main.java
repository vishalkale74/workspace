import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	name;
		String	country;
		String	skill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details");
		name=sc.nextLine();
		String name1[]=name.split(",");
		String pName=name1[0];
		country=name1[1];
		skill=name1[2];
		Player P=new Player();
		P.name=pName;
		P.country=country;
		P.skill=skill;
		System.out.println("Player Details :");
		System.out.println("Player Name : "+P.name);
		System.out.println("Country Name : "+P.country);
		System.out.println("Skill : "+P.skill);
		sc.close();
	}
}