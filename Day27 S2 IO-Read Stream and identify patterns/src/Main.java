import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStream i=new FileInputStream(new File("team.txt"));
		BufferedReader fr= new BufferedReader(new InputStreamReader(i));
		System.out.println("Enter number of words");
		int n= Integer.parseInt(br.readLine());
		String[] words= new String[n];
		System.out.println("Enter the strings to be searched");
		for (int j = 0; j < words.length; j++) {
			words[j]=br.readLine();
		}
		String line=fr.readLine();
		System.out.println("Given string is "+line);
		
		
		for(int k=0;k<words.length;k++)
		{
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = line.indexOf(words[k],lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += words[k].length();
		    }
		}
		System.out.println("Word:"+words[k]+" Count:"+count);
		}
		
		
	}

}
