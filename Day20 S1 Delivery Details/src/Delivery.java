
public class Delivery {

	 void displayDeliveryDetails(String bowler,String batsman)
	 {
		// System.out.println("Player details of the delivery:");
		 String[] arr=bowler.split(" ");
		 String[] arr1=batsman.split(" ");
		 System.out.println("Bowler : "+arr[1]);
		 System.out.println("Batsman : "+arr1[1]);
	 }
	 void displayDeliveryDetails(long runs)
	 {
		 System.out.println("Number of runs scored in the delivery : "+runs);
		 if(runs==(long)4)
			 System.out.println("It is a Boundary.");
		 if(runs==(long)6)
			 System.out.println("It is a Sixer.");
	 }
}
