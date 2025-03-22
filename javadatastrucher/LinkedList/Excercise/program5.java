/*6. Add two numbers represented by Linked List
Given two numbers represented by two linked lists, write a function that returns a Sum list. The
sum list is a linked list representation of addition of two input numbers.
Example 1:
Input:
S1 = 3, S2 = 3
ValueS1 = {2,3,4}
ValueS2 = {3,4,5}
Output: 5 7 9
Explanation: After adding the 2 numbers the resultant number is 5 7 9.i*/


// using singly linked list
//    2->3->4
//    3->4->5
//ans 5->7->9
// above problem use dubbly linkedlist
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

	void reverse(){
		Node pre=null;
		Node curr=head;
		Node For=null;

		while(curr!=null){
			For=curr.next;
			curr.next=pre;
			pre=curr;
			curr=For;
		}
		head=pre;	
	}

}

class Demo{
	public static void main(String args[]){
		Linkedlist ll=new Linkedlist();
		ll.add(9);
		//ll.add(3);
		//ll.add(4);
		ll.print();

		Linkedlist ll1=new Linkedlist();
                ll1.add(8);
                ll1.add(7);
                //ll1.add(5);
                ll1.print();
		
		Linkedlist ll2=new Linkedlist();

		int sum=0;
		int carry=0;

		Node l1=ll.head;
		Node l2=ll1.head;
		
		while(l1!=null && l2!=null){
			int digit=l1.data + l2.data + carry;
			
			sum=digit%10;
			carry=digit/10;			
			
			ll2.add(sum);			
		
			l1=l1.next;
			l2=l2.next;
		}
		while(l1!=null){
			int digit=l1.data + carry;

                        sum=digit%10;
                        carry=digit/10;

                        ll2.add(sum);

                        l1=l1.next;
    
		}
		while(l2!=null){
                        int digit=l2.data + carry;

                        sum=digit%10;
                        carry=digit/10;

                        ll2.add(sum);

                        l2=l2.next;

                }
		if(carry!=0){
			ll2.add(carry);
		}

		//ll2.reverse();

		ll2.print();

	}
}
