import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String country;
        String skill;
        int n;
        System.out.println("Enter the number of players");
        n=Integer.parseInt(br.readLine());
        Player [] player=new Player[n];
        Skill [] sk=new Skill[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter the player name");
        name=br.readLine();
        System.out.println("Enter the country name");
        country=br.readLine();
        System.out.println("Enter the skill");
        skill=br.readLine();
        player[i]=new Player(name,country,new Skill(skill));
        sk[i]=new Skill(skill);
       
        }
        PlayerBO playerBO=new PlayerBO();
System.out.println("Menu\n1.View details\n2.Filter players with skill");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
       case 1:
 playerBO.viewDetails(player);
break;
       case 2:
        System.out.println("Enter the skill to be searched");
        String ss=br.readLine();
        playerBO.printPlayerDetailsWithSkill(player,sk,ss);
break;
       } 
    }
    }

