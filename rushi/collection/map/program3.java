// identityHashMap
// duplicate data allowed when we can create a key with new 
// without new it is not duplicate 

import java.util.*;
class Demo{
	public static void main(String args[]){
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(new String("rushi"),"Vdd");
		ihm.put(new String("rushi"),"Ctbc");
		ihm.put(new String("rushi"),"Zeal");
		System.out.println(ihm);

		IdentityHashMap ihm1=new IdentityHashMap();
                ihm1.put(new Integer(1),"Vdd");
                ihm1.put(new Integer(1),"Ctbc");
                ihm1.put(new Integer(1),"Zeal");
                System.out.println(ihm1);

		IdentityHashMap ihm2=new IdentityHashMap();
                ihm2.put(1,"Vdd");
                ihm2.put(1,"Ctbc");
                ihm2.put(1,"Zeal");
		System.out.println(ihm2);


	}
}
