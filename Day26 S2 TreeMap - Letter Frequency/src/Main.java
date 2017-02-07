import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String sentence=sc.nextLine();
		LetterSequence ls=new LetterSequence();
		TreeMap sp = new TreeMap();
		sp=ls.computeFrequency(sentence);
		ls.displayLetterFrequency(sp);
		sc.close();
	}
}