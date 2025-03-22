//Count the loop node
import java.util.*;
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
	int looplength(int c){
		Node temp=head;
		int count=0;
		while(c-1!=0){
			temp=temp.next;
			c--;
		}

		while(temp!=null){
			count++;
			temp=temp.next;
		}

		return count;
	}
}

class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Linkedlist ll=new Linkedlist();
		ll.add(1);
		ll.add(0);
		/*ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);
		ll.add(90);*/
		ll.print();
		System.out.println("Enter the c vallue:");
		int c=sc.nextInt();
		int count=ll.looplength(c);
		System.out.println(count);		
	}
}
