import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String sName=sc.next();
		UserMainCode.validatePlayer(name,sName);
		sc.close();
	}

}
