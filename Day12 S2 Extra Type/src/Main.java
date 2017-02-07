import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the extratype details");
		String name=sc.nextLine();
		String[] name1;
		name1=name.split("#");
		System.out.println("ExtraType Details");
		System.out.println("Extra Type:"+name1[0]);
		System.out.println("Runs:"+name1[1]);
		
	}

}
