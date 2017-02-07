import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name");
		String s=sc.nextLine();
		//String[] arr=s.split(" ");
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer sb1= new StringBuffer(arr[1]);
		UserMainCode umc= new UserMainCode();
		umc.display(s);
		sc.close();
	}

}
