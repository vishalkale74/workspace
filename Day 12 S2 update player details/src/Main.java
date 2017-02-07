import java.util.Scanner;


public class Main {


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name,country,skill;
    int n;
    System.out.println("Enter the player name");
    name=sc.nextLine();
    System.out.println("Enter the country name");
    country=sc.nextLine();
    System.out.println("Enter the skill");
    skill=sc.nextLine();
    Player player=new Player();
    player.setName(name);
    player.setCountry(country);
    player.setSkill(skill);
    System.out.println("Player Details");
    System.out.println("Player Name :"+player.getName());
    System.out.println("Country Name :"+player.getCountry());
    System.out.println("Skill :"+player.getSkill());
    System.out.println("Verify and Update Player Details");
    
    do{
           System.out.println("Menu");
           System.out.println("1.Update Player Name");
           System.out.println("2.Update Country Name");
           System.out.println("3.Update Skill");
           System.out.println("4.All informations Correct/Exit");
           System.out.println("Type 1 or 2 or 3 or 4");
           n=sc.nextInt();
    if(n==1){
           System.out.println("The current player name is "+player.getName());
           System.out.println("Enter the player name");
           sc.nextLine();
           name=sc.nextLine();
           player.setName(name);
    }
    if(n==2){
           System.out.println("The current country name is "+player.getCountry());
           System.out.println("Enter the country name");
           sc.nextLine();
           country=sc.nextLine();
           player.setCountry(country);
    }
    if(n==3){
           System.out.println("The current skill is "+player.getSkill());
           System.out.println("Enter the skill");
           sc.nextLine();
           skill=sc.nextLine();
           player.setSkill(skill);
    }
    }while(n!=4);
    
    System.out.println("Player Details");
    System.out.println("Player Name :"+player.getName());
    System.out.println("Country Name :"+player.getCountry());
    System.out.println("Skill :"+player.getSkill());
    
}
}
