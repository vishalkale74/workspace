import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class FileUtility {
	public List<Player> readFileData(InputStream i) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(i));
		List<Player> li=new ArrayList<Player>();
		String line;
		while((line=br.readLine())!=null)
		{
			String[] a=line.split(",");
			int u=Integer.parseInt(a[0]);
			int v=Integer.parseInt(a[4]);
			li.add(new Player(u,v,a[1],a[2],a[3]));
		}
		Collections.sort(li);
		return li;
		
	}
	public static void writeDataToFile(List<Player> playerList) throws Exception
	{
		PrintWriter pw=new PrintWriter(new File("output.csv"));
		for(Player li :playerList)
		{
			String j=li.getCapNumber()+","+li.getPlayerName()+","+li.getSkill()+","+li.getCountry()+","+li.getMatchesPlayed();
			pw.write(j);
			pw.write("\n");
					
		}
		pw.close();
	}
	

}
