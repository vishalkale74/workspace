import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0,sump=0;
	ArrayList<Integer> al=new ArrayList<Integer>();
	for (int i=0; i<n; i++)
		al.add(sc.nextInt());	
    for(int i=0;i<n;i++)
    {
                    sump=0;
                    int m=al.get(i);
                    while(m!=0)
                    {
                                    int a=m%10;
                                    if(a==7)
                                    {
                                                    sump=0;
                                    }
                                    else
                                    {
                                                    sump=sump+a;
                                    }
                                    m=m/10;
                    }
                    sum=sum+sump;
    }
    System.out.println(sum);

	sc.close();
	} 
} 
