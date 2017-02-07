
class Rectangle extends Shape
{
	private int length,breadth;
	public Rectangle(int length,int breadth)
	{
		super("Rectangle");
		this.length = length;
		this.breadth=breadth;
	}
	public Rectangle()
	{
			
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	//Shape shape=new Shape();
	public double calculateArea()
	{
		double area=length*breadth;
		//System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",area));
		return area;
	}
	}