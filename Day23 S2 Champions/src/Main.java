import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String b=name.replaceAll("!", "#");
		StringTokenizer st=new StringTokenizer(b,"#");
		while(st.hasMoreTokens())
			System.out.print(st.nextToken()+"");
		sc.close();
	}

}
