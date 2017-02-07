import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name");
		String P=sc.nextLine();
		StringBuffer sb=new StringBuffer(P);
		sb=sb.append("#");
		System.out.println("Enter the team name");
		String T=sc.nextLine();
		StringBuffer sb1=new StringBuffer(T);
		UserMainCode umc=new UserMainCode();
		umc.display(sb,sb1);
		sc.close();
	}

}
