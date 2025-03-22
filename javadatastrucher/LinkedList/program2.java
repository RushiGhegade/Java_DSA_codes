class Node{
	Node pre=null;
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node head=null;

	void addFirst(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}else{
			head.pre=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	void addlast(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}else{
			Node temp=head;

			while(temp.next!=null){

				temp=temp.next;
			}
			temp.next=newnode;
			newnode.pre=temp;
		}
	}
	void addpos(int data,int pos){

		if(pos<1 || pos>countnode()+1){
			System.out.println("Invalid Index");
		}
		if(pos==1){
			addFirst(data);
		}else if(pos==countnode()+1){
			addlast(data);
		}else{
			Node newnode=new Node(data);
			Node temp=head;

			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}
			newnode.next=temp.next;
			newnode.pre=temp;
			temp.next=newnode;
			newnode.next.pre=newnode;
			
		}	
	}
	int countnode()
	{	int count=0;
		if(head==null){
			return count;
		}else{
			
			Node temp=head;
			while(temp!=null){
				count++;
				temp=temp.next;
			}
			return count;
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

class Demo{
	public static void main(String args[]){
		LinkedList ll=new LinkedList();

		ll.addFirst(10);
		ll.addlast(12);
		ll.addlast(13);
		ll.addpos(10,2);
		//System.out.println(ll.countnode());
		ll.print();
	}
}
