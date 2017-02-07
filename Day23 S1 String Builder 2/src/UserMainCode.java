
public class UserMainCode {
	public static void display(String a,String b)
	{
		String[] arr=a.split(" ");
		//StringBuilder sb=new StringBuilder(arr[1]);
		String[] arr1=b.split(" ");
		//StringBuilder sb1=new StringBuilder(arr1[1]);
		if(arr[1].equals(arr1[1]))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
