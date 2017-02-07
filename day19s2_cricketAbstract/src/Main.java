import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Cricket Format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int choice= sc.nextInt();
		
	    
	   
	   double rr=0;
	   int ballsrem=0;
	   
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Enter the Current Score");
			int cScore=sc.nextInt(); 
		    System.out.println("Enter the Current Over");
		    float cOver= sc.nextFloat();
		    System.out.println("Enter the Target Score");
		    int tScore=sc.nextInt();
	    	 ODIMatch odi= new ODIMatch(cScore, cOver, tScore);
	    	 rr=(double)odi.calculateRunrate();
	    	 ballsrem=odi.calculateBalls();
	    	odi.display(rr, ballsrem);
	    	break;
	    case 2:
	    	System.out.println("Enter the Current Score");
			int cScore1=sc.nextInt(); 
		    System.out.println("Enter the Current Over");
		    int cOver1= sc.nextInt();
		    System.out.println("Enter the Target Score");
		    int tScore1=sc.nextInt();
	    	 T20Match t20= new T20Match(cScore1, cOver1, tScore1);
	    	 rr=(double)t20.calculateRunrate();
	    	 ballsrem=t20.calculateBalls();
	    	 t20.display(rr, ballsrem);
	    	
	    	break;
	    case 3:
	    	System.out.println("Enter the Current Score");
			int cScore2=sc.nextInt(); 
		    System.out.println("Enter the Current Over");
		    int cOver2= sc.nextInt();
		    System.out.println("Enter the Target Score");
		    int tScore2=sc.nextInt();
	    	 TestMatch test = new TestMatch(cScore2, cOver2, tScore2);
	    	 rr= (double)test.calculateRunrate();
	    	 ballsrem= test.calculateBalls();
	    	 test.display(rr,ballsrem);
	    	break;
	    	default :
	    		System.out.println("Invalid Format type");
	    }
	        sc.close();
	}

}


