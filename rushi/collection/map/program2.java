// LinkedHashMap
// insertion order preserve
// take new updated value
import java.util.*;
class Demo{
	public static void main(String args[]){
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("Android","Google");
		lhm.put("ios"    ,"Apple");
		lhm.put("Window" ,"Microsoft");
		lhm.put("Android","Universal");

		System.out.println(lhm);
	}
}
