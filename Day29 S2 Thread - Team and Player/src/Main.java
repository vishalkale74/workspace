import java.util.Scanner;

public class Main 
{
	int value;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of Players");		
		int n = sc.nextInt();
		Main m = new Main();
		TeamThread t = new TeamThread(m, n);
		PlayerThread p = new PlayerThread(m,n);
		t.start();
		p.start();
		try 
		{
			t.join();
			p.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
		sc.close();
	}
}