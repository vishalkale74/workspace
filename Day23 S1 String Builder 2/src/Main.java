import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String name1=sc.nextLine();
		UserMainCode umc= new UserMainCode();
		umc.display(name,name1);
		sc.close();
	}

}
