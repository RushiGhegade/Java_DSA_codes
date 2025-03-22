// Garbege Collector in hashmap

import java.util.*;
class Demo{
	String name=null;
	Demo(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	public void finalize(){
		System.out.println("Notify");
	}
	
}
class Pro{
	public static void main(String args[]){
		Demo obj1=new Demo("Android");
		Demo obj2=new Demo("ios");
		Demo obj3=new Demo("Windows");
		
		HashMap hs=new HashMap();
		hs.put(obj1,"Google");
		hs.put(obj2,"Apple");
		hs.put(obj3,"Microsoft");

		System.out.println(hs);

		obj1=null;
		obj2=null;
		System.gc();              // Garbege Collector not take part in HashMap

		System.out.println(obj1);

	}
}
