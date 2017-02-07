import java.util.Scanner;


public class Main {

       public static void main(String[] args)  {
              Scanner scanner= new Scanner(System.in);

              System.out.println("Enter the number of wickets");
              int n= scanner.nextInt();
              scanner.nextLine();
              Wicket[] wicket= new Wicket[n];
              for (int i = 0; i < n; i++) {
                     System.out.println("Enter the details of wicket "+(i+1));
                     String inpString=scanner.nextLine();                   
                     String[] a = new String[5];
                     a = inpString.split(",");
                     wicket[i]=new Wicket(Long.parseLong(a[0]),Long.parseLong(a[1]),a[2],a[3],a[4]);
              }
              System.out.println("Wicket Details");
              for (int i = 0; i < wicket.length; i++) {
                     System.out.println("Over : "+wicket[i].over);
                     System.out.println("Ball : "+wicket[i].ball);
                     System.out.println("Wicket Type : "+wicket[i].wicketType);
                     System.out.println("Player Name : "+wicket[i].playerName);
                     System.out.println("Bowler Name : "+wicket[i].bowlerName);
              }
              
              
              
              scanner.close();
              
       }

}
