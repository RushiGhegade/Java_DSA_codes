import java.util.*;
class Main{
	public static void main(String args[]){
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		int x=5;
		/*for(int i=0;i<s.size();i++){

			
			int temp=(int)s.elementAt(i);
			s.insertElementAt(i,x);
			x=temp;			

			
		}*/
		s.insertElementAt(x,0);

		System.out.println(s);
	}
}
