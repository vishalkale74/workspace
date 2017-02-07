

class Square extends Shape
{
	private int side;
	public Square(int side)
	{
		super("Square");
		this.side = side;
	}
	public Square()
	{
		
	}
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	//Shape shape=new Shape();
	public double calculateArea()
	{
		double area=side*side;
		//System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",area));
		return area;
	}
	}