
public class Circle extends Shape {
	  private int radius;
      final float pi=(float)3.14;
	@Override
	public float calculateArea() {
	   float area=pi*this.radius*this.radius;
		return area;
	}

	public Circle(String name, Integer radius) {
		super(name);
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
