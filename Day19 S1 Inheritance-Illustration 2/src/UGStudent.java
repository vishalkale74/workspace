class UGStudent extends Student
{
	private String degree;
	private String stream;
	/*FILL CODE HERE*/
	public UGStudent(String name,String id,int age,double grade,String address,String degree,String stream)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
		this.degree=degree;
		this.stream=stream;
	}
	public UGStudent()
	{
		
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	void display()
	{
		System.out.println("Name : "+this.getName());
		System.out.println("Id : "+this.getId());
		System.out.println("Age : "+this.getAge());
		System.out.println("Grade : "+this.getGrade());
		System.out.println("Address : "+this.getAddress());
		System.out.println("Degree : "+this.getDegree());
		System.out.println("Stream : "+this.getStream());
	}
	boolean isPassed()
	{
		if(this.getGrade()>70)
			return true;
		else
			return false;
	}
}
	
