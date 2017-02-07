
import java.util.Scanner;


public class Main {

       public static void main(String[] args) throws Exception {
              Scanner sc= new Scanner(System.in);
              String s1= sc.nextLine();
              String s2= sc.nextLine();
              UserMainCode.displayDateDetails(s1, s2);
              sc.close();
       }

}
