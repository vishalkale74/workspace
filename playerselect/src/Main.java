import java.util.Scanner;



public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		

		int[] arr=new int[3];
	for(int i=0;i<3;i++)
	{
		arr[i]=sc.nextInt();
	}
	int count=0;
	int count1=0;
	for(int i=0;i<3;i++)
	{
		if(arr[i]>=100)
			count++;
		if(arr[i]>=50)
			count1++;
	}
		if(count>=2)
			System.out.println("Selected");
		else if(count1==3)
			System.out.println("Selected");
		else if(count==1 || count1==2)
			System.out.println("Waitlisted");
		else
			System.out.println("Rejected");
}


		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	