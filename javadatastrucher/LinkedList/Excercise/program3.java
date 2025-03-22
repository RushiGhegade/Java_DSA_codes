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
	Node head1=null;

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
	void addlast(int data){
                Node newnode=new Node(data);
                if(head1==null){
                        head1=newnode;
                }else{
                        Node temp=head1;

                        while(temp.next!=null){
                                temp=temp.next;
                        }

                        temp.next=newnode;

                }
        }
	void addFirst(int data){
		Node newnode = new Node( data);

		if(head==null){
			head1=newnode;
		}else{
			newnode.next=head1;
			head1=newnode;
		}
	}
	void print(int data){
		Node temp=null;
		if(data==0){
			temp=head;
		}else{
			temp=head1;
		}

		if(temp==null){
			System.out.println("Linkedlist is Empty");
		}else{
				
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
	void insertion(){
		Node pre=null;
		Node curr=head;

		while(curr!=null){
			if(curr.data==0){
				addFirst(pre.data);
			}else if(curr.data==1){
				addlast(pre.data);
			}

			pre=curr;
			curr=curr.next;
		}
	
	}

	/*void Insertion(){
		Node pre=head;
		Node op=head.next;

		while(op!=null){

			if(op.data==0){
				addFirst(pre.data);
			}else if(op.data==1){
				addlast(pre.data);
			}

			pre=pre.next;
			if(pre!=null)
				pre=pre.next;

			op=op.next;
                        if(op!=null)
                                op=op.next;
		}
	}*/
}

class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Linkedlist ll=new Linkedlist();
		ll.add(9);
		ll.add(0);
		ll.add(5);
		ll.add(1);
		ll.add(6);
		ll.add(1);
		ll.add(2);
		ll.add(0);
		ll.add(5);
                ll.add(0);
		
		ll.print(0);
		ll.insertion();
		ll.print(1);
			
	}
}
