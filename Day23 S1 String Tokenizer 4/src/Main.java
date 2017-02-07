import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details");
		String name=sc.nextLine();
		UserMainCode.display(name);
		sc.close();
	}

}
