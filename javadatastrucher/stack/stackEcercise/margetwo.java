// Marge two sorted stack

import java.util.*;
class Twostack{

	Stack marge(Stack<Integer> s1 , Stack<Integer> s2){
		Stack<Integer> s3=new Stack<Integer>();
		
		while(!s1.empty() && !s2.empty()){
			if(s1.peek()>s2.peek()){
				s3.push(s1.pop());
			}else{
				s3.push(s2.pop());
			}
		}

		while(!s1.empty()){
			s3.push(s1.pop());
		}

		while(!s2.empty()){
			s3.push(s2.pop());
		}
		
		while(!s3.empty()){
			s2.push(s3.pop());
		}

		return s2;
		
	}
}


class Main{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(1);
		s1.push(3);
		s1.push(5);
		s1.push(7);

		Stack s2=new Stack();
                s2.push(2);
                s2.push(4);
                s2.push(6);
                s2.push(8);
		s2.push(9);

		Twostack obj=new Twostack();
		
		Stack<Integer> s3=obj.marge(s1,s2);
		System.out.println(s3);

		System.out.println(s3.pop());
	}
}
