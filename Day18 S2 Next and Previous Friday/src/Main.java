import java.util.*;
import java.text.*;
import java.lang.*;
public class Main {
                public static void main(String[] args) throws Exception {
                                
                
                Scanner tom=new Scanner(System.in);
                System.out.println("Enter year in Integer");
                int y=tom.nextInt();
                System.out.println("Enter Month in Integer");
                int m=tom.nextInt();
                System.out.println("Enter date in Integer");
                int d=tom.nextInt();
                String p,q,r;
                p=Integer.toString(y);
                q=Integer.toString(m);
                r=Integer.toString(d);
                String b=p;
                b=b.concat("-").concat(q).concat("-").concat(r);
                //System.out.println(b);
                String a="yyyy-MM-dd";
                UserMainCode de=new UserMainCode();
               de.displayDate(a,b);
               
tom.close();
}
}
