import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	name;
		String	city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue details");
		String details=sc.nextLine();
		String details1[]=details.split(",");
		name=details1[0];
		city=details1[1];
		Venue v=new Venue();
		v.name=name;
		v.city=city;
		System.out.println("Venue Details");
		System.out.println("Venue Name : "+v.name);
		System.out.println("City Name : "+v.city);
		sc.close();
	}
}
