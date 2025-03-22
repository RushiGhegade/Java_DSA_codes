// Implement Queue Using Two Stack ;

import java.util.*;
class Demo{

	void enqueue(Stack s,int k){
		
		s.push(k);
	}

	int dequeue(Stack s){
		
		if(s.empty()){
			return -1;
		}else{

			Stack s1=new Stack();
			while(!s.empty()){
				s1.push((int)s.pop());
			}

			int val=(int)s1.pop();

			while(!s1.empty()){
				s.push((int)s1.pop());
			}

			return val;
		}
	}
	public static void main(String args[]){
		
		// 1,2,3,4,5

		Stack s=new Stack();

		Demo obj=new Demo();

		obj.enqueue(s,10);

		System.out.println(s);

		obj.enqueue(s,20);

                System.out.println(s);

		obj.enqueue(s,30);

                System.out.println(s);

		int val=obj.dequeue(s);
		System.out.println(val);

		System.out.println(s);

	}
}
