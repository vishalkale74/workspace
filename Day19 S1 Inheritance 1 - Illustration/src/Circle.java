
class Circle extends Shape
{
	private int radius;
	public Circle(int radius)
	{
		super("Circle");
		this.radius=radius;
	}
	public Circle()
	{
		
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//Shape shape=new Shape();
	public double calculateArea()
	{
		double area=Math.PI*radius*radius;
		//System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",area));
		return area;
	}
	}