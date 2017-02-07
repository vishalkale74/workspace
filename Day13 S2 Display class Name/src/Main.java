import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ;
		String city ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		System.out.println("Enter the city name");
		city=sc.nextLine();
		Venue V=new Venue();
		V.setName(name);
		V.setCity(city);
		System.out.println("Venue Details");
		System.out.println(V.toString());
	}

}
