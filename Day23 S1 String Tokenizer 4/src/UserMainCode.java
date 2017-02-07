import java.util.StringTokenizer;

public class UserMainCode {
	public static void display(String a)
	{
		StringTokenizer st=new StringTokenizer(a);
		System.out.println("Player Name : "+st.nextToken(","));
	}
}
