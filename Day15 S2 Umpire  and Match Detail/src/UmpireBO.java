import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
    String str[]=data.split(",");
    Umpire u=null;
    for(int i=0;i<umpireTypeList.length;i++){
    	if(umpireTypeList[i].getType().equals(str[1])){
    		u=new Umpire(str[0],umpireTypeList[i]);//fill your code
    	}
    }
    return u;
 }

}
