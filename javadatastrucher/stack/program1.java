// Stack Implementation(using Array)

import java.util.*;
class stack{
	int stacksize;
	int stackarr[];
	int top=-1;

	stack(int size){
		this.stackarr=new int[size];
		this.stacksize=size;
	}
	
	void push(int data){
		if(top==stacksize-1){
			System.out.println("stack is Overflow");
		}else{
			top++;
			stackarr[top]=data;
		}	
	}
	
	boolean empty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	
	}

	int pop(){
		if(empty()){
			System.out.println("stack is empty can't pop");
			return -1;
		}else{
			int val=stackarr[top];
			top--;
			return val;
		}
	}

	int size(){
		return top;
	}

	int peek(){
		if(empty()){
			System.out.println("stack is empty can't peek");
                        return -1;
		}else{
			return stackarr[top];
		}
	
	}

	void print(){
		if(empty()){
			System.out.println("Stack is empty Nothing to print:");
		}else{
			System.out.print("[ ");
			for(int val=0;val<=top;val++){
				System.out.print(stackarr[val]+" ");
			}System.out.println(" ]");
		}
	}
}

class Client{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stack size");
		int size=sc.nextInt();

		stack s=new stack(size);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.print();
		boolean val=s.empty();
		System.out.println(val);

		int data=s.pop();
		System.out.println(data+" poped");

		int sz=s.size()+1;
		System.out.println(sz);

		int p=s.peek();
		System.out.println(p);

		 sz=s.size()+1;
                System.out.println(sz);

		s.print();

		data=s.pop();
                System.out.println(data+" poped");

		 s.print();

		 data=s.pop();
                System.out.println(data+" poped");

                 s.print();

	}
}
