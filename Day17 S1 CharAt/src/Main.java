import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String team1,team2;
		char ch;
		System.out.println("Enter team1");
		team1=sc.nextLine();
		System.out.println("Enter team2");
		team2=sc.nextLine();
		System.out.println("Enter third character");
		ch=sc.next().charAt(0);
		//char[] ch1=team1.toCharArray();
		//char[] ch2=team2.toCharArray();
		if(ch==team1.charAt(2))
			System.out.println("Winner Team : "+team1);
		else if(ch==team2.charAt(2))
			System.out.println("Winner Team : "+team2);
		}

}
