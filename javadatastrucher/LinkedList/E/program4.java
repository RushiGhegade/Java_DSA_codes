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
	Node next=null;

	int data;
	Node(int data){
		this.data=data;
	}
}
class Linkedlist{
	
	Node Head=null;
	
	
	Node ret(){
		Node newnode=new Node(10);

		Head=newnode;
		return Head;
	}
}

class Main{

	public static void main(String args[]){

		Linkedlist l=new Linkedlist();

		Node ans=l.ret();
		System.out.println(ans);
	}
}
