import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class FileUtility {
	void writeDataToFile(List<Player> playerList) throws IOException
	{
	File f=new File("player.csv");
	PrintWriter pw= new PrintWriter(f);

		if(!f.exists())
		{
			f.createNewFile();
		}
		for(Player li :playerList)
        {
			String a=li.getName()+","+li.team+","+li.skill;
			pw.write(a);
			pw.write("\n");                   
        }
        pw.close(); 	
	}
}
