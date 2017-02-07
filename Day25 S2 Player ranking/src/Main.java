import java.util.*;  
import java.io.*;  
public class Main
{  
	public static void main(String args[]) throws NumberFormatException, IOException
	{  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Ranking> al=new ArrayList<Ranking>();  
       System.out.println("Please provide the number of  players");
       int n=Integer.parseInt(br.readLine());
       int i;
       for(i=0;i<n;i++)
       {
    	   System.out.println("Enter the name of the player "+(i+1));
    	   String name=br.readLine();
    	   System.out.println("Enter the score of the player "+(i+1));
    	   int score=Integer.parseInt(br.readLine());
    	   al.add(new Ranking(name,score)); 
       }
       System.out.println("Player Details by Score(High to Low)"); 
       int k=1;
       Collections.sort(al);
      // Collections.reverse(al);
       for( Ranking p :al)
       {  
    	   System.out.println(k+" "+p.getName()+" "+p.getScore());  
    	   k++;
       }  
	} 
}