class Shape{
	protected static String shapeName;

	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	public Shape()
	{
		
	}
	
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public double calculateArea()
	{
		return 0.0;
	}
	
}