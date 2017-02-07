
import java.util.*;
public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
TreeSet<Player> pt=new TreeSet<>();
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
Player p= new Player(sc.nextLine());
pt.add(p);
}
String s="";
System.out.println("Teams and Players in ascending order");
for(Player p:pt)
{

if(!s.equals(p.getName().substring(0,p.getName().indexOf('|'))))
{
System.out.println(p.getName().substring(0,p.getName().indexOf('|')));
s=p.getName().substring(0,p.getName().indexOf('|'));
}
System.out.println("--"+p.getName().substring(p.getName().indexOf('|')+1));

}

sc.close();

}

}
