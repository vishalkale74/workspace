import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class LetterSequence {
	private String sentence;
	int count=0;
	public TreeMap<Character,Integer> computeFrequency(String sentence)
	{
		this.sentence=sentence;
		TreeMap tm = new TreeMap();
		String a[]=this.sentence.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length();j++)
			{
				count=0;
				for(int k=0;k<this.sentence.length();k++)
				{
					
					if(a[i].charAt(j)==(this.sentence.charAt(k)))
					{
						count++;
					}
				}
				tm.put(a[i].charAt(j), count);
			}
		}
		return tm;
	}
	public void displayLetterFrequency(TreeMap frequencyMap)
	{
		Set set = frequencyMap.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + " : ");
	         int r= (Integer) me.getValue();
	         for(int p=0;p<r;p++)
	         {
	        	 System.out.print("*");
	         }
	         System.out.print("\n");
	      }
	}
}
