//Count Node of LinkedList
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

	int countNode(){
		int count=0;

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
	void insertmid(int data){
		Node newnode=new Node(data);

		Node temp=head;
		int count=1;
		while(count<countNode()/2){
			count++;
			temp=temp.next;
		}
		
		newnode.next=temp.next;
		temp.next=newnode;		
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
		ll.insertmid(25);
		ll.print();
	}
}
