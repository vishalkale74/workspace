import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team names");
		String name=sc.nextLine();
		StringTokenizer st=new StringTokenizer(name,"#");
		UserMainCode.display(st);
		sc.close();
	}

}
