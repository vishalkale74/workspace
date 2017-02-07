class Student
{
	protected String name;
	protected String id;
	protected int age;
	protected double grade;
	protected String address;
	/*FILL CODE HERE*/
	public Student(String name,String id,int age,double grade,String address)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
	}
	public Student()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void display()
	{
		System.out.println("Name : "+this.getName());
		System.out.println("Id : "+this.getId());
		System.out.println("Age : "+this.getAge());
		System.out.println("Grade : "+this.getGrade());
		System.out.println("Address : "+this.getAddress());
	}
	boolean isPassed()
	{
		if(this.getGrade()>50)
			return true;
		else
			return false;
	}
}
	
