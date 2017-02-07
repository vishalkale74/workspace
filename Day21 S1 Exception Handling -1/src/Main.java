import java.io.*;
import java.text.*;
public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int runs,overs;
		float rr;
		try {
			System.out.println("Enter the total runs scored");
			runs=Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			overs=Integer.parseInt(br.readLine());
			if(overs==0)
				throw new ArithmeticException();
			rr=(float)runs/overs;
			System.out.printf("Current Run Rate : %.2f",rr);			
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
		
	}

}
