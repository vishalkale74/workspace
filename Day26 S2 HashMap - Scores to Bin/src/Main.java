import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
public static void main(String args[]) throws Exception, IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> al=new ArrayList<Integer>();
	int n=Integer.parseInt(br.readLine());
	for(int i=0;i<n;i++)
	{
		al.add(Integer.parseInt(br.readLine()));
	}
	Histogram hm=new Histogram();
	hm.addScore(al);
	hm.display();
}
}
