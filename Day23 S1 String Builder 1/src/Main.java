import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String s1 =name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		StringBuilder sb=new StringBuilder(s1);
		StringBuilder sb1=sb.append(" ");
		String name1=sc.nextLine();
		String name2=name1.toUpperCase();
		StringBuilder sb2=new StringBuilder(name2);
		UserMainCode umc= new UserMainCode();
		umc.display(sb1,sb2);
		sc.close();
	}

}
