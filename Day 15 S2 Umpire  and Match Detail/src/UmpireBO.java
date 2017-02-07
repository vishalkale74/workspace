import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
    //fill your code
	 Umpire umpire=null;
	 String arr[]=data.split(",");
	 for(int i=0;i<umpireTypeList.length;i++)
	 {
		 if(arr[1].equals(umpireTypeList[i].getType()))
		 {
			 umpire=new Umpire(arr[0],umpireTypeList[i]);
		 }
	 }
	 return umpire;
}
}
