import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner tom=new Scanner(System.in);
String a=tom.nextLine();
UserMainCode us=new UserMainCode();
if(us.validatePlayer(a))
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
}
}
