

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		int durga= sc.nextInt();
		int pos[] = new int[3];
		
		for(int i=0;i<3;i++)
		{
			pos[i]= sc.nextInt();
		}
		Arrays.sort(pos);
		int total=sc.nextInt();
		total-=durga;
		int count=0;
		for(int i=0;i<3;i++ )
		{
			if(total>=pos[i])
			{
				count++;
				total-=pos[i];
			}
		}
		System.out.println(count);
		sc.close();
	}


}
