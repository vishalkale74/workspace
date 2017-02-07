import java.util.*;
public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
TreeMap<String,Player>tm=new TreeMap<>();
System.out.println("Enter the number of players");
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
System.out.println("Enter the details of the player "+(i+1));
String capNo=sc.nextLine();
String name=sc.nextLine();
String team=sc.nextLine();
String skill=sc.nextLine();

Player p=new Player(name,team,skill);
tm.put(capNo, p);
}
System.out.println("Player Details");
for(Map.Entry<String, Player> entry:tm.entrySet())
{
System.out.println(entry.getKey()+"--"+entry.getValue().getName()+"--"+entry.getValue().getTeam()
+"--"+entry.getValue().getSkill());
}

System.out.println("Enter the cap number of the player to be searched");
String serch=sc.nextLine();

if(tm.containsKey(serch))
{	System.out.println("Player Details");
//MS Dhoni--Rising Pune Supergiants--All Rounder
System.out.println(tm.get(serch).getName()+"--"+tm.get(serch).getTeam()
+"--"+tm.get(serch).getSkill());
}
else
{
System.out.println("Player not found");
}
sc.close();
}
}