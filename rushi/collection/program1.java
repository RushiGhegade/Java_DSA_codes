import java.util.*;
class Demo extends ArrayList{
	public static void main(String args[]){
		//Demo al=new Demo();
		ArrayList al=new ArrayList();
		// 1) add(E);
		al.add(10);
		al.add(20.5f);
		al.add("Rushi");
		al.add(10);
		al.add(20.5f);

		// 2) int Size();
	       System.out.println(al.size());       // 5

		// 3) Bollean Contains(obj);
		System.out.println(al.contains(10));  // true
 		System.out.println(al.contains(5));   // false

		// 4) int indexof(obj);
		System.out.println(al.indexOf(10));     // 0
		System.out.println(al.indexOf(20.5f));	// 1
		System.out.println(al.indexOf(5));      // -1

		// 5) int lastIndexOf(obj);
		System.out.println(al.lastIndexOf(10)); // 4
		System.out.println(al.lastIndexOf(5));  // -1
							
		// 6) obj get(int);
		System.out.println(al.get(2));            // Rushi
		//System.out.println(al.get(10));         // Exception :IndexOutOfBoundException
		
		// 7) E set(int , E);
		System.out.println(al.set(3,"Ghegade"));  //  10
	        
	        // 8) void add(int ,E);
		al.add(3,"IT");
		System.out.println(al);

		// 9) E remove(obj);
		al.remove(3);	
		System.out.println(al);

		// 10) Boolean addAll(collection);
		ArrayList al2=new ArrayList();
		al2.add("Rushi");
		al2.add("Ghegade");
		al2.add("Information Technology");

		// addAll(collection);
		al.addAll(al2);
		System.out.println(al);

		// 11) addAll(int ,collection);
		al.addAll(3,al2);
		System.out.println(al);

		// 12) void removeRange(int ,int);
		al.removeRange(3,7);
		System.out.println(al);

		// 13) Object[] toArray();
		Object arr[]=al.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();

		// 14) sort();
		al.sort(arr);
		System.out.println(al);
	}
}








