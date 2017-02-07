import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		int n,c=0;
		String name;
		n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<n;i++)
			al.add(sc.nextLine());
		for(int i=0;i<al.size();i++)
		{
			name=al.get(i);
			String[] arr=name.split("-");
			if(arr[1].equals("0") && arr[2].equals("0"))
			{
				System.out.println(arr[0]);
				c++;
			}
		}
		if(c==0)
			System.out.println("No player has scored a duck");
		sc.close();
	}
}
