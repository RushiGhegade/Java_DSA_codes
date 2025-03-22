// reverse Linkedlist

class Node {
	Node next=null;
	int data;

	Node(int data){
		this.data=data;
	}
}

class Linkedlist{

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
			
			if(head==null){
				System.out.println("Linkedlist is empty");
			}else{
			
				Node temp=head;

				while(temp!=null){
					System.out.print(temp.data+" ");
					temp=temp.next;
				}System.out.println();
			}
		
		}

		void reverse(){
			Node pre=null;
			Node curr=head;
			Node forw=null;
			
			while(curr!=null){
				forw=curr.next;
				curr.next=pre;
				pre=curr;
				curr=forw;	
			}
			head=pre;
		}
}

class Main{
	
	public static void main(String args[]){
		
		Linkedlist ll=new Linkedlist();
		ll.print();
		ll.addfirst(30);
		ll.addfirst(20);
		ll.addfirst(10);
		ll.addfirst(0);
		ll.print();

		ll.reverse();

		ll.print();

	}
}

