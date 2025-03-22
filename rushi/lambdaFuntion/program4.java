// lambda Funtion with Comparator

import java.util.*;
class Myclass{
	String name=null;
	int no=0;
	Myclass(String name,int no){
		this.name=name;
		this.no=no;
	}
	public String toString(){
		return name+""+no;
	}
}
class Demo{
	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add(new Myclass("Rushi",32));
		al.add(new Myclass("Ashish",34));
		al.add(new Myclass("Kiran",31));

		Collections.sort(al,(obj1,obj2)->{
				return ((Myclass)obj1).name. compareTo(((Myclass)obj2).name);
			}
		);

		System.out.println(al);
	}
}
