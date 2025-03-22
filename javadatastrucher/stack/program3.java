// stack implementation using (Dubbly linkedlist)

class Node{
	Node pre=null;
	int data;
	Node next=null;
	
	Node(int data){
		this.data=data;
	}
}
class Linkedlist{

	Node top=null;

	void push(int data){
		Node newnode=new Node(data);

		if(top==null){
			top=newnode;
			System.out.println(data+" push successfully");
			
		}else{
		
			newnode.next=top;
			top.pre=newnode;
			top=newnode;
			System.out.println(data+" push successfully");
		}
	}

	boolean empty(){

		if(top==null)
			return true;
		else
			return false;

	}

	int pop(){
		if(empty()){
			System.out.println("Can't be delete becuase linkedlist is empty");
			return -1;
		}else if(top.next==null){
			int val=top.data;
                        top=null;
                        return val;
                        
		}else{
			int val=top.data;
			top=top.next;
			top.pre=null;
			return val;
		}
	}
	
	int peek(){
		if(empty())
			return -1;
		else
			return top.data;
	}

	int size(){
		Node temp=top;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	
	}

	void print(){
		Node temp=top;

		while(temp.next!=null){
			temp=temp.next;
		}

		while(temp.pre!=null){
			System.out.print(temp.data+"->");
			temp=temp.pre;
		}
		System.out.println(temp.data);
	}

}

class Main{
	public static void main(String args[]){

		Linkedlist ll=new Linkedlist();	

		boolean val=ll.empty();
                System.out.println(val);

		ll.push(10);
		ll.push(20);
		ll.push(30);
		
		val=ll.empty();
		System.out.println(val);

		int data=ll.pop();
		System.out.println(data+" POP Successfully");

		int p=ll.peek();
		System.out.println(p+" peek element");

		p=ll.size();
                System.out.println(p+" Node in linkedlist");

		ll.print();
	}
}
