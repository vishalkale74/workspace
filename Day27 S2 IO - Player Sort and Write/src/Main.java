import java.io.*;
public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		InputStream i=new FileInputStream(new File("input.txt"));
		FileUtility fu=new FileUtility();
		fu.writeDataToFile(fu.readFileData(i));
		
	}
	

}
