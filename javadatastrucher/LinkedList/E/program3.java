// swap k index

class Node{
	Node next=null;
	int data;

	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	
	Node head=null;

	void addfirst(int data){

		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}else{
			newnode.next=head;
			head=newnode;
		}
	}

	void print(){
		Node temp=head;

		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
}

class Main{
	public static void main(String args[]){
		LinkedList ll=new LinkedList();

		ll.addfirst(10);
		ll.addfirst(20);
		 ll.addfirst(30);
		  ll.addfirst(40);

		  ll.print();
	}
}
