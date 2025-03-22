// stack implementation (using SingleLinkedlist)


class Node{
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}

class linkedlist{
	Node head=null;
	int top=-1;
	
	

	void push(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			top++;		
		}else{
			top++;
			newnode.next=head;
			head=newnode;
		}
	}

	int size(){
		return top;
	}

	boolean isempty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}

	int pop(){
		if(head==null){
			System.out.println("Linkedlist is empty can't be pop");
			return -1;
		}else{
			int val=head.data;
			top--;
			head=head.next;
			return val;
		}
	}
	
	 int peek(){
                if(head==null){
                        System.out.println("Linkedlist is empty can't be pop");
                        return -1;
                }else{
                        return head.data;
                }
        }
}

class Main{
	public static void main(String args[]){
		linkedlist ll=new linkedlist();

		boolean val=ll.isempty();
                System.out.println(val);

		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);

		int sz=ll.size()+1;
		System.out.println(sz);

		val=ll.isempty();
                System.out.println(val);

		int  data=ll.pop();
                System.out.println(data+" is poped");

		int   p=ll.peek();
                System.out.println(p);


	}
}
