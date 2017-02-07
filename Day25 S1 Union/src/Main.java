import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Main 
{
	public static void main(String []args)throws Exception
	{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int b,t;
       System.out.println("Enter the number of top run scorers in season 4");
       b=Integer.parseInt(br.readLine());
       System.out.println("Enter the name of players");
       ArrayList<String> list1 = new ArrayList<String>(b);
       for(int i=0;i<b;i++)
       {
              list1.add(br.readLine());
       }
  
    System.out.println("Enter the number of top run scorers in season 5");
       t=Integer.parseInt(br.readLine());
       System.out.println("Enter the name of players");
       ArrayList<String> list2 = new ArrayList<String>(t);
    for(int i=0;i<t;i++)
       {
              list2.add(br.readLine());
       }
    HashSet<String> hs1= new HashSet<String>(list1);
   
    System.out.println("Player Set 1"); 
    
    for (Iterator<String> iterator = hs1.iterator(); iterator.hasNext();) {
              String string = (String) iterator.next();
              System.out.println(string);
       }
     HashSet<String> hs2= new HashSet<String>(list2);
       System.out.println("Player Set 2"); 
     for (Iterator<String> iterator = hs2.iterator(); iterator.hasNext();) {
             String string = (String) iterator.next();
             System.out.println(string);
      }
     hs1.addAll(hs2) ;
     System.out.println("Union");
     for (Iterator<String> iterator = hs1.iterator(); iterator.hasNext();) {
              String string = (String) iterator.next();
              System.out.println(string);
       }
     
}
}