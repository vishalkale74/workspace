import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
       public static void menu()
       {
              System.out.println("Verify and Update Venue Details\nMenu\n1.Update Venue Name\n2.Update City Name\n3.All informations Correct/Exit\nType 1 or 2 or 3");
       }

       public static void main(String[] args) throws Exception {
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the venue name");
              String v=br.readLine();
              System.out.println("Enter the city name");
              String c=br.readLine();
              Venue ven= new Venue();
              ven.setName(v);
              ven.setCity(c);
              ven.Venuedetails();
              //System.out.println("");
              menu();
              int choice=Integer.parseInt(br.readLine());
              while(true)
              {
              switch (choice)
              {
              case 1:
                     System.out.println("Enter the venue name");
                     String s1=br.readLine();
                     ven.setName(s1);
                     ven.Venuedetails();
                     menu();
                     //sc.nextLine();
                     choice=Integer.parseInt(br.readLine());
                     break;
                     
              case 2:
                     System.out.println("Enter the city name");
                     String s2=br.readLine();
                     ven.setCity(s2);
                     ven.Venuedetails();
                     menu();
                     //sc.nextLine();
                     choice=Integer.parseInt(br.readLine());
                     break;
                     
              case 3:
                     ven.Venuedetails();
                     System.exit(0);
                     break;
                     
                     
              }
              }

       }

}
