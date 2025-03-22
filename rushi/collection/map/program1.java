// duplicate data are updated in HashMap
// insertion order are not preserve in hashMap


import java.util.*;
class Employee{
	String name=null;
	Employee(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
class Demo{
	public static void main(String args[]){
		HashMap hs1=new HashMap();
		hs1.put("rushi","IT");
		hs1.put("ashish","ARMAY");
		hs1.put("abhii","ITI");
	//	hs1.put("rushi","piloat");

		System.out.println(hs1);

		HashMap hs2=new HashMap();
		hs2.put(new Integer(112),"rushi");
		hs2.put(new Integer(116),"ashish");
		hs2.put(new Integer(113),"abhii");
		hs2.put(new Integer(111),"ram");

		System.out.println(hs2);

		HashMap hs3=new HashMap();
		hs3.put(new Employee("Rushi"),20000);  //insertion order preserve in userdefine class in hashmap
		hs3.put(new Employee("ashish"),30000);	
		hs3.put(new Employee("abhii"),10000);
		hs3.put(new Employee("ashish"),100000);
		System.out.println(hs3);



	}
}
