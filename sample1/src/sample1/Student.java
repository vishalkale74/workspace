package sample1;

import java.io.*;
class filesinputoutput {
public static void main(String args[]) throws IOException {
InputStream obj = new FileInputStream("inputoutput.java");
System.out.print(obj.available());
}
}