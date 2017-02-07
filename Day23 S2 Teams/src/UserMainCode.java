import java.util.StringTokenizer;


public class UserMainCode {
	public static void display(String a,String b)
	{
		StringTokenizer st=new StringTokenizer(a,b);
		while(st.hasMoreTokens())
			System.out.print(st.nextToken()+"");
	}
}
