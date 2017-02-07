import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the player");
		String name=sc.nextLine();
		System.out.println("Enter the team name");
		String team=sc.nextLine();
		System.out.println("Enter the number of matches played");
		int numberOfMatches=sc.nextInt();
		File f=new File("player.csv");
		FileOutputStream fos=new FileOutputStream(f);

			if(!f.exists())
			{
				f.createNewFile();
			}
				
		String s=name+","+team+","+numberOfMatches;
		byte ba[]=s.getBytes();
		fos.write(ba);
		fos.close();
		fos.flush();
		sc.close();
	}

}
