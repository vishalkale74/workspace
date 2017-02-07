import  java.io.*;
import java.util.*;
		public class Main 
		{	public static void main(String args[]) throws Exception
			{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int n,i;
				System.out.println("Enter number of players:");
				n=Integer.parseInt(br.readLine());
				String name,skill;
				long capNumber;
				ArrayList<Player> al=new ArrayList<Player>();  
				for(i=0;i<n;++i)
				{	System.out.println("Enter player "+(i+1)+" detail");
					System.out.println("Enter Name");
					name=br.readLine();
					System.out.println("Enter Skill");
					skill=br.readLine();
					System.out.println("Enter Cap Number");
					capNumber=Long.parseLong(br.readLine());

					al.add(new Player(name,skill,capNumber));
				}
				Collections.sort(al);
				System.out.println("Player list after sorting by cap number in descending order");
				for(Player r:al)
				{ 
					System.out.println(r.playerName+"-"+r.capNumber);  
				}  
				
			
			}
		}