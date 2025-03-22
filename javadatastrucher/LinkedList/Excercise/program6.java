/*
7. Swap Kth nodes from ends
Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the
beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not
change the content of the nodes.

Example 1:
Input:
N = 4, K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after swapping the 1st node from the beginning and end the
new list will be 4 2 3 1.
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
	// swap Position Node
	void swap(int k){

		int n=countNode();

		if(k>n){
			System.out.println("Invalid Index");
		}else {

			Node f1=head;
			Node f2=head.next;
			Node l1=head;
			Node l2=head.next;
			int m=1;
			while(k-1!=m){
				f1=f1.next;
				f2=f2.next;
				m++;
			}
			m=1;
			while(m!=n-k+1){
				l1=l1.next;
				l2=l2.next;
				m++;
			}

			System.out.println("l1->"+l1.data+" l2->"+l2.data+" f1->"+f1.data+" f2->"+f2.data);
			
		}








	}
	// Only data swap
	void swapKnode(int k){
		if(k>countNode()){
			System.out.println("Invalid Index");
		}else{
			Node temp=head;
			Node temp1=head;
			while(k-1!=0){
				temp=temp.next;
				k--;
			}
			while(temp1.next!=null){
			temp1=temp1.next;
			}
	
			int t=temp.data;
			temp.data=temp1.data;
			temp1.data=t;
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
		ll.add(50);
		ll.print();
		
		int k=2;
		ll.swap(k);

		

	}
}
