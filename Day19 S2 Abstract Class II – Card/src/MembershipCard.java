
public class MembershipCard  extends Card{

	private int rating;

	public MembershipCard(String holderName, String cardNumber,
			String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public MembershipCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MembershipCard(String holderName, String cardNumber,
			String expiryDate) {
		super(holderName, cardNumber, expiryDate);
		// TODO Auto-generated constructor stub
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
