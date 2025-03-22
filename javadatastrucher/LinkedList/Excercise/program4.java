/// reverse the linkedlist
class Node{
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}

class Linkedlist{
	Node head=null;

	void add(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}else{
			Node temp=head;

			while(temp.next!=null){
				temp=temp.next;
			}

			temp.next=newnode;

		}
	}

	void print(){
		if(head==null){
			System.out.println("Linkedlist is Empty");
		}else{
			Node temp=head;

			while(temp.next!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
			
		}
	
	}

	void reverse(){
		Node pre=null;
		Node curr=head;
		Node For=null;

		while(curr!=null){
			For=curr.next;
			curr.next=pre;
			pre=curr;
			curr=For;
		}
		head=pre;
	}

}

class Demo{
	public static void main(String args[]){
		Linkedlist ll=new Linkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.print();
		ll.reverse();
		ll.print();
	}
}
