
public class Rectangle extends Shape {
	 private int length;
	    private int breadth;
		@Override
		public float calculateArea() {
			float area=this.length*this.breadth;
			return area;
		}
		public Rectangle(String name, int length, int breadth) {
			super(name);
			this.length = length;
			this.breadth = breadth;
		}
		public Rectangle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Rectangle(String name) {
			super(name);
			// TODO Auto-generated constructor stub
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
		public void setBreadth(int  breadth) {
			this.breadth = breadth;
		}

}
