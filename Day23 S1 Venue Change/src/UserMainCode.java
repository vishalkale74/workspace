
public class UserMainCode {
	public static void display(String sb)
	{
		System.out.println("Modified Venue");
		String sb1=sb.replaceAll("Stadium", "Ground");
		StringBuffer b=new StringBuffer(sb1);
		System.out.println(b);
	}

}
