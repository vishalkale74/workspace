import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int side;
		System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
		int shapeType=sc.nextInt();
		Shape shape=new Shape();
		switch(shapeType)
		{
		case 1: System.out.println("Enter length and breadth:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Rectangle rec=new Rectangle(length,breadth);
		//rec.calculateArea();
		System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",rec.calculateArea()));
		break;
		case 2: System.out.println("Enter side:");
		side=sc.nextInt();
		Square sq=new Square(side);
		//sq.calculateArea();
		System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",sq.calculateArea()));
		break;
		case 3: System.out.println("Enter Radius:");
		int radius=sc.nextInt();
		Circle circle=new Circle(radius);
		//circle.calculateArea();
		System.out.print("Area of "+shape.getShapeName()+" is:"+String.format("%.2f",circle.calculateArea()));
		break;
		}
		sc.close();
	}

}
