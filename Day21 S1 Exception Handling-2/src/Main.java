import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the number of overs");
			int overs=Integer.parseInt(br.readLine());
			if(overs<0)
			{
				throw new NegativeArraySizeException();
			}
			System.out.println("Enter the number of runs for each over");
			int[] arr=new int[overs];
			for(int i=0;i<overs;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter the over number");
			int oNo=Integer.parseInt(br.readLine());
			if(oNo>overs)
				throw new ArrayIndexOutOfBoundsException();
			System.out.println(arr[oNo-1]);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		} 
	}

}
