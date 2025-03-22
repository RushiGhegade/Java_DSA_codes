import java.util.Scanner;
import java.util.*;
class Employee implements Comparable{
	String name=null;
	int sal=0;
	Employee(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	public String toString(){
		return "{"+name+":"+sal+"}";
	}
	public int compareTo(Object obj){
		//return name.compareTo(((Employee)obj).name);
		return sal-((Employee)obj).sal;
	}
}
class sortByname implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
	}
}
class sortBysal implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Employee)obj1).sal - ((Employee)obj2).sal;
	}
}
class sort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the Employee name & salary");
		
		for(int i=1;i<=5;i++){
			System.out.println(i);
			String name=sc.next();
			int sal=sc.nextInt();
			al.add(new Employee(name,sal));
		}


		/*al.add(new Employee("rushi",100000));
		al.add(new Employee("ashish",500000));
		al.add(new Employee("rushi",200000));
		al.add(new Employee("sam",300000));*/

		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al,new sortByname());
		System.out.println(al);

		Collections.sort(al,new sortBysal());
		System.out.println(al);
	}
}
