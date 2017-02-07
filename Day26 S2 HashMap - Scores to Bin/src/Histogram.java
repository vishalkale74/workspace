import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Histogram {
	Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
	int a=0,b=0,c=0,d=0;
	
	public void addScore(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		for(int i=0;i<al.size();i++)
		{
			int n=al.get(i);
			if(n>=1 && n<=10)
				a++;
			else if(n>=11 && n<=20)
				b++;
			else
				if(n>=21 && n<=30)
					c++;
				else
					if(n>=31 && n<=40)
						d++;
		}
		map.put(10,a);
		map.put(20,b);
		map.put(30,c);
		map.put(40,d);
	}

	public void display() {
		System.out.println("Histogram");
		
		for (Map.Entry e : map.entrySet()){   
			
		        int key= (Integer) e.getKey();  
		        int v= (Integer) e.getValue();  
		        System.out.printf(key+" : ");  
		        for(int i=0;i<v;i++)
		        System.out.print("*");
		        System.out.println();
		    
		 }
		
	}

}
	
