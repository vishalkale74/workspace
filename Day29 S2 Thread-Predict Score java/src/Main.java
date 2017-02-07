import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t[] = new  Thread[2];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range of numbers");		
		int start = Integer.parseInt(s.nextLine());
		int end = Integer.parseInt(s.nextLine());	
		t[0]=new Thread(new Scores("Even", start, end));
		t[1]=new Thread(new Scores("Odd", start, end));	
		t[1].start();
		t[1].join();
		t[0].start();
		s.close();
	}
}
