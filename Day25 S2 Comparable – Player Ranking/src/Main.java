import  java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
              public class Main 
              {      public static void main(String args[]) throws Exception
                     {      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                           int n,i;
                           String b,a,c;
                           System.out.println("Enter the number of matches");
                           n=Integer.parseInt(br.readLine());
                           SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy");
                           
                           ArrayList<Match> al=new ArrayList<Match>();  
                           for(i=0;i<n;++i)
       
                           {      System.out.println("Enter match date in (MM-dd-yyyy)");
                                  b=br.readLine();
                                  Date d=s.parse(b);
                                  System.out.println("Enter Team 1");
                                  a=br.readLine();
                                  System.out.println("Enter Team 2");
                                  c=br.readLine();
                                  al.add(new Match(d,a,c));
                           }
                           Collections.sort(al);
                           System.out.println("Match Details");
                           for(Match r:al)
                           { 
                                  System.out.println("Team 1 "+r.teamOne+"\nTeam 2 "+r.teamTwo+"\nMatch held on "+s.format(r.matchDate));  
                           }  
                           
                     
                     }
              }

