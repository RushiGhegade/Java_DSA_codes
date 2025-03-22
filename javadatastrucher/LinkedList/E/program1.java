class Node{

	Node pre=null;
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}

class Dubblyll{

	Node head=null;

	void addFirst(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;			
		}else {

			newnode.next=head;
			head.pre=newnode;
			head=newnode;
		}
	}

	void print(){
		
		if(head==null){
			System.out.println("Linkedlist Is empty");
		}else{
			Node temp=head;

			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}System.out.println();
		}
	}

	void addpos(int data,int pos){

		Node newnode=new Node(data);

		if(head==null){
			head=newnode;
		}else{
			Node temp=head;
			while(pos-2!=0){
				temp=temp.next;			
				pos--;	
			}
			temp.next.pre=newnode;
			newnode.next=temp.next;
			newnode.pre=temp;
			temp.next=newnode;
					
		}
	}


}

class Main{

	public static void main(String args[]){
		Dubblyll ll=new Dubblyll();


		ll.print();
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addFirst(5);
		ll.addFirst(3);
		ll.addFirst(1);
		ll.print();

		ll.addpos(4,3);

		ll.print();

	}

}
