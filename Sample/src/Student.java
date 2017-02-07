import java.util.*;
class Student {
public static void main(String args[]) {
HashMap<String, Integer> obj = new HashMap<String, Integer>();
obj.put("A", new Integer(1));
obj.put("B", new Integer(2));
obj.put("C", new Integer(3));
System.out.println(obj.keySet());
}
}