/*
9. Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with
duplicate values) from the given list (if exists).

Note: Try not to use extra space. The nodes are arranged in a sorted way.
Example 1:
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time. So we need
to remove it once.
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
	void removeDuplicate(){
		Node pre=null;
		Node curr=head;
		Node For=curr;

		while(For.next!=null){
			For=curr.next;
			pre=curr;
			curr=For;
			System.out.println(pre.data+" = "+For.data);	
			if(pre.data==For.data){
				pre.next=For.next;
			}
		}
	}
}

class Demo{
	public static void main(String args[]){
		Linkedlist ll=new Linkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add(40);
		ll.print();
		ll.removeDuplicate();
		ll.print();
	}
}
