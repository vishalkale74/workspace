public class Seller extends User 
{
		//fill the code
	private
	String description;
	double rating;
	
	public Seller(String desciption,double rating)
	{
		this.description=desciption;
		this.rating=rating;
	}
	public Seller()
	{
		
	}
		
		public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


		public void displayDetails()
		{
			
			//fill the code
			System.out.println("Seller Details :");
			System.out.println("Name :"+getName());
			System.out.println("Username : "+getUsername());
			System.out.println("Password : "+getPassword());
			System.out.println("Email :"+getEmail());
			System.out.println("Phonenumber :"+getPhonenumber());
			System.out.println("Description : "+getDescription());
			System.out.println("Rating : "+getRating());

		}
}

