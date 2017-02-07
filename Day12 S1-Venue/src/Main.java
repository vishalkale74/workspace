import java.util.Scanner;
class Main{
public static void main(String[] args)
{
	String pName,cName;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the venue name");
	pName=sc.nextLine();
	System.out.println("Enter the city name");
	cName=sc.nextLine();
	Venue v=new Venue();
	v.name=pName;
	v.city=cName;
	System.out.println("Venue Details :");
	System.out.println("Venue Name : "+v.name);
	System.out.println("City Name : "+v.city);
	sc.close();
	}
}