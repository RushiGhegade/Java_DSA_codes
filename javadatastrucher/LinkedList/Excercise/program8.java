/*
10. Identical Linked Lists
Given two Singly Linked List of N and M nodes respectively. The task is to check whether two
linked lists are identical or not.
Two Linked Lists are identical when they have the same data and with the same arrangement
too.
Example 1:
Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: Not identical
Example 2:
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5
*/
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
}

class Demo{
	public static void main(String args[]){
		Linkedlist ll=new Linkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.print();

		Linkedlist ll1=new Linkedlist();
                ll1.add(10);
                ll1.add(20);
                ll1.add(30);
                ll1.add(50);
                ll1.print();
		
		int len1=ll.countNode();	
		int len2=ll1.countNode();

		if(len1!=len2){
			System.out.println("Not Identical");
		}else{
			int count=0;
			Node temp1=ll.head;
			Node temp2=ll1.head;
			while(temp1!=null ){
				if(temp1.data==temp2.data){
					count++;
				}
				temp1=temp1.next;
				temp2=temp2.next;
			}
			if(count==len1){
				System.out.println("Identical");
			}else{
				System.out.println("Not Identical");
			}
		}

		
	}
}
