import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n,c=0;
		
		System.out.println("Enter the number of matches");
		n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		System.out.println("Enter the runs scored by the team");
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			boolean flag=true;
			for(int j=2;j<=al.get(i)/2;j++){
				int t=al.get(i)%j;
			if(t==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			c++;
		}
		}
		System.out.println("Number of prime scores : "+c);
		sc.close();
	}
}
