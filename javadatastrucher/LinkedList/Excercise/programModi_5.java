/*
 * Given two numbers represented by two linked lists, write a function that returns a Sum list. The
sum list is a linked list representation of addition of two input numbers.
Example 1:
Input:
S1 = 3, S2 = 3
ValueS1 = {2,3,4}
ValueS2 = {3,4,5}
Output: 5 7 9
Explanation: After adding the 2 numbers the resultant number is 5 7 9.
*/
class Node{
	Node pre=null;
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
			head.pre=newnode;
			newnode.next=head;
			head=newnode;
		}
	}

	void print(){
		

		if(head==null){
			System.out.println("LinkedList is Empty");
		}else{
			Node temp=head;

			while(temp!=null){

				System.out.print(temp.data+" ");
				temp=temp.next;
			}System.out.println();	
		}
	}
}

class Sum{

	static Linkedlist sum(Linkedlist l1,Linkedlist l2){
			
		Linkedlist l3=new Linkedlist();

		int sum=0;
		int carry=0;

		Node temp1=l1.head;
		Node temp2=l2.head;

		while(temp1.next!=null){
			temp1=temp1.next;
		}

		while(temp2.next!=null){
                        temp2=temp2.next;
                }

		while(temp1!=null && temp2!=null){
			
			int digit=temp1.data+temp2.data+carry;

			sum=digit%10;
			carry=digit/10;

			l3.add(sum);

			temp1=temp1.pre;
			temp2=temp2.pre;
		}

		 while(temp1!=null){

                        int digit=temp1.data+carry;

                        sum=digit%10;
                        carry=digit/10;

                        l3.add(sum);
			temp1=temp1.pre;

                }

		 while(temp2!=null){

                        int digit=temp2.data+carry;

                        sum=digit%10;
                        carry=digit/10;

                        l3.add(sum);

                        temp2=temp2.pre;
                }

		if(carry!=0){
			l3.add(carry);
		}

		return l3;
	}
	public static void main(String args[]){
	
		Linkedlist l1=new Linkedlist();
		  l1.add(4);
		  l1.add(3);
		  l1.add(2);

		Linkedlist l2=new Linkedlist();
		 l2.add(5);
		 l2.add(4);
		 l2.add(3);
		
		l1.print();
		l2.print();
		
		System.out.println("Ans :");
		Linkedlist l3=sum(l1,l2);
		l3.print();

	}
}
