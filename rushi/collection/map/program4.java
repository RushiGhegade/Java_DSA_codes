// Garbeg Collector
import java.util.*;
class Demo{
	Demo(){
		System.out.println("in Demo Constructor");
	}
	public void finalize(){
		System.out.println("Notify");
	}

}
class Pro{
	public static void main(String args[]){
		Demo obj=new Demo();
		Demo obj1=new Demo();
		Demo obj2=new Demo();

		System.out.println(obj);
		System.out.println(obj1);
		obj=null;
		System.gc();		
		System.out.println(obj);
 				 
	}
}
