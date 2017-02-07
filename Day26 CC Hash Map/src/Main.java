import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		String name;
		long n1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long, Player> hmap=new HashMap<>();
		System.out.println("Enter the number of players");
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1)+"");
			name=br.readLine();
			n1=Integer.parseInt(br.readLine());
			hmap.put(n1,new Player(name, n1));
		}
		Set<Long> ks=hmap.keySet();
		long k=Collections.max(ks);
		System.out.println(hmap.get(k).getName());
	}

}
