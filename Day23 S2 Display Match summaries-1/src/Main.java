import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		StringTokenizer st=new StringTokenizer(name," ");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		String[] arr=name.split(" ");
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[n-i-1]+" ");
		sc.close();
	}

}
