public class Customer extends User {

		//fill the code
	private
	String deliveryAddress;
	int bonusPoints;
	String creditDetails;
	

		public String getDeliveryAddress() {
		return deliveryAddress;
	}


	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}


	public int getBonusPoints() {
		return bonusPoints;
	}


	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}


	public String getCreditDetails() {
		return creditDetails;
	}


	public void setCreditDetails(String creditDetails) {
		this.creditDetails = creditDetails;
	}


		public void displayDetails()
		{
		  	//fill the code
			System.out.println("Customer Details :");
			System.out.println("Name :"+getName());
			System.out.println("Username : "+getUsername());
			System.out.println("Password : "+getPassword());
			System.out.println("Email :"+getEmail());
			System.out.println("Phonenumber :"+getPhonenumber());
			System.out.println("Delivery address : "+getDeliveryAddress());
			System.out.println("Bonus points : "+getBonusPoints());
			System.out.println("Credit details : "+getCreditDetails());
			
		}
}

