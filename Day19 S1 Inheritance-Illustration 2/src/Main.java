import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name, id, address, degree, stream, specialization;
		int age, noOfPapers, choice;
		double grade;
		System.out.println("Menu");
		System.out.println("1) Create a Student");
		System.out.println("2) Create a UG Student");
		System.out.println("3) Create a PG Student");
		System.out.println("Enter your choice");
 		choice = Integer.parseInt(br.readLine());
		System.out.println("Enter name");
		name = br.readLine();
		System.out.println("Enter id");
		id = br.readLine();
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter grade");
		grade = Double.parseDouble(br.readLine());
		System.out.println("Enter address");
		address = br.readLine();
		switch(choice)
		{
		case 1:
			Student student = new Student(name, id, age, grade, address);
			System.out.println("Student Details");
			student.display();
			if(student.isPassed())
				System.out.println("Result : Pass");
			else
				System.out.println("Result : Fail");
			break;
		case 2:
			System.out.println("Enter degree");
			degree = br.readLine();
			System.out.println("Enter stream");
			stream = br.readLine();
			UGStudent ugstudent = new UGStudent(name, id, age, grade, address, degree, stream);
			System.out.println("UG Student Details");
			ugstudent.display();
			if(ugstudent.isPassed())
				System.out.println("Result : Pass");
			else
				System.out.println("Result : Fail");
			break;
		case 3:
			System.out.println("Enter specialization");
			specialization = br.readLine();
			System.out.println("Enter number of papers published");
			noOfPapers = Integer.parseInt(br.readLine());
			PGStudent pgstudent = new PGStudent(name, id, age, grade, address, specialization, noOfPapers);
			System.out.println("PG Student Details");
			pgstudent.display();
			if(pgstudent.isPassed())
				System.out.println("Result : Pass");
			else
				System.out.println("Result : Fail");
			break;
		default:
			break;
		}
}
	
}
		
