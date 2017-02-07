import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		InputStream is = new FileInputStream("outcome.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String line = br.readLine();
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(line.substring(start,end));
		sc.close();
	}
}