import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		HashMap<Long, Player> hm=new HashMap<>();
		int n =Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			String name=br.readLine();
			long x=Long.parseLong(br.readLine());
			hm.put(x,new Player(name, x));
		}
		Set<Long> ks=hm.keySet();
		long k=Collections.max(ks);
		System.out.println(hm.get(k).getName());
	}

}
