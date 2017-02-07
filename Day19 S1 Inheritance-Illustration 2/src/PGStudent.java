class PGStudent extends Student
{
	private String specialization;
	private int noOfPapersPublished;
	/*FILL CODE HERE*/
	public PGStudent(String name,String id,int age,double grade,String address,String specialization,int noOfPapersPublished)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
		this.specialization=specialization;
		this.noOfPapersPublished=noOfPapersPublished;
	}
	public PGStudent()
	{
		
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	public void setNoOfPapersPublished(int noOfPapersPublished) {
		this.noOfPapersPublished = noOfPapersPublished;
	}
	void display()
	{
		//System.out.println("PG Student Details");
		System.out.println("Name : "+this.getName());
		System.out.println("Id : "+this.getId());
		System.out.println("Age : "+this.getAge());
		System.out.println("Grade : "+this.getGrade());
		System.out.println("Address : "+this.getAddress());
		System.out.println("Specialization : "+this.getSpecialization());
		System.out.println("No. of papers published : "+this.getNoOfPapersPublished());
	}
	boolean isPassed()
	{
		if(this.getGrade()>70 && this.noOfPapersPublished>=2)
			return true;
		else
			return false;
	}
}
