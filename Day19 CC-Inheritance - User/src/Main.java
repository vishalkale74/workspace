import java.io.IOException;
import java.util.Scanner;


class Main { 

public static void main(String args[]) throws IOException  { 

//fill the code
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the user :");
	String name=sc.nextLine();
	System.out.println("Enter the username :");
	String username=sc.nextLine();
	System.out.println("Enter the password :");
	String password=sc.nextLine();
	System.out.println("Enter the email :");
	String email=sc.nextLine();
	System.out.println("Enter the phonenumber :");
	String phonenumber=sc.nextLine();
	System.out.println("Enter the type of user\n1.Customer\n2.Seller");
	switch(sc.nextInt())
	{
	case 1:
			System.out.println("Enter the delivery address :");
			String deliveryAddress=sc.nextLine();
			System.out.println("Enter the bonus points :");
			int bonus=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the credit details :");
			String creditDetails=sc.nextLine();
			User user=new User();
			Customer c=new Customer();
			user.displayDetails();
			c.displayDetails();
			break;
	case 2:	
			System.out.println("Enter the description :");
			String description=sc.nextLine();
			System.out.println("Enter the rating :");
			double rating=sc.nextDouble();
			User user1=new User();
			Seller s=new Seller();
			user1.displayDetails();
			s.displayDetails();
			break;
	}

}

 
}

