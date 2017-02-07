
public class Square extends Shape  {
	
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	
	@Override
	public float calculateArea() {
		float area=this.side*this.side;
		return area;
	}


	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Square(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}
	
	
}
