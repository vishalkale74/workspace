import java.util.Scanner;


public class Main {

       public static void main(String[] args) {
              Scanner scanner= new Scanner(System.in);
              String battingTeam;
           long runs;
           System.out.println("Enter the values for Innings 1");
              System.out.println("Enter the BattingTeam");
              battingTeam=scanner.nextLine();
              System.out.println("Enter the runs scored");
              runs=scanner.nextLong();
              Innings innings1= new Innings(battingTeam,runs);
              scanner.nextLine();
              System.out.println("Enter the values for Innings 2");
              System.out.println("Enter the BattingTeam");
              battingTeam=scanner.nextLine();
              System.out.println("Enter the runs scored");
              runs=scanner.nextLong();
              Innings innings2= new Innings(battingTeam,runs);
              
              
              
              System.out.println("Innings 1 Details\nBattingTeam : "+innings1.battingTeam+"\nRuns scored : "+innings1.runs);
              System.out.println("Innings 2 Details\nBattingTeam : "+innings2.battingTeam+"\nRuns scored : "+innings2.runs);
              
              scanner.close();
       }

}
