import java.util.Scanner;


public class Main {

       public static void main(String[] args) {
              Scanner scanner= new Scanner(System.in);
              System.out.println("Enter the number of venues");
              int n= scanner.nextInt();
              scanner.nextLine();
              Venue[] venues= new Venue[n];
              for (int i = 0; i < n; i++) {
                     System.out.println("Enter the details of venue "+(i+1));
                     String inpString=scanner.nextLine();                   
                     String[] a = new String[2];
                     a = inpString.split(",");
                     venues[i]=new Venue(a[0],a[1]);
              }
              System.out.println("Venue Details");
              for (int i = 0; i < venues.length; i++) {
                     System.out.println("Venue Name : "+venues[i].name);
                     System.out.println("City Name : "+venues[i].city);
              }
              
              scanner.close();

       }

}
