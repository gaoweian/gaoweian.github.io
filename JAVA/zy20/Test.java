import java.util.*;
public class Test{
	 public static void main(String[] args){
		HashMap  hm = new  HashMap();
		//HashMap  hm=new  LinkedHashMap();
		hm.put("1","Eric");
		hm.put("2","Eric");
		hm.put("6","Eric");
		hm.put("3","Eric");
		hm.put("7","Eric");
		//hm.remove("4");
		//hm.clear();
		//hm.get("7");
		//System.out.println(hm.entrySet());
		Properties p = System.getProperties();
		p.list(System.out);
		/*Set keys = hm.keySet();//得到所有的key，并保存在一个Set中
		Iterator  itr  =  keys.iterator();
		while(itr.hasNext()){
			String key = (String)itr.next(); 
			String value = (String)hm.get(key);
			System.out.println(key+"------"+value);
		}*/
	 }
}


