import java.util.Scanner;


public class Main {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
          
              Scanner scanner= new Scanner(System.in);
              Player player1= new Player();
              System.out.println("Enter the player 1 details");
              System.out.println("Enter the player name");
              player1.setName(scanner.nextLine());
              //name=scanner.nextLine();
              System.out.println("Enter the country name");
              //country=scanner.nextLine();
              player1.setCountry(scanner.nextLine());
              System.out.println("Enter the skill");
              //skill=scanner.nextLine();
              player1.setSkill(scanner.nextLine());
              
              //System.out.println(player1.toString());
              System.out.println(player1.name+" --- "+player1.country+" --- "+player1.skill);
              
              Player player2= new Player();
              System.out.println("Enter the player 2 details");
              System.out.println("Enter the player name");
              player2.setName(scanner.nextLine());
              //name=scanner.nextLine();
              System.out.println("Enter the country name");
              //country=scanner.nextLine();
              player2.setCountry(scanner.nextLine());
              System.out.println("Enter the skill");
              //skill=scanner.nextLine();
              player2.setSkill(scanner.nextLine());
              
              //System.out.println(player2.toString());
              System.out.println(player2.name+" --- "+player2.country+" --- "+player2.skill);
              
              if (player1.equals(player2)) {
                     System.out.println("Both the player details are same.");
              }
              else {
                     System.out.println("Both the player details are not same.");
              }
              scanner.close();
       }

}

